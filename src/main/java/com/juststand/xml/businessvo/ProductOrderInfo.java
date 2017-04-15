package com.juststand.xml.businessvo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

/**
 * Created by juststand on 2017/4/10.
 */
public class ProductOrderInfo {

    private ProductOrder productOrder;
    private ProductOrderCharge productOrderCharge;
    private List<ProductOrderRatePlan> productOrderRatePlans;
    private List<PayCompany> payCompanys;
    private ProductOrderBusinesses productOrderBusinesses;
    private List<ProductOrderCharacter> productOrderCharacters;

    @XmlElement(name = "ProductOrder")
    public ProductOrder getProductOrder() {
        return productOrder;
    }

    public void setProductOrder(ProductOrder productOrder) {
        this.productOrder = productOrder;
    }

    @XmlElement(name = "ProductOrderCharge")
    public ProductOrderCharge getProductOrderCharge() {
        return productOrderCharge;
    }

    public void setProductOrderCharge(ProductOrderCharge productOrderCharge) {
        this.productOrderCharge = productOrderCharge;
    }

    @XmlElementWrapper(name = "ProductOrderRatePlans")
    @XmlElement(name = "ProductOrderRatePlan")
    public List<ProductOrderRatePlan> getProductOrderRatePlans() {
        return productOrderRatePlans;
    }

    public void setProductOrderRatePlans(List<ProductOrderRatePlan> productOrderRatePlans) {
        this.productOrderRatePlans = productOrderRatePlans;
    }

    @XmlElementWrapper(name = "PayCompanys")
    @XmlElement(name = "PayCompany")
    public List<PayCompany> getPayCompanys() {
        return payCompanys;
    }

    public void setPayCompanys(List<PayCompany> payCompanys) {
        this.payCompanys = payCompanys;
    }

    @XmlElement(name = "ProductOrderBusinesses")
    public ProductOrderBusinesses getProductOrderBusinesses() {
        return productOrderBusinesses;
    }

    public void setProductOrderBusinesses(ProductOrderBusinesses productOrderBusinesses) {
        this.productOrderBusinesses = productOrderBusinesses;
    }

    @XmlElementWrapper(name = "ProductOrderCharacters")
    @XmlElement(name = "ProductOrderCharacter")
    public List<ProductOrderCharacter> getProductOrderCharacters() {
        return productOrderCharacters;
    }

    public void setProductOrderCharacters(List<ProductOrderCharacter> productOrderCharacters) {
        this.productOrderCharacters = productOrderCharacters;
    }

    @Override
    public String toString() {
        return "ProductOrderInfo{" +
                "productOrder=" + productOrder +
                ", productOrderCharge=" + productOrderCharge +
                ", productOrderRatePlans=" + productOrderRatePlans +
                ", payCompanys=" + payCompanys +
                ", productOrderBusinesses=" + productOrderBusinesses +
                ", productOrderCharacters=" + productOrderCharacters +
                '}';
    }
}
