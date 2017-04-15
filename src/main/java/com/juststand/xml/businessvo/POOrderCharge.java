package com.juststand.xml.businessvo;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by juststand on 2017/4/10.
 */
public class POOrderCharge {

    private String poOrderChargeCode;
    private long poOrderChargeValue;

    @XmlElement(name = "POOrderChargeCode")
    public String getPoOrderChargeCode() {
        return poOrderChargeCode;
    }

    public void setPoOrderChargeCode(String poOrderChargeCode) {
        this.poOrderChargeCode = poOrderChargeCode;
    }

    @XmlElement(name = "POOrderChargeValue")
    public long getPoOrderChargeValue() {
        return poOrderChargeValue;
    }

    public void setPoOrderChargeValue(long poOrderChargeValue) {
        this.poOrderChargeValue = poOrderChargeValue;
    }

    @Override
    public String toString() {
        return "POOrderCharge{" +
                "poOrderChargeCode='" + poOrderChargeCode + '\'' +
                ", poOrderChargeValue=" + poOrderChargeValue +
                '}';
    }
}
