package com.juststand.xml.model;

/**
 * Created by juststand on 2017/4/15.
 */
public class ProductOrderCharacterModel {

    private long id;
    private long productOrderInfoModelId;
    private String productSpecCharacterNumber;
    private String characterValue;
    private String name;
    private String action;
    private long characterGroup;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProductOrderInfoModelId() {
        return productOrderInfoModelId;
    }

    public void setProductOrderInfoModelId(long productOrderInfoModelId) {
        this.productOrderInfoModelId = productOrderInfoModelId;
    }

    public String getProductSpecCharacterNumber() {
        return productSpecCharacterNumber;
    }

    public void setProductSpecCharacterNumber(String productSpecCharacterNumber) {
        this.productSpecCharacterNumber = productSpecCharacterNumber;
    }

    public String getCharacterValue() {
        return characterValue;
    }

    public void setCharacterValue(String characterValue) {
        this.characterValue = characterValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public long getCharacterGroup() {
        return characterGroup;
    }

    public void setCharacterGroup(long characterGroup) {
        this.characterGroup = characterGroup;
    }

    @Override
    public String toString() {
        return "ProductOrderCharacterModel{" +
                "id=" + id +
                ", productOrderInfoModelId=" + productOrderInfoModelId +
                ", productSpecCharacterNumber='" + productSpecCharacterNumber + '\'' +
                ", characterValue='" + characterValue + '\'' +
                ", name='" + name + '\'' +
                ", action='" + action + '\'' +
                ", characterGroup=" + characterGroup +
                '}';
    }
}
