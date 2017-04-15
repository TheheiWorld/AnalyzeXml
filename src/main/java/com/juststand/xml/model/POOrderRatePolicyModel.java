package com.juststand.xml.model;

/**
 * Created by juststand on 2017/4/15.
 */
public class POOrderRatePolicyModel {

    private long id;
    private long customerInfoModelId;
    private String poSpecRatePolicyID;
    private String name;
    private String action;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCustomerInfoModelId() {
        return customerInfoModelId;
    }

    public void setCustomerInfoModelId(long customerInfoModelId) {
        this.customerInfoModelId = customerInfoModelId;
    }

    public String getPoSpecRatePolicyID() {
        return poSpecRatePolicyID;
    }

    public void setPoSpecRatePolicyID(String poSpecRatePolicyID) {
        this.poSpecRatePolicyID = poSpecRatePolicyID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "POOrderRatePolicyModel{" +
                "id=" + id +
                ", customerInfoModelId=" + customerInfoModelId +
                ", poSpecRatePolicyID='" + poSpecRatePolicyID + '\'' +
                ", name='" + name + '\'' +
                ", action='" + action + '\'' +
                '}';
    }
}
