package com.juststand.xml.businessvo;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by juststand on 2017/4/10.
 */
public class OrderInfoReq {

    private String orderSourceID;
    private String customerNumber;
    private OrderInfo orderInfo;

    @XmlElement(name = "OrderSourceID")
    public String getOrderSourceID() {
        return orderSourceID;
    }

    public void setOrderSourceID(String orderSourceID) {
        this.orderSourceID = orderSourceID;
    }

    @XmlElement(name = "CustomerNumber")
    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    @XmlElement(name = "OrderInfo")
    public OrderInfo getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
    }

    @Override
    public String toString() {
        return "OrderInfoReq{" +
                "orderSourceID='" + orderSourceID + '\'' +
                ", customerNumber='" + customerNumber + '\'' +
                ", orderInfo=" + orderInfo +
                '}';
    }
}
