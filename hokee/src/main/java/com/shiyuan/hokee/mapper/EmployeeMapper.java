package com.shiyuan.hokee.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shiyuan.hokee.entity.Employee;
import org.apache.ibatis.annotations.Mapper;


/**
* @author Admin
* @description 针对表【employee(员工信息)】的数据库操作Mapper
* @createDate 2022-07-08 21:50:12
* @Entity com.shiyuan.hokee.entity.Employee
*/
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {


}
