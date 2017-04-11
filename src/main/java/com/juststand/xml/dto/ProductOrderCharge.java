package com.juststand.xml.dto;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by juststand on 2017/4/10.
 */
public class ProductOrderCharge {

    private String productOrderChargeCode;
    private long productOrderChargeValue;

    @XmlElement(name = "ProductOrderChargeCode")
    public String getProductOrderChargeCode() {
        return productOrderChargeCode;
    }

    public void setProductOrderChargeCode(String productOrderChargeCode) {
        this.productOrderChargeCode = productOrderChargeCode;
    }

    @XmlElement(name = "ProductOrderChargeValue")
    public long getProductOrderChargeValue() {
        return productOrderChargeValue;
    }

    public void setProductOrderChargeValue(long productOrderChargeValue) {
        this.productOrderChargeValue = productOrderChargeValue;
    }

    @Override
    public String toString() {
        return "ProductOrderCharge{" +
                "productOrderChargeCode='" + productOrderChargeCode + '\'' +
                ", productOrderChargeValue=" + productOrderChargeValue +
                '}';
    }
}
