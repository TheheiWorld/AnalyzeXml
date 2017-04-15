package com.juststand.xml.businessvo;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by juststand on 2017/4/10.
 */
public class ProductOrderBusinesses {

    private String operationSubTypeId;

    @XmlElement(name = "OperationSubTypeID")
    public String getOperationSubTypeId() {
        return operationSubTypeId;
    }

    public void setOperationSubTypeId(String operationSubTypeId) {
        this.operationSubTypeId = operationSubTypeId;
    }

    @Override
    public String toString() {
        return "ProductOrderBusinesses{" +
                "operationSubTypeId='" + operationSubTypeId + '\'' +
                '}';
    }
}
