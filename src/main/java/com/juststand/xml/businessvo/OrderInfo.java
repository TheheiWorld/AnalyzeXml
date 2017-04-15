package com.juststand.xml.businessvo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

/**
 * Created by juststand on 2017/4/10.
 */
public class OrderInfo {

    private String poOrderNumber;
    private String poSpecNumber;
    private String productOfferingId;
    private String siCode;
    private String hostCompany;
    private POOrderBusinesses poOrderBusinesses;
    private String businessMode;
    private POOrderCharge poOrderCharge;
    private List<POOrderRatePolicy> poOrderRatePolicys;
    private String poRatePolicyEffRule;
    private List<ProductOrderInfo> productOrders;
    private String busNeedDegree;
    private POAttachment poAttachment;
    private POAudit poAudit;
    private ContactorInfo contactorInfo;
    private String finishTime;
    private String notes;
    private String timeStamp;

    @XmlElement(name = "POOrderNumber")
    public String getPoOrderNumber() {
        return poOrderNumber;
    }

    public void setPoOrderNumber(String poOrderNumber) {
        this.poOrderNumber = poOrderNumber;
    }

    @XmlElement(name = "POSpecNumber")
    public String getPoSpecNumber() {
        return poSpecNumber;
    }

    public void setPoSpecNumber(String poSpecNumber) {
        this.poSpecNumber = poSpecNumber;
    }

    @XmlElement(name = "ProductOfferingID")
    public String getProductOfferingId() {
        return productOfferingId;
    }

    public void setProductOfferingId(String productOfferingId) {
        this.productOfferingId = productOfferingId;
    }

    @XmlElement(name = "SICode")
    public String getSiCode() {
        return siCode;
    }

    public void setSiCode(String siCode) {
        this.siCode = siCode;
    }

    @XmlElement(name = "HostCompany")
    public String getHostCompany() {
        return hostCompany;
    }

    public void setHostCompany(String hostCompany) {
        this.hostCompany = hostCompany;
    }

    @XmlElement(name = "POOrderBusinesses")
    public POOrderBusinesses getPoOrderBusinesses() {
        return poOrderBusinesses;
    }

    public void setPoOrderBusinesses(POOrderBusinesses poOrderBusinesses) {
        this.poOrderBusinesses = poOrderBusinesses;
    }

    @XmlElement(name = "BusinessMode")
    public String getBusinessMode() {
        return businessMode;
    }

    public void setBusinessMode(String businessMode) {
        this.businessMode = businessMode;
    }

    @XmlElement(name = "POOrderCharge")
    public POOrderCharge getPoOrderCharge() {
        return poOrderCharge;
    }

    public void setPoOrderCharge(POOrderCharge poOrderCharge) {
        this.poOrderCharge = poOrderCharge;
    }

    @XmlElementWrapper(name = "POOrderRatePolicys")
    @XmlElement(name = "POOrderRatePolicy")
    public List<POOrderRatePolicy> getPoOrderRatePolicys() {
        return poOrderRatePolicys;
    }

    public void setPoOrderRatePolicys(List<POOrderRatePolicy> poOrderRatePolicys) {
        this.poOrderRatePolicys = poOrderRatePolicys;
    }

    @XmlElement(name = "PORatePolicyEffRule")
    public String getPoRatePolicyEffRule() {
        return poRatePolicyEffRule;
    }

    public void setPoRatePolicyEffRule(String poRatePolicyEffRule) {
        this.poRatePolicyEffRule = poRatePolicyEffRule;
    }

    @XmlElementWrapper(name = "ProductOrders")
    @XmlElement(name = "ProductOrderInfo")
    public List<ProductOrderInfo> getProductOrders() {
        return productOrders;
    }

    public void setProductOrders(List<ProductOrderInfo> productOrders) {
        this.productOrders = productOrders;
    }

    @XmlElement(name = "BusNeedDegree")
    public String getBusNeedDegree() {
        return busNeedDegree;
    }

    public void setBusNeedDegree(String busNeedDegree) {
        this.busNeedDegree = busNeedDegree;
    }

    @XmlElement(name = "POAttachment")
    public POAttachment getPoAttachment() {
        return poAttachment;
    }

    public void setPoAttachment(POAttachment poAttachment) {
        this.poAttachment = poAttachment;
    }

    @XmlElement(name = "POAudit")
    public POAudit getPoAudit() {
        return poAudit;
    }

    public void setPoAudit(POAudit poAudit) {
        this.poAudit = poAudit;
    }

    @XmlElement(name = "ContactorInfo")
    public ContactorInfo getContactorInfo() {
        return contactorInfo;
    }

    public void setContactorInfo(ContactorInfo contactorInfo) {
        this.contactorInfo = contactorInfo;
    }

    @XmlElement(name = "FinishTime")
    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    @XmlElement(name = "Notes")
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @XmlElement(name = "TimeStamp")
    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "poOrderNumber='" + poOrderNumber + '\'' +
                ", poSpecNumber='" + poSpecNumber + '\'' +
                ", productOfferingId='" + productOfferingId + '\'' +
                ", siCode='" + siCode + '\'' +
                ", hostCompany='" + hostCompany + '\'' +
                ", poOrderBusinesses=" + poOrderBusinesses +
                ", businessMode='" + businessMode + '\'' +
                ", poOrderCharge=" + poOrderCharge +
                ", poOrderRatePolicys=" + poOrderRatePolicys +
                ", poRatePolicyEffRule='" + poRatePolicyEffRule + '\'' +
                ", productOrders=" + productOrders +
                ", busNeedDegree='" + busNeedDegree + '\'' +
                ", poAttachment=" + poAttachment +
                ", poAudit=" + poAudit +
                ", contactorInfo=" + contactorInfo +
                ", finishTime='" + finishTime + '\'' +
                ", notes='" + notes + '\'' +
                ", timeStamp='" + timeStamp + '\'' +
                '}';
    }
}
