package com.company.springboot.service;

import com.company.springboot.po.EmpPO;
import com.company.springboot.response.BaseResponseVO;

/**
 * Created by zhanghongwei on 2018/4/7.
 */
public interface EmpService {

    BaseResponseVO deleteByPrimaryKey(Long id);

    BaseResponseVO insert(EmpPO empPO);

    BaseResponseVO selectByPrimaryKey(Long id);

    BaseResponseVO updateByPrimaryKeySelective(EmpPO empPO);

}
