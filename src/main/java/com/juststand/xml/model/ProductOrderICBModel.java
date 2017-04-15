package com.juststand.xml.model;

/**
 * Created by juststand on 2017/4/15.
 */
public class ProductOrderICBModel {

    private long id;
    private long ratePlanModelId;
    private long productOrderRatePlanModelId;
    private String parameterNumber;
    private String parameterName;
    private long parameterValue;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRatePlanModelId() {
        return ratePlanModelId;
    }

    public void setRatePlanModelId(long ratePlanModelId) {
        this.ratePlanModelId = ratePlanModelId;
    }

    public String getParameterNumber() {
        return parameterNumber;
    }

    public void setParameterNumber(String parameterNumber) {
        this.parameterNumber = parameterNumber;
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public long getParameterValue() {
        return parameterValue;
    }

    public void setParameterValue(long parameterValue) {
        this.parameterValue = parameterValue;
    }

    public long getProductOrderRatePlanModelId() {
        return productOrderRatePlanModelId;
    }

    public void setProductOrderRatePlanModelId(long productOrderRatePlanModelId) {
        this.productOrderRatePlanModelId = productOrderRatePlanModelId;
    }

    @Override
    public String toString() {
        return "ProductOrderICBModel{" +
                "id=" + id +
                ", ratePlanModelId=" + ratePlanModelId +
                ", productOrderRatePlanModelId=" + productOrderRatePlanModelId +
                ", parameterNumber='" + parameterNumber + '\'' +
                ", parameterName='" + parameterName + '\'' +
                ", parameterValue=" + parameterValue +
                '}';
    }
}
