package com.juststand.xml;

import com.alibaba.fastjson.JSON;
import com.juststand.xml.domain.InterBOSS;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileWriter;
import java.io.StringReader;
import java.util.*;

/**
 * Created by juststand on 2017/4/10.
 */

public class XMLDemo {

    private Map<String, Object> map = new LinkedHashMap<String, Object>();
    @Test
    public void analyzeXml () throws Exception {
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("C:\\Users\\juststand\\Desktop\\Business.xml"));
        Element rootElement = document.getRootElement();
        analyzeElement(rootElement);
        System.out.println(map.size());
        Set<Map.Entry<String,Object>> entrySet = map.entrySet();
        for (Map.Entry<String, Object> entry : entrySet) {
            System.out.println(entry.getKey()+":" + entry.getValue().toString());
        }
    }

    @SuppressWarnings("unchecked")
    private Object analyzeElement(Element element) {

        List<Element> elements = element.elements();
        Element parent = element.getParent();
        String parentName = "";
        if (parent != null) {
            parentName = parent.getName();
        }
        if (elements == null || elements.size() == 0) {
            map.put(parentName +":"+element.getName(), element.getData());
            return element;
        }else {
            map.put(parentName + ":" +element.getName(),"model");
            for (Element e : elements) {
                analyzeElement(e);
            }
        }
        return null;
    }

    @Test
    public void  analyzeXmlTest () throws Exception {
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("C:\\Users\\juststand\\Desktop\\Business.xml"));
        // xml 文件转成 字符串
        String xml = document.asXML();

        JAXBContext context = JAXBContext.newInstance(InterBOSS.class);
        //字符串转成对象
        Unmarshaller unmarshaller = context.createUnmarshaller();
        InterBOSS interBoss = (InterBOSS) unmarshaller.unmarshal(new StringReader(xml));
        System.out.println(JSON.toJSONString(interBoss));

        //对象转成xml文件
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
        String fileName = "C:\\Users\\juststand\\Desktop\\BusinessTwo.xml";
        FileWriter fileWriter = new FileWriter(fileName);
        marshaller.marshal(interBoss,fileWriter);
        fileWriter.close();
    }

}
