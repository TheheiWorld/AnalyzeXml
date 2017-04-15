package com.juststand.xml.model;

/**
 * Created by juststand on 2017/4/15.
 */
public class RatePlanModel {

    private long id;
    private long poOrderRatePolicyModelId;
    private String ratePlanID;
    private String action;
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPoOrderRatePolicyModelId() {
        return poOrderRatePolicyModelId;
    }

    public void setPoOrderRatePolicyModelId(long poOrderRatePolicyModelId) {
        this.poOrderRatePolicyModelId = poOrderRatePolicyModelId;
    }

    public String getRatePlanID() {
        return ratePlanID;
    }

    public void setRatePlanID(String ratePlanID) {
        this.ratePlanID = ratePlanID;
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
        return "RatePlanModel{" +
                "id=" + id +
                ", poOrderRatePolicyModelId=" + poOrderRatePolicyModelId +
                ", ratePlanID='" + ratePlanID + '\'' +
                ", action='" + action + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
