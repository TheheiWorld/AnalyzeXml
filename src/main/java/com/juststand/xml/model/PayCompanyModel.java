package com.juststand.xml.model;

/**
 * Created by juststand on 2017/4/15.
 */
public class PayCompanyModel {

    private long id;
    private long productOrderInfoModelId;
    private String payCompanyId;
    private String action;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProductOrderInfoModelId() {
        return productOrderInfoModelId;
    }

    public void setProductOrderInfoModelId(long productOrderInfoModelId) {
        this.productOrderInfoModelId = productOrderInfoModelId;
    }

    public String getPayCompanyId() {
        return payCompanyId;
    }

    public void setPayCompanyId(String payCompanyId) {
        this.payCompanyId = payCompanyId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "PayCompanyModel{" +
                "id=" + id +
                ", productOrderInfoModelId=" + productOrderInfoModelId +
                ", payCompanyId='" + payCompanyId + '\'' +
                ", action='" + action + '\'' +
                '}';
    }
}
