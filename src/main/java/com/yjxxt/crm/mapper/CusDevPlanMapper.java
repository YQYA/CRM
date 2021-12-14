package com.yjxxt.crm.mapper;

import com.yjxxt.crm.base.BaseMapper;
import com.yjxxt.crm.bean.CusDevPlan;


public interface CusDevPlanMapper extends BaseMapper<CusDevPlan,Integer> {

    Integer deleteByPrimaryKey(Integer id);

    int insert(CusDevPlan record);

    Integer insertSelective(CusDevPlan record);

    CusDevPlan selectByPrimaryKey(Integer id);

    Integer updateByPrimaryKeySelective(CusDevPlan record);

    int updateByPrimaryKey(CusDevPlan record);


}