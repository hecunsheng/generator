package org.hecs.generator.dao;

import org.hecs.generator.model.InsuranceStaff;

public interface InsuranceStaffMapper {
    int deleteByPrimaryKey(Object id);

    int insert(InsuranceStaff record);

    int insertSelective(InsuranceStaff record);

    InsuranceStaff selectByPrimaryKey(Object id);

    int updateByPrimaryKeySelective(InsuranceStaff record);

    int updateByPrimaryKey(InsuranceStaff record);
}