package com.juststand.xml;

import com.juststand.xml.createData.CreateData;
import com.juststand.xml.dto.InterBOSS;
import com.juststand.xml.messagevo.*;
import com.juststand.xml.model.CustomerInfoModel;
import com.juststand.xml.model.ExtInfoModel;
import com.juststand.xml.model.KeyPersonModel;
import org.apache.commons.beanutils.BeanUtils;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

/**
 * Created by juststand on 2017/4/10.
 */

public class XMLDemo {

    @Test
    public void  analyzeXmlTest () throws Exception {
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("C:\\Users\\juststand\\Desktop\\Business.xml"));
        // xml 文件转成 字符串
        String xml = document.asXML();
        System.out.println(xml);

        JAXBContext context = JAXBContext.newInstance(InterBOSS.class);
        //字符串转成对象
        Unmarshaller unmarshaller = context.createUnmarshaller();
        InterBOSS interBoss = (InterBOSS) unmarshaller.unmarshal(new StringReader(xml));
        System.out.println(interBoss);

        //对象转成xml文件
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
        String fileName = "C:\\Users\\juststand\\Desktop\\BusinessTwo.xml";
        FileWriter fileWriter = new FileWriter(fileName);
        marshaller.marshal(interBoss,fileWriter);
        fileWriter.close();
    }

    @Test
    public void uploadXml () {
        //造数据
        CreateData data = new CreateData();
        CustomerInfoModel customerInfoModel = data.getCustomerInfoModel();

        // 赋值Customer 和 CustomerManager
        Customer customer = new Customer();
        CustomerManager customerManager = new CustomerManager();
        try {
            BeanUtils.copyProperties(customer,customerInfoModel);
            BeanUtils.copyProperties(customerManager,customerInfoModel);

            long customerInfoModelId = customerInfoModel.getId();
            // 解析KeyPerson
            List<KeyPersonModel> keyPersonModels = data.getKeyPersons(customerInfoModelId);
            List<KeyPerson> list = new ArrayList<KeyPerson>();
            for (KeyPersonModel keyPersonModel : keyPersonModels) {
                KeyPerson keyPerson = new KeyPerson();
                BeanUtils.copyProperties(keyPerson,keyPersonModel);
                list.add(keyPerson);
            }

            // 解析ExtInfo
            List<String> cmccPrdList = new ArrayList<String>();
            ExtInfoModel extInfoModel = data.getExtInfo(customerInfoModelId);
            ExtInfo extInfo = new ExtInfo();
            BeanUtils.copyProperties(extInfo,extInfoModel);
            String cmccPrds = extInfoModel.getCMCCPrds();
            if (cmccPrds != null && !"".equals(cmccPrds)) {
                String[] cmccPrd = cmccPrds.split(",");
                cmccPrdList = Arrays.asList(cmccPrd);
            }
            extInfo.setCMCCPrd(cmccPrdList);

            CustomerInfo customerInfo = new CustomerInfo(customerInfoModel.getParentCustomerNumber(),customerInfoModel.getAction(),
                    customerInfoModel.getOperTime(),customer,customerManager,extInfo,list);
            SvcCont svcCont = new SvcCont();
            svcCont.setCustomerInfo(customerInfo);
            com.juststand.xml.messagevo.InterBOSS boss = new com.juststand.xml.messagevo.InterBOSS();
            boss.setSvcCont(svcCont);

            String filePath = "C:\\Users\\juststand\\Desktop\\demo.xml";
            voToXml(boss,filePath);

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private <T> void voToXml ( T t ,String filePath) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(t.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
        File file = new File(filePath);
        if (!file.exists()) {
            FileWriter fileWriter = new FileWriter(file);
            marshaller.marshal(t,fileWriter);
            fileWriter.close();
            System.out.println("文件上传成功");
        }else {
            System.out.println("文件已存在");
        }
    }
}
