package com.juststand.xml.messagevo;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by juststand on 2017/4/13.
 */
public class Customer {

    private String companyID;
    private String customerProvinceNumber;
    private String customerNumber;
    private String customerName;
    private String customerClassID;
    private String creditLevelID;
    private String customerRankID;
    private String loyaltyLevelID;
    private String nationID;
    private String taxNum;
    private String corporation;
    private Long loginFinancing;
    private String industryID;
    private String organizationTypeID;
    private String employeeAmountId;
    private Long memberCount;
    private String location;
    private String postCode;
    private String addressFullName;
    private String homepage;
    private String background;
    private String orgCustID;
    private String description;
    private Long customerServLevel;
    private String isOrg;
    private String orgCustomerCode;
    private String orgCode;
    private Long annualSales;
    private String valueLevelID;
    private String customerLocation;

    @XmlElement(name = "CompanyID")
    public String getCompanyID() {
        return companyID;
    }

    public void setCompanyID(String companyID) {
        this.companyID = companyID;
    }

    @XmlElement(name = "CustomerProvinceNumber")
    public String getCustomerProvinceNumber() {
        return customerProvinceNumber;
    }

    public void setCustomerProvinceNumber(String customerProvinceNumber) {
        this.customerProvinceNumber = customerProvinceNumber;
    }

    @XmlElement(name = "CustomerNumber")
    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    @XmlElement(name = "CustomerName")
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @XmlElement(name = "CustomerClassID")
    public String getCustomerClassID() {
        return customerClassID;
    }

    public void setCustomerClassID(String customerClassID) {
        this.customerClassID = customerClassID;
    }

    @XmlElement(name = "CreditLevelID")
    public String getCreditLevelID() {
        return creditLevelID;
    }

    public void setCreditLevelID(String creditLevelID) {
        this.creditLevelID = creditLevelID;
    }

    @XmlElement(name = "CustomerRankID")
    public String getCustomerRankID() {
        return customerRankID;
    }

    public void setCustomerRankID(String customerRankID) {
        this.customerRankID = customerRankID;
    }

    @XmlElement(name = "LoyaltyLevelID")
    public String getLoyaltyLevelID() {
        return loyaltyLevelID;
    }

    public void setLoyaltyLevelID(String loyaltyLevelID) {
        this.loyaltyLevelID = loyaltyLevelID;
    }

    @XmlElement(name = "NationID")
    public String getNationID() {
        return nationID;
    }

    public void setNationID(String nationID) {
        this.nationID = nationID;
    }

    @XmlElement(name = "TaxNum")
    public String getTaxNum() {
        return taxNum;
    }

    public void setTaxNum(String taxNum) {
        this.taxNum = taxNum;
    }

    @XmlElement(name = "Corporation")
    public String getCorporation() {
        return corporation;
    }

    public void setCorporation(String corporation) {
        this.corporation = corporation;
    }

    @XmlElement(name = "LoginFinancing")
    public Long getLoginFinancing() {
        return loginFinancing;
    }

    public void setLoginFinancing(Long loginFinancing) {
        this.loginFinancing = loginFinancing;
    }

    @XmlElement(name = "IndustryID")
    public String getIndustryID() {
        return industryID;
    }

    public void setIndustryID(String industryID) {
        this.industryID = industryID;
    }

    @XmlElement(name = "OrganizationTypeID")
    public String getOrganizationTypeID() {
        return organizationTypeID;
    }

    public void setOrganizationTypeID(String organizationTypeID) {
        this.organizationTypeID = organizationTypeID;
    }

    @XmlElement(name = "EmployeeAmountId")
    public String getEmployeeAmountId() {
        return employeeAmountId;
    }

    public void setEmployeeAmountId(String employeeAmountId) {
        this.employeeAmountId = employeeAmountId;
    }

    @XmlElement(name = "MemberCount")
    public Long getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(Long memberCount) {
        this.memberCount = memberCount;
    }

    @XmlElement(name = "Location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @XmlElement(name = "PostCode")
    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @XmlElement(name = "AddressFullName")
    public String getAddressFullName() {
        return addressFullName;
    }

    public void setAddressFullName(String addressFullName) {
        this.addressFullName = addressFullName;
    }

    @XmlElement(name = "Homepage")
    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    @XmlElement(name = "Background")
    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    @XmlElement(name = "OrgCustID")
    public String getOrgCustID() {
        return orgCustID;
    }

    public void setOrgCustID(String orgCustID) {
        this.orgCustID = orgCustID;
    }

    @XmlElement(name = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlElement(name = "CustomerServLevel")
    public Long getCustomerServLevel() {
        return customerServLevel;
    }

    public void setCustomerServLevel(Long customerServLevel) {
        this.customerServLevel = customerServLevel;
    }

    @XmlElement(name = "IsOrg")
    public String getIsOrg() {
        return isOrg;
    }

    public void setIsOrg(String isOrg) {
        this.isOrg = isOrg;
    }

    @XmlElement(name = "OrgCustomerCode")
    public String getOrgCustomerCode() {
        return orgCustomerCode;
    }

    public void setOrgCustomerCode(String orgCustomerCode) {
        this.orgCustomerCode = orgCustomerCode;
    }

    @XmlElement(name = "OrgCode")
    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    @XmlElement(name = "AnnualSales")
    public Long getAnnualSales() {
        return annualSales;
    }

    public void setAnnualSales(Long annualSales) {
        this.annualSales = annualSales;
    }

    @XmlElement(name = "ValueLevelID")
    public String getValueLevelID() {
        return valueLevelID;
    }

    public void setValueLevelID(String valueLevelID) {
        this.valueLevelID = valueLevelID;
    }

    @XmlElement(name = "CustomerLocation")
    public String getCustomerLocation() {
        return customerLocation;
    }

    public void setCustomerLocation(String customerLocation) {
        this.customerLocation = customerLocation;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "companyID='" + companyID + '\'' +
                ", customerProvinceNumber='" + customerProvinceNumber + '\'' +
                ", customerNumber='" + customerNumber + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerClassID='" + customerClassID + '\'' +
                ", creditLevelID='" + creditLevelID + '\'' +
                ", customerRankID='" + customerRankID + '\'' +
                ", loyaltyLevelID='" + loyaltyLevelID + '\'' +
                ", nationID='" + nationID + '\'' +
                ", taxNum='" + taxNum + '\'' +
                ", corporation='" + corporation + '\'' +
                ", loginFinancing=" + loginFinancing +
                ", industryID='" + industryID + '\'' +
                ", organizationTypeID='" + organizationTypeID + '\'' +
                ", employeeAmountId='" + employeeAmountId + '\'' +
                ", memberCount=" + memberCount +
                ", location='" + location + '\'' +
                ", postCode='" + postCode + '\'' +
                ", addressFullName='" + addressFullName + '\'' +
                ", homepage='" + homepage + '\'' +
                ", background='" + background + '\'' +
                ", orgCustID='" + orgCustID + '\'' +
                ", description='" + description + '\'' +
                ", customerServLevel=" + customerServLevel +
                ", isOrg='" + isOrg + '\'' +
                ", orgCustomerCode='" + orgCustomerCode + '\'' +
                ", orgCode='" + orgCode + '\'' +
                ", annualSales=" + annualSales +
                ", valueLevelID='" + valueLevelID + '\'' +
                ", customerLocation='" + customerLocation + '\'' +
                '}';
    }
}
