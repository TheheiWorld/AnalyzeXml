package com.juststand.xml.businessvo;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by juststand on 2017/4/10.
 */
public class ProductOrder {

    private String productOrderNumber;
    private String productID;
    private String siCode;
    private String productSpecNumber;
    private String accessNumber;
    private String priAccessNumber;
    private String linkman;
    private String contactPhone;
    private String description;
    private String serviceLevelID;

    @XmlElement(name = "ProductOrderNumber")
    public String getProductOrderNumber() {
        return productOrderNumber;
    }

    public void setProductOrderNumber(String productOrderNumber) {
        this.productOrderNumber = productOrderNumber;
    }

    @XmlElement(name = "ProductID")
    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    @XmlElement(name = "SICode")
    public String getSiCode() {
        return siCode;
    }

    public void setSiCode(String siCode) {
        this.siCode = siCode;
    }

    @XmlElement(name = "ProductSpecNumber")
    public String getProductSpecNumber() {
        return productSpecNumber;
    }

    public void setProductSpecNumber(String productSpecNumber) {
        this.productSpecNumber = productSpecNumber;
    }

    @XmlElement(name = "AccessNumber")
    public String getAccessNumber() {
        return accessNumber;
    }

    public void setAccessNumber(String accessNumber) {
        this.accessNumber = accessNumber;
    }

    @XmlElement(name = "PriAccessNumber")
    public String getPriAccessNumber() {
        return priAccessNumber;
    }

    public void setPriAccessNumber(String priAccessNumber) {
        this.priAccessNumber = priAccessNumber;
    }

    @XmlElement(name = "Linkman")
    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    @XmlElement(name = "ContactPhone")
    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    @XmlElement(name = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlElement(name = "ServiceLevelID")
    public String getServiceLevelID() {
        return serviceLevelID;
    }

    public void setServiceLevelID(String serviceLevelID) {
        this.serviceLevelID = serviceLevelID;
    }

    @Override
    public String toString() {
        return "ProductOrder{" +
                "productOrderNumber='" + productOrderNumber + '\'' +
                ", productID='" + productID + '\'' +
                ", siCode='" + siCode + '\'' +
                ", productSpecNumber='" + productSpecNumber + '\'' +
                ", accessNumber='" + accessNumber + '\'' +
                ", priAccessNumber='" + priAccessNumber + '\'' +
                ", linkman='" + linkman + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", description='" + description + '\'' +
                ", serviceLevelID='" + serviceLevelID + '\'' +
                '}';
    }
}
