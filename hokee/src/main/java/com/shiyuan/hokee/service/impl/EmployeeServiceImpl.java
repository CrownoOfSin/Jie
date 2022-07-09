package com.shiyuan.hokee.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shiyuan.hokee.entity.Employee;
import com.shiyuan.hokee.service.EmployeeService;
import com.shiyuan.hokee.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;

/**
* @author Admin
* @description 针对表【employee(员工信息)】的数据库操作Service实现
* @createDate 2022-07-08 21:50:12
*/
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee>
implements EmployeeService{

}
