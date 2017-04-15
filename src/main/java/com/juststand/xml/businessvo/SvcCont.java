package com.juststand.xml.businessvo;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by juststand on 2017/4/10.
 */
public class SvcCont {

    private OrderInfoReq orderInfoReq;

    @XmlElement(name = "OrderInfoReq")
    public OrderInfoReq getOrderInfoReq() {
        return orderInfoReq;
    }

    public void setOrderInfoReq(OrderInfoReq orderInfoReq) {
        this.orderInfoReq = orderInfoReq;
    }

    @Override
    public String toString() {
        return "SvcCont{" +
                "orderInfoReq=" + orderInfoReq +
                '}';
    }
}
