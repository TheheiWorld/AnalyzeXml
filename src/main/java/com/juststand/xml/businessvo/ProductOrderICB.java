package com.juststand.xml.businessvo;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by juststand on 2017/4/10.
 */
public class ProductOrderICB {

    private String parameterNumber;
    private String parameterName;
    private long parameterValue;

    @XmlElement(name = "ParameterNumber")
    public String getParameterNumber() {
        return parameterNumber;
    }

    public void setParameterNumber(String parameterNumber) {
        this.parameterNumber = parameterNumber;
    }

    @XmlElement(name = "ParameterName")
    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    @XmlElement(name = "ParameterValue")
    public long getParameterValue() {
        return parameterValue;
    }

    public void setParameterValue(long parameterValue) {
        this.parameterValue = parameterValue;
    }

    @Override
    public String toString() {
        return "ProductOrderICB{" +
                "parameterNumber='" + parameterNumber + '\'' +
                ", parameterName='" + parameterName + '\'' +
                ", parameterValue=" + parameterValue +
                '}';
    }
}
