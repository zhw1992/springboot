package com.company.springboot.controller;

import com.company.springboot.po.EmpPO;
import com.company.springboot.response.BaseResponseVO;
import com.company.springboot.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zhanghongwei on 2018/4/7.
 */
@RestController
public class EmpController{

    @Autowired
    private EmpService empService;

    @DeleteMapping(value = "/delete/{id}")
    public BaseResponseVO delete(@PathVariable Long id){
        return empService.deleteByPrimaryKey(id);
    }

    @PostMapping(value = "/insert",consumes = {"application/json;charset=UTF-8"})
    public BaseResponseVO insert(@RequestBody EmpPO empPO){
        return empService.insert(empPO);
    }

    @GetMapping(value = "/get/{id}")
    public BaseResponseVO selectByPrimaryKey(@PathVariable Long id){
        return empService.selectByPrimaryKey(id);
    }

    @PutMapping(value = "/update",consumes = {"application/json;charset=UTF-8"})
    public BaseResponseVO updateByPrimaryKeySelective(@RequestBody EmpPO empPO){
        return empService.updateByPrimaryKeySelective(empPO);
    }
}
