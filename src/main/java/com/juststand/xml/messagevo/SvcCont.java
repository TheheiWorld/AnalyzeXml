package com.juststand.xml.messagevo;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by juststand on 2017/4/13.
 */
public class SvcCont {

    private CustomerInfo customerInfo;

    @XmlElement(name = "CustomerInfo")
    public CustomerInfo getCustomerInfo() {
        return customerInfo;
    }

    public void setCustomerInfo(CustomerInfo customerInfo) {
        this.customerInfo = customerInfo;
    }

    @Override
    public String toString() {
        return "SvcCont{" +
                "customerInfo=" + customerInfo +
                '}';
    }
}
