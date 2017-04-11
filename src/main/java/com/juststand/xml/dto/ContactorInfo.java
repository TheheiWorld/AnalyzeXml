package com.juststand.xml.dto;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by juststand on 2017/4/10.
 */
public class ContactorInfo {

    private String contactorType;
    private String contactorName;
    private String contactorPhone;
    private String staffNumber;

    @XmlElement(name = "ContactorType")
    public String getContactorType() {
        return contactorType;
    }

    public void setContactorType(String contactorType) {
        this.contactorType = contactorType;
    }

    @XmlElement(name = "ContactorName")
    public String getContactorName() {
        return contactorName;
    }

    public void setContactorName(String contactorName) {
        this.contactorName = contactorName;
    }

    @XmlElement(name = "ContactorPhone")
    public String getContactorPhone() {
        return contactorPhone;
    }

    public void setContactorPhone(String contactorPhone) {
        this.contactorPhone = contactorPhone;
    }

    @XmlElement(name = "StaffNumber")
    public String getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(String staffNumber) {
        this.staffNumber = staffNumber;
    }

    @Override
    public String toString() {
        return "ContactorInfo{" +
                "contactorType='" + contactorType + '\'' +
                ", contactorName='" + contactorName + '\'' +
                ", contactorPhone='" + contactorPhone + '\'' +
                ", staffNumber='" + staffNumber + '\'' +
                '}';
    }
}
