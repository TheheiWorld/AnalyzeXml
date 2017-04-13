package com.juststand.xml.messagevo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

/**
 * Created by juststand on 2017/4/13.
 */
public class ExtInfo {

    private String hasITDept;
    private String iTDeptName;
    private String feeCae;
    private String feeCaseInfo;
    private Long ARPU;
    private Long aataARPU;
    private Long avgFee;
    private Long quota;
    private String rewardType;
    private String unicomTone;
    private String unicomData;
    private String trends;
    private Long mobileUser;
    private Long mobileRate;
    private String informationize;
    private String intergration;
    private String terminal;
    private String transProv;
    private String singlePay;
    private String mas;
    private List<String> CMCCPrd;

    @XmlElement(name = "HasITDept")
    public String getHasITDept() {
        return hasITDept;
    }

    public void setHasITDept(String hasITDept) {
        this.hasITDept = hasITDept;
    }

    @XmlElement(name = "ITDeptName")
    public String getiTDeptName() {
        return iTDeptName;
    }

    public void setiTDeptName(String iTDeptName) {
        this.iTDeptName = iTDeptName;
    }

    @XmlElement(name = "FeeCase")
    public String getFeeCae() {
        return feeCae;
    }

    public void setFeeCae(String feeCae) {
        this.feeCae = feeCae;
    }

    @XmlElement(name = "FeeCaseInfo")
    public String getFeeCaseInfo() {
        return feeCaseInfo;
    }

    public void setFeeCaseInfo(String feeCaseInfo) {
        this.feeCaseInfo = feeCaseInfo;
    }

    @XmlElement(name = "ARPU")
    public Long getARPU() {
        return ARPU;
    }

    public void setARPU(Long ARPU) {
        this.ARPU = ARPU;
    }

    @XmlElement(name = "DataARPU")
    public Long getAataARPU() {
        return aataARPU;
    }

    public void setAataARPU(Long aataARPU) {
        this.aataARPU = aataARPU;
    }

    @XmlElement(name = "AvgFee")
    public Long getAvgFee() {
        return avgFee;
    }

    public void setAvgFee(Long avgFee) {
        this.avgFee = avgFee;
    }

    @XmlElement(name = "Quota")
    public Long getQuota() {
        return quota;
    }

    public void setQuota(Long quota) {
        this.quota = quota;
    }

    @XmlElement(name = "RewardType")
    public String getRewardType() {
        return rewardType;
    }

    public void setRewardType(String rewardType) {
        this.rewardType = rewardType;
    }

    @XmlElement(name = "UnicomTone")
    public String getUnicomTone() {
        return unicomTone;
    }

    public void setUnicomTone(String unicomTone) {
        this.unicomTone = unicomTone;
    }

    @XmlElement(name = "UnicomData")
    public String getUnicomData() {
        return unicomData;
    }

    public void setUnicomData(String unicomData) {
        this.unicomData = unicomData;
    }

    @XmlElement(name = "Trends")
    public String getTrends() {
        return trends;
    }

    public void setTrends(String trends) {
        this.trends = trends;
    }

    @XmlElement(name = "MobileUser")
    public Long getMobileUser() {
        return mobileUser;
    }

    public void setMobileUser(Long mobileUser) {
        this.mobileUser = mobileUser;
    }

    @XmlElement(name = "MobileRate")
    public Long getMobileRate() {
        return mobileRate;
    }

    public void setMobileRate(Long mobileRate) {
        this.mobileRate = mobileRate;
    }

    @XmlElement(name = "Informationize")
    public String getInformationize() {
        return informationize;
    }

    public void setInformationize(String informationize) {
        this.informationize = informationize;
    }

    @XmlElement(name = "Intergration")
    public String getIntergration() {
        return intergration;
    }

    public void setIntergration(String intergration) {
        this.intergration = intergration;
    }

    @XmlElement(name = "Terminal")
    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    @XmlElement(name = "TransProv")
    public String getTransProv() {
        return transProv;
    }

    public void setTransProv(String transProv) {
        this.transProv = transProv;
    }

    @XmlElement(name = "SinglePay")
    public String getSinglePay() {
        return singlePay;
    }

    public void setSinglePay(String singlePay) {
        this.singlePay = singlePay;
    }

    @XmlElement(name = "Mas")
    public String getMas() {
        return mas;
    }

    public void setMas(String mas) {
        this.mas = mas;
    }

    @XmlElementWrapper(name = "CMCCPrdList")
    @XmlElement(name = "CMCCPrd")
    public List<String> getCMCCPrd() {
        return CMCCPrd;
    }

    public void setCMCCPrd(List<String> CMCCPrd) {
        this.CMCCPrd = CMCCPrd;
    }

    @Override
    public String toString() {
        return "ExtInfo{" +
                "hasITDept='" + hasITDept + '\'' +
                ", iTDeptName='" + iTDeptName + '\'' +
                ", feeCae='" + feeCae + '\'' +
                ", feeCaseInfo='" + feeCaseInfo + '\'' +
                ", ARPU=" + ARPU +
                ", aataARPU=" + aataARPU +
                ", avgFee=" + avgFee +
                ", quota=" + quota +
                ", rewardType='" + rewardType + '\'' +
                ", unicomTone='" + unicomTone + '\'' +
                ", unicomData='" + unicomData + '\'' +
                ", trends='" + trends + '\'' +
                ", mobileUser=" + mobileUser +
                ", mobileRate=" + mobileRate +
                ", informationize='" + informationize + '\'' +
                ", intergration='" + intergration + '\'' +
                ", terminal='" + terminal + '\'' +
                ", transProv='" + transProv + '\'' +
                ", singlePay='" + singlePay + '\'' +
                ", mas='" + mas + '\'' +
                ", CMCCPrd=" + CMCCPrd +
                '}';
    }
}
