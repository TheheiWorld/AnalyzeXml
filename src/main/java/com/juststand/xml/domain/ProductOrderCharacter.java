package com.juststand.xml.domain;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by juststand on 2017/4/10.
 */
public class ProductOrderCharacter {

    private String productSpecCharacterNumber;
    private String characterValue;
    private String name;
    private String action;
    private long characterGroup;

    @XmlElement(name = "ProductSpecCharacterNumber")
    public String getProductSpecCharacterNumber() {
        return productSpecCharacterNumber;
    }

    public void setProductSpecCharacterNumber(String productSpecCharacterNumber) {
        this.productSpecCharacterNumber = productSpecCharacterNumber;
    }

    @XmlElement(name = "CharacterValue")
    public String getCharacterValue() {
        return characterValue;
    }

    public void setCharacterValue(String characterValue) {
        this.characterValue = characterValue;
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

    @XmlElement(name = "CharacterGroup")
    public long getCharacterGroup() {
        return characterGroup;
    }

    public void setCharacterGroup(long characterGroup) {
        this.characterGroup = characterGroup;
    }

    @Override
    public String toString() {
        return "ProductOrderCharacter{" +
                "productSpecCharacterNumber='" + productSpecCharacterNumber + '\'' +
                ", characterValue='" + characterValue + '\'' +
                ", name='" + name + '\'' +
                ", action='" + action + '\'' +
                ", characterGroup=" + characterGroup +
                '}';
    }
}
