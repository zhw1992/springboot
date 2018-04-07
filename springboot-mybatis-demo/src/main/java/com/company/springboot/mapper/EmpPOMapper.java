package com.company.springboot.mapper;

import com.company.springboot.po.EmpPO;

public interface EmpPOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EmpPO empPO);

    EmpPO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EmpPO record);

}