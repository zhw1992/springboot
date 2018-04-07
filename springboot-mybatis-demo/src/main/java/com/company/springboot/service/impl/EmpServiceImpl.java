package com.company.springboot.service.impl;

import com.company.springboot.mapper.EmpPOMapper;
import com.company.springboot.po.EmpPO;
import com.company.springboot.response.BaseResponseVO;
import com.company.springboot.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhanghongwei on 2018/4/7.
 */
@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpPOMapper empPOMapper;

    @Override
    public BaseResponseVO deleteByPrimaryKey(Long id) {
        int count = empPOMapper.deleteByPrimaryKey(id);
        BaseResponseVO baseResponseVO = new BaseResponseVO();
        baseResponseVO.setResult(1);
        baseResponseVO.setMessage("根据主键删除成功");
        return baseResponseVO;
    }

    @Override
    public BaseResponseVO insert(EmpPO empPO) {
        empPOMapper.insert(empPO);
        BaseResponseVO baseResponseVO = new BaseResponseVO();
        baseResponseVO.setResult(1);
        baseResponseVO.setMessage("新增成功");
        return baseResponseVO;
    }

    @Override
    public BaseResponseVO selectByPrimaryKey(Long id) {
        EmpPO empPO = empPOMapper.selectByPrimaryKey(id);
        BaseResponseVO baseResponseVO = new BaseResponseVO();
        baseResponseVO.setResult(1);
        baseResponseVO.setT(empPO);
        return baseResponseVO;
    }

    @Override
    public BaseResponseVO updateByPrimaryKeySelective(EmpPO empPO) {
        empPOMapper.updateByPrimaryKeySelective(empPO);
        BaseResponseVO baseResponseVO = new BaseResponseVO();
        baseResponseVO.setResult(1);
        baseResponseVO.setMessage("修改成功");
        return baseResponseVO;
    }
}
