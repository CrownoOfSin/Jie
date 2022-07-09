package com.shiyuan.hokee.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shiyuan.hokee.common.R;
import com.shiyuan.hokee.entity.Employee;
import com.shiyuan.hokee.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

import java.util.List;

@SpringBootTest
public class EmployeeImpl {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void loginTest(){

        String username = "admin";
        String password = "123456";
        Employee employee = new Employee();
        employee.setUsername(username);
        employee.setPassword( DigestUtils.md5DigestAsHex((password).getBytes()));
        Wrapper wrapper = new QueryWrapper(employee);
        Employee employee1 = employeeService.getOne(wrapper);
        System.out.println(employee1);
        if ( employee1 != null){
            R.error("登录失败");
        }else {
            R.success(employee1);
        }

    }

}
