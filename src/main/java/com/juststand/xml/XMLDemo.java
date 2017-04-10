package com.juststand.xml;

import com.juststand.xml.domain.InterBOSS;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;
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
        String xml = document.asXML();

        JAXBContext context = JAXBContext.newInstance(InterBOSS.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        InterBOSS interBoss = (InterBOSS) unmarshaller.unmarshal(new StringReader(xml));
        //System.out.println(interBoss.getSvcCont().getOrderInfoReq().getOrderInfo().getPoOrderRatePolicys());
        System.out.println(interBoss.toString());
    }

}
