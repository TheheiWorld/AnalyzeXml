package com.juststand.xml.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

/**
 * Created by juststand on 2017/4/10.
 */
public class POOrderRatePolicy {

    private String poSpecRatePolicyID;
    private String name;
    private String action;
    private List<RatePlan> ratePlans;

    @XmlElement(name = "POSpecRatePolicyID")
    public String getPoSpecRatePolicyID() {
        return poSpecRatePolicyID;
    }

    public void setPoSpecRatePolicyID(String poSpecRatePolicyID) {
        this.poSpecRatePolicyID = poSpecRatePolicyID;
    }

    @XmlElement(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "Action")
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @XmlElementWrapper(name = "RatePlans")
    @XmlElement(name = "RatePlan")
    public List<RatePlan> getRatePlans() {
        return ratePlans;
    }

    public void setRatePlans(List<RatePlan> ratePlans) {
        this.ratePlans = ratePlans;
    }

    @Override
    public String toString() {
        return "POOrderRatePolicy{" +
                "poSpecRatePolicyID='" + poSpecRatePolicyID + '\'' +
                ", name='" + name + '\'' +
                ", action='" + action + '\'' +
                ", ratePlans=" + ratePlans +
                '}';
    }
}
