package com.juststand.xml.messagevo;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by juststand on 2017/4/13.
 */
public class CustomerManager {

    private String staffNumber;
    private String staffName;
    private String contactPhone;
    private String mobilePhone;
    private String contactFax;
    private String email;
    private String leaderName;
    private String leaderTel;

    @XmlElement(name = "StaffNumber")
    public String getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(String staffNumber) {
        this.staffNumber = staffNumber;
    }

    @XmlElement(name = "StaffName")
    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    @XmlElement(name = "ContactPhone")
    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    @XmlElement(name = "MobilePhone")
    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    @XmlElement(name = "ContactFax")
    public String getContactFax() {
        return contactFax;
    }

    public void setContactFax(String contactFax) {
        this.contactFax = contactFax;
    }

    @XmlElement(name = "E_mail")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlElement(name = "LeaderName")
    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    @XmlElement(name = "LeaderTel")
    public String getLeaderTel() {
        return leaderTel;
    }

    public void setLeaderTel(String leaderTel) {
        this.leaderTel = leaderTel;
    }

    @Override
    public String toString() {
        return "CustomerManager{" +
                "staffNumber='" + staffNumber + '\'' +
                ", staffName='" + staffName + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", contactFax='" + contactFax + '\'' +
                ", email='" + email + '\'' +
                ", leaderName='" + leaderName + '\'' +
                ", leaderTel='" + leaderTel + '\'' +
                '}';
    }
}
