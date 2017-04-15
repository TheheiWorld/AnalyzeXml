package com.juststand.xml.model;

/**
 * Created by juststand on 2017/4/15.
 */
public class ProductOrderRatePlanModel {

    private long id;
    private long productOrderInfoModelId;
    private String ratePlanId;
    private String action;
    private String description;

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

    public String getRatePlanId() {
        return ratePlanId;
    }

    public void setRatePlanId(String ratePlanId) {
        this.ratePlanId = ratePlanId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ProductOrderRatePlanModel{" +
                "id=" + id +
                ", productOrderInfoModelId=" + productOrderInfoModelId +
                ", ratePlanId='" + ratePlanId + '\'' +
                ", action='" + action + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
