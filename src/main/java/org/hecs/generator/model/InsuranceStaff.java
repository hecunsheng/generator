package org.hecs.generator.model;

public class InsuranceStaff {
    /**
     * 保险工作人员id
     */
    private Object id;

    /**
     * 用户Id
     */
    private Object userId;

    /**
     * 微信open_id
     */
    private Object openId;

    /**
     * 电话号码
     */
    private Object phone;

    /**
     * 状态(0 删除,1 可用)
     */
    private Object insuranceStaffStatus;

    /**
     * 创建时间
     */
    private Object createTime;

    /**
     * 修改时间
     */
    private Object updateTime;

    /**
     * 创建人
     */
    private Object createPerson;

    /**
     * 修改人
     */
    private Object updatePerson;

    /**
     * 员工名称
     */
    private Object empName;

    /**
     * 员工编号
     */
    private Object empNo;

    /**
     * 员工入职时间
     */
    private Object empEntryDate;

    /**
     * 员工生日(阳历)
     */
    private Object empBirthday;

    /**
     * 国籍(默认中国 1)
     */
    private Object nationality;

    /**
     * 民族
     */
    private Object nation;

    /**
     * 性别 女'M' 男'F'
     */
    private Object sex;

    /**
     * 手机号码
     */
    private Object mobilePhone;

    /**
     * 合同签订日期
     */
    private Object contractStartDate;

    /**
     * 合同结束日期(长期置空)
     */
    private Object contractEndDate;

    /**
     * 证件类型 1身份证 2军官证/士兵证 3护照 4港澳通行证 5港澳回乡证/台胞证 6外国人永久居留身份证 7其它
     */
    private Object cardType;

    /**
     * 证件号码
     */
    private Object cardNo;

    /**
     * 证件有效起始日期
     */
    private Object cardVaildStartdate;

    /**
     * 证件有效结束日期(长期置空)
     */
    private Object cardVaildEnddate;

    /**
     * 证件照url(多张逗号隔开 默认顺序正反照)
     */
    private Object cardImgurl;

    /**
     * 住址
     */
    private Object addressDetail;

    /**
     * 联系电话(默认手机号)
     */
    private Object linkPhone;

    /**
     * 邮箱
     */
    private Object email;

    /**
     * 其它联系方式 1手机号 2家庭电话 3办公电话 4QQ 5邮箱 6微信号
     */
    private Object otherContactWay;

    /**
     * 其它联系详细
     */
    private Object otherContactNo;

    /**
     * 是否禁用 0启用 1禁用
     */
    private Object isLocked;

    /**
     * 组织机构ID
     */
    private Object orgId;

    /**
     * 部门ID
     */
    private Object deptId;

    /**
     * 保险工作人员id
     * @return id 保险工作人员id
     */
    public Object getId() {
        return id;
    }

    /**
     * 保险工作人员id
     * @param id 保险工作人员id
     */
    public void setId(Object id) {
        this.id = id;
    }

    /**
     * 用户Id
     * @return user_id 用户Id
     */
    public Object getUserId() {
        return userId;
    }

    /**
     * 用户Id
     * @param userId 用户Id
     */
    public void setUserId(Object userId) {
        this.userId = userId;
    }

    /**
     * 微信open_id
     * @return open_id 微信open_id
     */
    public Object getOpenId() {
        return openId;
    }

    /**
     * 微信open_id
     * @param openId 微信open_id
     */
    public void setOpenId(Object openId) {
        this.openId = openId;
    }

    /**
     * 电话号码
     * @return phone 电话号码
     */
    public Object getPhone() {
        return phone;
    }

    /**
     * 电话号码
     * @param phone 电话号码
     */
    public void setPhone(Object phone) {
        this.phone = phone;
    }

    /**
     * 状态(0 删除,1 可用)
     * @return insurance_staff_status 状态(0 删除,1 可用)
     */
    public Object getInsuranceStaffStatus() {
        return insuranceStaffStatus;
    }

    /**
     * 状态(0 删除,1 可用)
     * @param insuranceStaffStatus 状态(0 删除,1 可用)
     */
    public void setInsuranceStaffStatus(Object insuranceStaffStatus) {
        this.insuranceStaffStatus = insuranceStaffStatus;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Object getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Object createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改时间
     * @return update_time 修改时间
     */
    public Object getUpdateTime() {
        return updateTime;
    }

    /**
     * 修改时间
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Object updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 创建人
     * @return create_person 创建人
     */
    public Object getCreatePerson() {
        return createPerson;
    }

    /**
     * 创建人
     * @param createPerson 创建人
     */
    public void setCreatePerson(Object createPerson) {
        this.createPerson = createPerson;
    }

    /**
     * 修改人
     * @return update_person 修改人
     */
    public Object getUpdatePerson() {
        return updatePerson;
    }

    /**
     * 修改人
     * @param updatePerson 修改人
     */
    public void setUpdatePerson(Object updatePerson) {
        this.updatePerson = updatePerson;
    }

    /**
     * 员工名称
     * @return emp_name 员工名称
     */
    public Object getEmpName() {
        return empName;
    }

    /**
     * 员工名称
     * @param empName 员工名称
     */
    public void setEmpName(Object empName) {
        this.empName = empName;
    }

    /**
     * 员工编号
     * @return emp_no 员工编号
     */
    public Object getEmpNo() {
        return empNo;
    }

    /**
     * 员工编号
     * @param empNo 员工编号
     */
    public void setEmpNo(Object empNo) {
        this.empNo = empNo;
    }

    /**
     * 员工入职时间
     * @return emp_entry_date 员工入职时间
     */
    public Object getEmpEntryDate() {
        return empEntryDate;
    }

    /**
     * 员工入职时间
     * @param empEntryDate 员工入职时间
     */
    public void setEmpEntryDate(Object empEntryDate) {
        this.empEntryDate = empEntryDate;
    }

    /**
     * 员工生日(阳历)
     * @return emp_birthday 员工生日(阳历)
     */
    public Object getEmpBirthday() {
        return empBirthday;
    }

    /**
     * 员工生日(阳历)
     * @param empBirthday 员工生日(阳历)
     */
    public void setEmpBirthday(Object empBirthday) {
        this.empBirthday = empBirthday;
    }

    /**
     * 国籍(默认中国 1)
     * @return nationality 国籍(默认中国 1)
     */
    public Object getNationality() {
        return nationality;
    }

    /**
     * 国籍(默认中国 1)
     * @param nationality 国籍(默认中国 1)
     */
    public void setNationality(Object nationality) {
        this.nationality = nationality;
    }

    /**
     * 民族
     * @return nation 民族
     */
    public Object getNation() {
        return nation;
    }

    /**
     * 民族
     * @param nation 民族
     */
    public void setNation(Object nation) {
        this.nation = nation;
    }

    /**
     * 性别 女'M' 男'F'
     * @return sex 性别 女'M' 男'F'
     */
    public Object getSex() {
        return sex;
    }

    /**
     * 性别 女'M' 男'F'
     * @param sex 性别 女'M' 男'F'
     */
    public void setSex(Object sex) {
        this.sex = sex;
    }

    /**
     * 手机号码
     * @return mobile_phone 手机号码
     */
    public Object getMobilePhone() {
        return mobilePhone;
    }

    /**
     * 手机号码
     * @param mobilePhone 手机号码
     */
    public void setMobilePhone(Object mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * 合同签订日期
     * @return contract_start_date 合同签订日期
     */
    public Object getContractStartDate() {
        return contractStartDate;
    }

    /**
     * 合同签订日期
     * @param contractStartDate 合同签订日期
     */
    public void setContractStartDate(Object contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    /**
     * 合同结束日期(长期置空)
     * @return contract_end_date 合同结束日期(长期置空)
     */
    public Object getContractEndDate() {
        return contractEndDate;
    }

    /**
     * 合同结束日期(长期置空)
     * @param contractEndDate 合同结束日期(长期置空)
     */
    public void setContractEndDate(Object contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    /**
     * 证件类型 1身份证 2军官证/士兵证 3护照 4港澳通行证 5港澳回乡证/台胞证 6外国人永久居留身份证 7其它
     * @return card_type 证件类型 1身份证 2军官证/士兵证 3护照 4港澳通行证 5港澳回乡证/台胞证 6外国人永久居留身份证 7其它
     */
    public Object getCardType() {
        return cardType;
    }

    /**
     * 证件类型 1身份证 2军官证/士兵证 3护照 4港澳通行证 5港澳回乡证/台胞证 6外国人永久居留身份证 7其它
     * @param cardType 证件类型 1身份证 2军官证/士兵证 3护照 4港澳通行证 5港澳回乡证/台胞证 6外国人永久居留身份证 7其它
     */
    public void setCardType(Object cardType) {
        this.cardType = cardType;
    }

    /**
     * 证件号码
     * @return card_no 证件号码
     */
    public Object getCardNo() {
        return cardNo;
    }

    /**
     * 证件号码
     * @param cardNo 证件号码
     */
    public void setCardNo(Object cardNo) {
        this.cardNo = cardNo;
    }

    /**
     * 证件有效起始日期
     * @return card_vaild_startdate 证件有效起始日期
     */
    public Object getCardVaildStartdate() {
        return cardVaildStartdate;
    }

    /**
     * 证件有效起始日期
     * @param cardVaildStartdate 证件有效起始日期
     */
    public void setCardVaildStartdate(Object cardVaildStartdate) {
        this.cardVaildStartdate = cardVaildStartdate;
    }

    /**
     * 证件有效结束日期(长期置空)
     * @return card_vaild_enddate 证件有效结束日期(长期置空)
     */
    public Object getCardVaildEnddate() {
        return cardVaildEnddate;
    }

    /**
     * 证件有效结束日期(长期置空)
     * @param cardVaildEnddate 证件有效结束日期(长期置空)
     */
    public void setCardVaildEnddate(Object cardVaildEnddate) {
        this.cardVaildEnddate = cardVaildEnddate;
    }

    /**
     * 证件照url(多张逗号隔开 默认顺序正反照)
     * @return card_imgurl 证件照url(多张逗号隔开 默认顺序正反照)
     */
    public Object getCardImgurl() {
        return cardImgurl;
    }

    /**
     * 证件照url(多张逗号隔开 默认顺序正反照)
     * @param cardImgurl 证件照url(多张逗号隔开 默认顺序正反照)
     */
    public void setCardImgurl(Object cardImgurl) {
        this.cardImgurl = cardImgurl;
    }

    /**
     * 住址
     * @return address_detail 住址
     */
    public Object getAddressDetail() {
        return addressDetail;
    }

    /**
     * 住址
     * @param addressDetail 住址
     */
    public void setAddressDetail(Object addressDetail) {
        this.addressDetail = addressDetail;
    }

    /**
     * 联系电话(默认手机号)
     * @return link_phone 联系电话(默认手机号)
     */
    public Object getLinkPhone() {
        return linkPhone;
    }

    /**
     * 联系电话(默认手机号)
     * @param linkPhone 联系电话(默认手机号)
     */
    public void setLinkPhone(Object linkPhone) {
        this.linkPhone = linkPhone;
    }

    /**
     * 邮箱
     * @return email 邮箱
     */
    public Object getEmail() {
        return email;
    }

    /**
     * 邮箱
     * @param email 邮箱
     */
    public void setEmail(Object email) {
        this.email = email;
    }

    /**
     * 其它联系方式 1手机号 2家庭电话 3办公电话 4QQ 5邮箱 6微信号
     * @return other_contact_way 其它联系方式 1手机号 2家庭电话 3办公电话 4QQ 5邮箱 6微信号
     */
    public Object getOtherContactWay() {
        return otherContactWay;
    }

    /**
     * 其它联系方式 1手机号 2家庭电话 3办公电话 4QQ 5邮箱 6微信号
     * @param otherContactWay 其它联系方式 1手机号 2家庭电话 3办公电话 4QQ 5邮箱 6微信号
     */
    public void setOtherContactWay(Object otherContactWay) {
        this.otherContactWay = otherContactWay;
    }

    /**
     * 其它联系详细
     * @return other_contact_no 其它联系详细
     */
    public Object getOtherContactNo() {
        return otherContactNo;
    }

    /**
     * 其它联系详细
     * @param otherContactNo 其它联系详细
     */
    public void setOtherContactNo(Object otherContactNo) {
        this.otherContactNo = otherContactNo;
    }

    /**
     * 是否禁用 0启用 1禁用
     * @return is_locked 是否禁用 0启用 1禁用
     */
    public Object getIsLocked() {
        return isLocked;
    }

    /**
     * 是否禁用 0启用 1禁用
     * @param isLocked 是否禁用 0启用 1禁用
     */
    public void setIsLocked(Object isLocked) {
        this.isLocked = isLocked;
    }

    /**
     * 组织机构ID
     * @return org_id 组织机构ID
     */
    public Object getOrgId() {
        return orgId;
    }

    /**
     * 组织机构ID
     * @param orgId 组织机构ID
     */
    public void setOrgId(Object orgId) {
        this.orgId = orgId;
    }

    /**
     * 部门ID
     * @return dept_id 部门ID
     */
    public Object getDeptId() {
        return deptId;
    }

    /**
     * 部门ID
     * @param deptId 部门ID
     */
    public void setDeptId(Object deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", openId=").append(openId);
        sb.append(", phone=").append(phone);
        sb.append(", insuranceStaffStatus=").append(insuranceStaffStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createPerson=").append(createPerson);
        sb.append(", updatePerson=").append(updatePerson);
        sb.append(", empName=").append(empName);
        sb.append(", empNo=").append(empNo);
        sb.append(", empEntryDate=").append(empEntryDate);
        sb.append(", empBirthday=").append(empBirthday);
        sb.append(", nationality=").append(nationality);
        sb.append(", nation=").append(nation);
        sb.append(", sex=").append(sex);
        sb.append(", mobilePhone=").append(mobilePhone);
        sb.append(", contractStartDate=").append(contractStartDate);
        sb.append(", contractEndDate=").append(contractEndDate);
        sb.append(", cardType=").append(cardType);
        sb.append(", cardNo=").append(cardNo);
        sb.append(", cardVaildStartdate=").append(cardVaildStartdate);
        sb.append(", cardVaildEnddate=").append(cardVaildEnddate);
        sb.append(", cardImgurl=").append(cardImgurl);
        sb.append(", addressDetail=").append(addressDetail);
        sb.append(", linkPhone=").append(linkPhone);
        sb.append(", email=").append(email);
        sb.append(", otherContactWay=").append(otherContactWay);
        sb.append(", otherContactNo=").append(otherContactNo);
        sb.append(", isLocked=").append(isLocked);
        sb.append(", orgId=").append(orgId);
        sb.append(", deptId=").append(deptId);
        sb.append("]");
        return sb.toString();
    }
}