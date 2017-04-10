package com.juststand.xml.domain;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by juststand on 2017/4/10.
 */
public class PayCompany {
    private String payCompanyId;
    private String action;

    @XmlElement(name = "PayCompanyID")
    public String getPayCompanyId() {
        return payCompanyId;
    }

    public void setPayCompanyId(String payCompanyId) {
        this.payCompanyId = payCompanyId;
    }

    @XmlElement(name = "Action")
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "PayCompany{" +
                "payCompanyId='" + payCompanyId + '\'' +
                ", action='" + action + '\'' +
                '}';
    }
}
