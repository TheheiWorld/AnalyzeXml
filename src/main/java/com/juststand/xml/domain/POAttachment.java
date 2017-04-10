package com.juststand.xml.domain;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by juststand on 2017/4/10.
 */
public class POAttachment {

    private long poAttType;
    private String poAttCode;
    private String contName;
    private String poAttName;
    private String contEffdate;
    private String contExpdate;
    private String isAutoRecont;
    private String recontExpdate;
    private String contFee;
    private String perferPlan;
    private String autoRecontCyc;
    private String isRecont;

    @XmlElement(name = "POAttType")
    public long getPoAttType() {
        return poAttType;
    }

    public void setPoAttType(long poAttType) {
        this.poAttType = poAttType;
    }

    @XmlElement(name = "POAttCode")
    public String getPoAttCode() {
        return poAttCode;
    }

    public void setPoAttCode(String poAttCode) {
        this.poAttCode = poAttCode;
    }

    @XmlElement(name = "ContName")
    public String getContName() {
        return contName;
    }

    public void setContName(String contName) {
        this.contName = contName;
    }

    @XmlElement(name = "POAttName")
    public String getPoAttName() {
        return poAttName;
    }

    public void setPoAttName(String poAttName) {
        this.poAttName = poAttName;
    }

    @XmlElement(name = "ContEffdate")
    public String getContEffdate() {
        return contEffdate;
    }

    public void setContEffdate(String contEffdate) {
        this.contEffdate = contEffdate;
    }

    @XmlElement(name = "ContExpdate")
    public String getContExpdate() {
        return contExpdate;
    }

    public void setContExpdate(String contExpdate) {
        this.contExpdate = contExpdate;
    }

    @XmlElement(name = "IsAutoRecont")
    public String getIsAutoRecont() {
        return isAutoRecont;
    }

    public void setIsAutoRecont(String isAutoRecont) {
        this.isAutoRecont = isAutoRecont;
    }

    @XmlElement(name = "RecontExpdate")
    public String getRecontExpdate() {
        return recontExpdate;
    }

    public void setRecontExpdate(String recontExpdate) {
        this.recontExpdate = recontExpdate;
    }

    @XmlElement(name = "ContFee")
    public String getContFee() {
        return contFee;
    }

    public void setContFee(String contFee) {
        this.contFee = contFee;
    }

    @XmlElement(name = "PerferPlan")
    public String getPerferPlan() {
        return perferPlan;
    }

    public void setPerferPlan(String perferPlan) {
        this.perferPlan = perferPlan;
    }

    @XmlElement(name = "AutoRecontCyc")
    public String getAutoRecontCyc() {
        return autoRecontCyc;
    }

    public void setAutoRecontCyc(String autoRecontCyc) {
        this.autoRecontCyc = autoRecontCyc;
    }

    @XmlElement(name = "IsRecont")
    public String getIsRecont() {
        return isRecont;
    }

    public void setIsRecont(String isRecont) {
        this.isRecont = isRecont;
    }

    @Override
    public String toString() {
        return "POAttachment{" +
                "poAttType=" + poAttType +
                ", poAttCode='" + poAttCode + '\'' +
                ", contName='" + contName + '\'' +
                ", poAttName='" + poAttName + '\'' +
                ", contEffdate='" + contEffdate + '\'' +
                ", contExpdate='" + contExpdate + '\'' +
                ", isAutoRecont='" + isAutoRecont + '\'' +
                ", recontExpdate='" + recontExpdate + '\'' +
                ", contFee='" + contFee + '\'' +
                ", perferPlan='" + perferPlan + '\'' +
                ", autoRecontCyc='" + autoRecontCyc + '\'' +
                ", isRecont='" + isRecont + '\'' +
                '}';
    }
}
