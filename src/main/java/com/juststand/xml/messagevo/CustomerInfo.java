package com.juststand.xml.messagevo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

/**
 * Created by juststand on 2017/4/13.
 */
public class CustomerInfo {

    private String parentCustomerNumber;
    private String action;
    private String operTime;

    private Customer customer;
    private CustomerManager customerManager;
    private ExtInfo extInfo;

    private List<KeyPerson> keyPersons;

    public CustomerInfo() {
    }

    public CustomerInfo(String parentCustomerNumber, String action, String operTime, Customer customer,
                        CustomerManager customerManager, ExtInfo extInfo, List<KeyPerson> keyPersons) {
        this.parentCustomerNumber = parentCustomerNumber;
        this.action = action;
        this.operTime = operTime;
        this.customer = customer;
        this.customerManager = customerManager;
        this.extInfo = extInfo;
        this.keyPersons = keyPersons;
    }

    @XmlElement(name = "ParentCustomerNumber")
    public String getParentCustomerNumber() {
        return parentCustomerNumber;
    }

    public void setParentCustomerNumber(String parentCustomerNumber) {
        this.parentCustomerNumber = parentCustomerNumber;
    }

    @XmlElement(name = "Action")
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }


    @XmlElement(name = "OperTime")
    public String getOperTime() {
        return operTime;
    }

    public void setOperTime(String operTime) {
        this.operTime = operTime;
    }


    @XmlElement(name = "Customer")
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @XmlElement(name = "CustomerManager")
    public CustomerManager getCustomerManager() {
        return customerManager;
    }

    public void setCustomerManager(CustomerManager customerManager) {
        this.customerManager = customerManager;
    }

    @XmlElement(name = "ExtInfo")
    public ExtInfo getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(ExtInfo extInfo) {
        this.extInfo = extInfo;
    }

    @XmlElementWrapper(name = "KeyPersons")
    @XmlElement(name = "KeyPerson")
    public List<KeyPerson> getKeyPersons() {
        return keyPersons;
    }

    public void setKeyPersons(List<KeyPerson> keyPersons) {
        this.keyPersons = keyPersons;
    }

    @Override
    public String toString() {
        return "CustomerInfo{" +
                "parentCustomerNumber='" + parentCustomerNumber + '\'' +
                ", action='" + action + '\'' +
                ", operTime='" + operTime + '\'' +
                ", customer=" + customer +
                ", customerManager=" + customerManager +
                ", extInfo=" + extInfo +
                ", keyPersons=" + keyPersons +
                '}';
    }
}
