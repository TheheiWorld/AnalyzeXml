package com.juststand.xml.dto;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by juststand on 2017/4/10.
 */
public class POOrderBusinesses {

    private String operationSubTypeID;

    @XmlElement(name = "OperationSubTypeID")
    public String getOperationSubTypeID() {
        return operationSubTypeID;
    }

    public void setOperationSubTypeID(String operationSubTypeID) {
        this.operationSubTypeID = operationSubTypeID;
    }

    @Override
    public String toString() {
        return "POOrderBusinesses{" +
                "operationSubTypeID='" + operationSubTypeID + '\'' +
                '}';
    }
}
