package com.juststand.xml;

import com.juststand.xml.businessvo.*;
import com.juststand.xml.businessvo.InterBOSS;
import com.juststand.xml.createData.CreateData;
import com.juststand.xml.createData.DataFactory;
import com.juststand.xml.messagevo.*;
import com.juststand.xml.messagevo.SvcCont;
import com.juststand.xml.model.*;
import org.apache.commons.beanutils.BeanUtils;
import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    @Test
    public void toXML () {
        // 获取数据
        CreateData data = new CreateData();
        OrderInfoReqModel orderInfoReqModel = data.getOrderInfoReqModel();

        // 创建OrderInfoReq 对象
        OrderInfoReq orderInfoReq = new OrderInfoReq();
        orderInfoReq.setOrderSourceID(orderInfoReqModel.getOrderSourceID());
        orderInfoReq.setCustomerNumber(orderInfoReqModel.getCustomerNumber());

        // 创建OrderInfo对象 并给其属性赋值
        OrderInfo orderInfo = new OrderInfo();
        POOrderBusinesses poOrderBusinesses = new POOrderBusinesses();
        poOrderBusinesses.setOperationSubTypeID(orderInfoReqModel.getOperationSubTypeID());
        orderInfo.setPoOrderBusinesses(poOrderBusinesses);

        POOrderCharge poOrderCharge = new POOrderCharge();
        poOrderCharge.setPoOrderChargeCode(orderInfoReqModel.getPoOrderChargeCode());
        poOrderCharge.setPoOrderChargeValue(orderInfoReqModel.getPoOrderChargeValue());
        orderInfo.setPoOrderCharge(poOrderCharge);

        POAttachment poAttachment = new POAttachment();
        try {
            BeanUtils.copyProperties(poAttachment,orderInfoReqModel);
            orderInfo.setPoAttachment(poAttachment);

            POAudit poAudit = new POAudit();
            poAudit.setAuditDesc(orderInfoReqModel.getAuditDesc());
            poAudit.setAuditor(orderInfoReqModel.getAuditor());
            poAudit.setAuditTime(orderInfoReqModel.getAuditTime());
            orderInfo.setPoAudit(poAudit);

            ContactorInfo contactorInfo = new ContactorInfo();
            BeanUtils.copyProperties(contactorInfo,orderInfoReqModel);
            orderInfo.setContactorInfo(contactorInfo);

            BeanUtils.copyProperties(orderInfo,orderInfoReqModel);

            // 集合属性
            long orderInfoReqModelId = orderInfoReqModel.getId();
            List<POOrderRatePolicyModel> poOrderRatePolicyModels = data.getPoOrderRatePolicyModels(orderInfoReqModelId);
            List<POOrderRatePolicy> poOrderRatePolicies = new ArrayList<POOrderRatePolicy>();
            if (poOrderRatePolicyModels != null && poOrderRatePolicyModels.size() > 0) {
                for (POOrderRatePolicyModel poOrderRatePolicyModel : poOrderRatePolicyModels) {
                    POOrderRatePolicy policy = new POOrderRatePolicy();
                    BeanUtils.copyProperties(policy,poOrderRatePolicyModel);

                    long poOrderRatePolicyModelId = poOrderRatePolicyModel.getId();
                    List<RatePlanModel> ratePlanModels = data.getRatePlanModels(poOrderRatePolicyModelId);
                    if (ratePlanModels != null && ratePlanModels.size() > 0) {
                        List<RatePlan> ratePlans = new ArrayList<RatePlan>();
                        for (RatePlanModel ratePlanModel : ratePlanModels) {
                            RatePlan ratePlan = new RatePlan();
                            BeanUtils.copyProperties(ratePlan,ratePlanModel);

                            List<ProductOrderICBModel> productOrderICBModels = data.getProductOrderICBModels(ratePlanModel);
                            List<ProductOrderICB> productOrderICBS = forProductOrderICB(productOrderICBModels);
                            ratePlan.setProductOrderICBs(productOrderICBS);
                            ratePlans.add(ratePlan);
                        }
                        policy.setRatePlans(ratePlans);
                    }
                    poOrderRatePolicies.add(policy);
                }
            }
            orderInfo.setPoOrderRatePolicys(poOrderRatePolicies);

            List<ProductOrderInfoModel> productOrderInfoModels = data.getProductOrderInfoModels(orderInfoReqModelId);
            List<ProductOrderInfo> productOrderInfos = new ArrayList<ProductOrderInfo>();
            if (productOrderInfoModels != null && productOrderInfoModels.size() > 0) {
                for (ProductOrderInfoModel productOrderInfoModel : productOrderInfoModels) {
                    ProductOrderInfo info = new ProductOrderInfo();
                    ProductOrder order = new ProductOrder();
                    BeanUtils.copyProperties(order,productOrderInfoModel);
                    info.setProductOrder(order);

                    ProductOrderCharge charge = new ProductOrderCharge();
                    BeanUtils.copyProperties(charge,productOrderInfoModel);
                    info.setProductOrderCharge(charge);

                    ProductOrderBusinesses productOrderBusinesses = new ProductOrderBusinesses();
                    productOrderBusinesses.setOperationSubTypeId(productOrderInfoModel.getOperationSubTypeId());
                    info.setProductOrderBusinesses(productOrderBusinesses);

                    long productOrderInfoModelId = productOrderInfoModel.getId();
                    List<ProductOrderRatePlanModel> ratePlanModels = data.getProductOrderRatePlanModels(productOrderInfoModelId);
                    if (ratePlanModels != null && ratePlanModels.size() > 0) {
                        List<ProductOrderRatePlan> ratePlans = new ArrayList<ProductOrderRatePlan>();
                        for (ProductOrderRatePlanModel ratePlanModel : ratePlanModels) {
                            ProductOrderRatePlan ratePlan = new ProductOrderRatePlan();
                            BeanUtils.copyProperties(ratePlan,ratePlanModel);

                            List<ProductOrderICBModel> icbModels = data.getProductOrderICBModels(ratePlanModel);
                            List<ProductOrderICB> productOrderICBS = forProductOrderICB(icbModels);
                            ratePlan.setProductOrderICBs(productOrderICBS);
                            ratePlans.add(ratePlan);
                        }
                        info.setProductOrderRatePlans(ratePlans);
                    }

                    List<PayCompanyModel> payCompanyModels = data.getPayCompanyModels(productOrderInfoModelId);
                    if (payCompanyModels != null && payCompanyModels.size() > 0) {
                        ArrayList<PayCompany> companies = new ArrayList<PayCompany>();
                        for (PayCompanyModel payCompanyModel : payCompanyModels) {
                            PayCompany company = new PayCompany();
                            BeanUtils.copyProperties(company,payCompanyModel);
                            companies.add(company);
                        }
                        info.setPayCompanys(companies);
                    }

                    List<ProductOrderCharacterModel> characterModels = data.getProductOrderCharacterModels(productOrderInfoModelId);
                    if (characterModels != null && characterModels.size() > 0) {
                        List<ProductOrderCharacter> characters = new ArrayList<ProductOrderCharacter>();
                        for (ProductOrderCharacterModel characterModel : characterModels) {
                            ProductOrderCharacter character = new ProductOrderCharacter();
                            BeanUtils.copyProperties(character,characterModel);
                            characters.add(character);
                        }
                        info.setProductOrderCharacters(characters);
                    }
                    productOrderInfos.add(info);
                }
            }

            orderInfo.setProductOrders(productOrderInfos);
            orderInfoReq.setOrderInfo(orderInfo);
            InterBOSS interBOSS = new InterBOSS();
            com.juststand.xml.businessvo.SvcCont svcCont = new com.juststand.xml.businessvo.SvcCont();
            svcCont.setOrderInfoReq(orderInfoReq);
            interBOSS.setSvcCont(svcCont);

            String fileName = "C:\\Users\\juststand\\Desktop\\BusinessTwo.xml";
            voToXml(interBOSS,fileName);

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

    private List<ProductOrderICB> forProductOrderICB (List<ProductOrderICBModel> productOrderICBModels)
            throws InvocationTargetException, IllegalAccessException {
        List<ProductOrderICB> productOrderICBS = new ArrayList<ProductOrderICB>();
        if (productOrderICBModels != null && productOrderICBModels.size() > 0) {
            for (ProductOrderICBModel productOrderICBModel : productOrderICBModels) {
                ProductOrderICB productOrderICB = new ProductOrderICB();
                BeanUtils.copyProperties(productOrderICB,productOrderICBModel);
                productOrderICBS.add(productOrderICB);
            }
        }
        return productOrderICBS;
    }

    @Test
    public void test () {
        try {
            Object data = DataFactory.createData("com.juststand.xml.model.ProductOrderICBModel");
            System.out.println(data);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

}
