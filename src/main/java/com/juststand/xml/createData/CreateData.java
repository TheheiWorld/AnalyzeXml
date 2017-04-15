package com.juststand.xml.createData;

import com.juststand.xml.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by juststand on 2017/4/13.
 */
public class CreateData {

    private CustomerInfoModel customerInfoModel;
    private ExtInfoModel extInfoModel;
    private List<KeyPersonModel> keyPersonModels;

    private OrderInfoReqModel orderInfoReqModel;
    private List<POOrderRatePolicyModel> poOrderRatePolicyModels;
    private List<RatePlanModel> ratePlanModels;
    private List<ProductOrderInfoModel> productOrderInfoModels;
    private List<ProductOrderICBModel> productOrderICBModels;
    private List<PayCompanyModel> payCompanyModels;
    private List<ProductOrderRatePlanModel> productOrderRatePlanModels;
    private List<ProductOrderCharacterModel> productOrderCharacterModels;

    public OrderInfoReqModel getOrderInfoReqModel() {
        orderInfoReqModel = new OrderInfoReqModel();
        orderInfoReqModel.setId(1001L);
        orderInfoReqModel.setOrderSourceID("DD001");
        orderInfoReqModel.setCustomerNumber("V30");
        orderInfoReqModel.setPoOrderNumber("1001001");
        orderInfoReqModel.setPoSpecNumber("998");
        orderInfoReqModel.setProductOfferingId("654");
        orderInfoReqModel.setSiCode("033");
        orderInfoReqModel.setHostCompany("HC007");
        orderInfoReqModel.setOperationSubTypeID("20");
        orderInfoReqModel.setBusinessMode("5");
        orderInfoReqModel.setPoOrderChargeCode("F001");
        orderInfoReqModel.setPoOrderChargeValue(98767L);
        orderInfoReqModel.setPoRatePolicyEffRule("1");
        orderInfoReqModel.setBusNeedDegree("1");
        orderInfoReqModel.setPoAttType(1001L);
        orderInfoReqModel.setPoAttCode("PC001");
        orderInfoReqModel.setContName("合同一");
        orderInfoReqModel.setPoAttName("附件一");
        orderInfoReqModel.setContEffdate("20170410");
        orderInfoReqModel.setContExpdate("20170511");
        orderInfoReqModel.setIsAutoRecont("1");
        orderInfoReqModel.setRecontExpdate("20190901");
        orderInfoReqModel.setContFee("10011");
        orderInfoReqModel.setPerferPlan("优惠方案一");
        orderInfoReqModel.setAutoRecontCyc("1");
        orderInfoReqModel.setIsRecont("0");
        orderInfoReqModel.setAuditor("朱全");
        orderInfoReqModel.setAuditTime("20170412052210");
        orderInfoReqModel.setAuditDesc("通过");
        orderInfoReqModel.setContactorName("朱全");
        orderInfoReqModel.setContactorType("1");
        orderInfoReqModel.setContactorPhone("18855158810");
        orderInfoReqModel.setStaffNumber("W2432");
        orderInfoReqModel.setFinishTime("20170110052230");
        orderInfoReqModel.setNotes("无备注");
        orderInfoReqModel.setTimeStamp("20170110052230");
        return orderInfoReqModel;
    }

    public List<POOrderRatePolicyModel> getPoOrderRatePolicyModels (long orderInfoReqModelId){
        poOrderRatePolicyModels = new ArrayList<POOrderRatePolicyModel>();
        if (orderInfoReqModelId == 1001L) {
            POOrderRatePolicyModel model = new POOrderRatePolicyModel();
            model.setId(1001L);
            model.setName("商务套餐一");
            model.setAction("0");
            model.setPoSpecRatePolicyID("PPI001");
            model.setCustomerInfoModelId(1001L);
            poOrderRatePolicyModels.add(model);
        }
        return poOrderRatePolicyModels;
    }

    public List<RatePlanModel> getRatePlanModels(long poOrderRatePolicyModelId) {
        ratePlanModels = new ArrayList<RatePlanModel>();
        if (poOrderRatePolicyModelId == 1001L) {
            RatePlanModel model = new RatePlanModel();
            model.setId(2002L);
            model.setAction("0");
            model.setRatePlanID("RPI001");
            model.setDescription("描述");
            model.setPoOrderRatePolicyModelId(1001L);
            ratePlanModels.add(model);
        }
        return ratePlanModels;
    }

    public List<ProductOrderICBModel> getProductOrderICBModels(Object o) {
        productOrderICBModels = new ArrayList<ProductOrderICBModel>();
        ProductOrderICBModel model = new ProductOrderICBModel();
        if (o instanceof RatePlanModel) {
            model.setId(3003L);
            model.setParameterNumber("PN001");
            model.setParameterValue(12121L);
            model.setParameterName("POI参数名");
            model.setRatePlanModelId(((RatePlanModel) o).getId());
        }

        if (o instanceof ProductOrderRatePlanModel) {
            model.setId(4004L);
            model.setParameterNumber("PN002");
            model.setParameterValue(12121L);
            model.setParameterName("POI参数名");
            model.setProductOrderRatePlanModelId(((ProductOrderRatePlanModel) o).getId());
        }
        productOrderICBModels.add(model);
        return productOrderICBModels;
    }

    public List<ProductOrderInfoModel> getProductOrderInfoModels(long orderInfoReqModelId) {
        productOrderInfoModels = new ArrayList<ProductOrderInfoModel>();
        if (orderInfoReqModelId == 1001L) {
            ProductOrderInfoModel model = new ProductOrderInfoModel();
            model.setId(1001L);
            model.setOrderInfoReqModelId(1001L);
            model.setProductOrderNumber("05124101");
            model.setProductID("PID001");
            model.setSiCode("03");
            model.setProductSpecNumber("2511212");
            model.setAccessNumber("18855158810");
            model.setPriAccessNumber("20170410");
            model.setLinkman("zhuquan");
            model.setContactPhone("18855158810");
            model.setDescription("产品描述");
            model.setServiceLevelID("SLID001");
            model.setProductOrderChargeCode("POCC001");
            model.setProductOrderChargeValue(52123);
            model.setOperationSubTypeId("10");
            productOrderInfoModels.add(model);
        }
        return productOrderInfoModels;
    }

    public List<ProductOrderRatePlanModel> getProductOrderRatePlanModels(long productOrderInfoModelId) {
        productOrderRatePlanModels = new ArrayList<ProductOrderRatePlanModel>();
        if (productOrderInfoModelId == 1001L) {
            ProductOrderRatePlanModel model = new ProductOrderRatePlanModel();
            model.setId(6006L);
            model.setAction("1");
            model.setDescription("资费描述");
            model.setRatePlanId("RPID001");
            model.setProductOrderInfoModelId(productOrderInfoModelId);
            productOrderRatePlanModels.add(model);
        }
        return productOrderRatePlanModels;
    }

    public List<PayCompanyModel> getPayCompanyModels(long productOrderInfoModelId) {
        payCompanyModels = new ArrayList<PayCompanyModel>();
        if (productOrderInfoModelId == 1001L) {
            PayCompanyModel model = new PayCompanyModel();
            model.setId(5005L);
            model.setAction("0");
            model.setPayCompanyId("PCID001");
            model.setProductOrderInfoModelId(productOrderInfoModelId);
            payCompanyModels.add(model);
        }
        return payCompanyModels;
    }

    public List<ProductOrderCharacterModel> getProductOrderCharacterModels(long productOrderInfoModelId) {
        productOrderCharacterModels = new ArrayList<ProductOrderCharacterModel>();
        if (productOrderInfoModelId == 1001L) {
            ProductOrderCharacterModel model = new ProductOrderCharacterModel();
            model.setId(7007L);
            model.setAction("1");
            model.setName("属性名");
            model.setCharacterValue("属性值");
            model.setProductOrderInfoModelId(productOrderInfoModelId);
            model.setProductSpecCharacterNumber("PSCN001");
            model.setCharacterGroup(0);
            productOrderCharacterModels.add(model);
        }
        return productOrderCharacterModels;
    }

    public CustomerInfoModel getCustomerInfoModel() {
        customerInfoModel = new CustomerInfoModel();
        customerInfoModel.setId(1001L);
        customerInfoModel.setParentCustomerNumber("001");
        customerInfoModel.setAction("1");
        customerInfoModel.setCompanyID("11");
        customerInfoModel.setCustomerProvinceNumber("22");
        customerInfoModel.setCustomerNumber("33");
        customerInfoModel.setCustomerName("网达");
        customerInfoModel.setCustomerClassID("44");
        customerInfoModel.setCreditLevelID("01");
        customerInfoModel.setCustomerRankID("1");
        customerInfoModel.setLoyaltyLevelID("vip");
        customerInfoModel.setNationID("21541");
        customerInfoModel.setTaxNum("54878");
        customerInfoModel.setCorporation("朱全");
        customerInfoModel.setLoginFinancing(1545L);
        customerInfoModel.setIndustryID("59");
        customerInfoModel.setOrganizationTypeID("01");
        customerInfoModel.setEmployeeAmountId("0");
        customerInfoModel.setMemberCount(1000L);
        customerInfoModel.setLocation("anhui");
        customerInfoModel.setPostCode("246881");
        customerInfoModel.setAddressFullName("安徽省合肥市");
        customerInfoModel.setHomepage("www.wondertek.com");
        customerInfoModel.setBackground("无");
        customerInfoModel.setOrgCustID("001");
        customerInfoModel.setDescription("无");
        customerInfoModel.setCustomerServLevel(1L);
        customerInfoModel.setIsOrg("1");
        customerInfoModel.setOrgCustomerCode("352154");
        customerInfoModel.setOrgCode("124564");
        customerInfoModel.setAnnualSales(1245L);
        customerInfoModel.setValueLevelID("01");
        customerInfoModel.setCustomerLocation("安徽");
        customerInfoModel.setStaffName("0001");
        customerInfoModel.setStaffNumber("245");
        customerInfoModel.setContactPhone("18855158810");
        customerInfoModel.setMobilePhone("18855158810");
        customerInfoModel.setContactFax("fax001212");
        customerInfoModel.setEmail("juststand0627@yeah.net");
        customerInfoModel.setLeaderName("zhuquan");
        customerInfoModel.setLeaderTel("007");
        customerInfoModel.setOperTime("20170413143500");
        return customerInfoModel;

    }

    private ExtInfoModel getExtInfoModel() {
        extInfoModel = new ExtInfoModel();
        extInfoModel.setId(2002L);
        extInfoModel.setHasITDept("2");
        extInfoModel.setiTDeptName("研发部门");
        extInfoModel.setCMCCPrds("111,222,333");
        extInfoModel.setFeeCae("1");
        extInfoModel.setFeeCaseInfo("资费套餐内容");
        extInfoModel.setARPU(145L);
        extInfoModel.setDataARPU(1222L);
        extInfoModel.setAvgFee(123L);
        extInfoModel.setQuota(123L);
        extInfoModel.setRewardType("2");
        extInfoModel.setUnicomTone("1");
        extInfoModel.setUnicomData("14554");
        extInfoModel.setTrends("0000");
        extInfoModel.setMobileUser(14565L);
        extInfoModel.setMobileRate(145L);
        extInfoModel.setInformationize("information");
        extInfoModel.setIntergration("4111");
        extInfoModel.setTerminal("11212");
        extInfoModel.setTransProv("1111");
        extInfoModel.setSinglePay("singleplay");
        extInfoModel.setMas("maxmax");
        extInfoModel.setCustomerInfoModelId(1001L);
        return extInfoModel;
    }

    public ExtInfoModel getExtInfo (long customerInfoModelId) {
        if (customerInfoModelId == 1001L) {
            return getExtInfoModel();
        }
        return null;
    }

    private List<KeyPersonModel> getKeyPersonModels () {
        keyPersonModels = new ArrayList<KeyPersonModel>();
        KeyPersonModel keyPersonModel = new KeyPersonModel();
        keyPersonModel.setId(3003L);
        keyPersonModel.setRole("1");
        keyPersonModel.setPartyName("zhuquan");
        keyPersonModel.setSex("man");
        keyPersonModel.setContactPhone("18855158810");
        keyPersonModel.setTitle("总统");
        keyPersonModel.setAlias("朱全");
        keyPersonModel.setBirthday("0627");
        keyPersonModel.setMemorial("911");
        keyPersonModel.setMate("mate");
        keyPersonModel.setSecretary("mishu");
        keyPersonModel.setSchool("合工大");
        keyPersonModel.setClassMates("zhuqan");
        keyPersonModel.setHobby("hobby");
        keyPersonModel.setLeader("china");
        keyPersonModel.setLeaderDept("xianwei");
        keyPersonModel.setVassal("zhenwei");
        keyPersonModel.setIntercourse("beiyue");
        keyPersonModels.add(keyPersonModel);
        return keyPersonModels;
    }

    public List<KeyPersonModel> getKeyPersons (long customerInfoModelId) {
        if (customerInfoModelId == 1001L) {
            return getKeyPersonModels();
        }
        return null;
    }
}
