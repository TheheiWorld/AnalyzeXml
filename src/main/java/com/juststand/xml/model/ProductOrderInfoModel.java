package com.juststand.xml.model;

/**
 * Created by juststand on 2017/4/15.
 */
public class ProductOrderInfoModel {

    private long id;
    private long orderInfoReqModelId;
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
    private String productOrderChargeCode;
    private long productOrderChargeValue;
    private String operationSubTypeId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getOrderInfoReqModelId() {
        return orderInfoReqModelId;
    }

    public void setOrderInfoReqModelId(long orderInfoReqModelId) {
        this.orderInfoReqModelId = orderInfoReqModelId;
    }

    public String getProductOrderNumber() {
        return productOrderNumber;
    }

    public void setProductOrderNumber(String productOrderNumber) {
        this.productOrderNumber = productOrderNumber;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getSiCode() {
        return siCode;
    }

    public void setSiCode(String siCode) {
        this.siCode = siCode;
    }

    public String getProductSpecNumber() {
        return productSpecNumber;
    }

    public void setProductSpecNumber(String productSpecNumber) {
        this.productSpecNumber = productSpecNumber;
    }

    public String getAccessNumber() {
        return accessNumber;
    }

    public void setAccessNumber(String accessNumber) {
        this.accessNumber = accessNumber;
    }

    public String getPriAccessNumber() {
        return priAccessNumber;
    }

    public void setPriAccessNumber(String priAccessNumber) {
        this.priAccessNumber = priAccessNumber;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getServiceLevelID() {
        return serviceLevelID;
    }

    public void setServiceLevelID(String serviceLevelID) {
        this.serviceLevelID = serviceLevelID;
    }

    public String getProductOrderChargeCode() {
        return productOrderChargeCode;
    }

    public void setProductOrderChargeCode(String productOrderChargeCode) {
        this.productOrderChargeCode = productOrderChargeCode;
    }

    public long getProductOrderChargeValue() {
        return productOrderChargeValue;
    }

    public void setProductOrderChargeValue(long productOrderChargeValue) {
        this.productOrderChargeValue = productOrderChargeValue;
    }

    public String getOperationSubTypeId() {
        return operationSubTypeId;
    }

    public void setOperationSubTypeId(String operationSubTypeId) {
        this.operationSubTypeId = operationSubTypeId;
    }

    @Override
    public String toString() {
        return "ProductOrderInfoModel{" +
                "id=" + id +
                ", orderInfoReqModelId=" + orderInfoReqModelId +
                ", productOrderNumber='" + productOrderNumber + '\'' +
                ", productID='" + productID + '\'' +
                ", siCode='" + siCode + '\'' +
                ", productSpecNumber='" + productSpecNumber + '\'' +
                ", accessNumber='" + accessNumber + '\'' +
                ", priAccessNumber='" + priAccessNumber + '\'' +
                ", linkman='" + linkman + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", description='" + description + '\'' +
                ", serviceLevelID='" + serviceLevelID + '\'' +
                ", productOrderChargeCode='" + productOrderChargeCode + '\'' +
                ", productOrderChargeValue=" + productOrderChargeValue +
                ", operationSubTypeId='" + operationSubTypeId + '\'' +
                '}';
    }
}
