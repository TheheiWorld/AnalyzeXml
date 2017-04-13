package com.juststand.xml.createData;

import com.juststand.xml.model.CustomerInfoModel;
import com.juststand.xml.model.ExtInfoModel;
import com.juststand.xml.model.KeyPersonModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by juststand on 2017/4/13.
 */
public class CreateData {

    private CustomerInfoModel customerInfoModel;
    private ExtInfoModel extInfoModel;
    private List<KeyPersonModel> keyPersonModels;

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
