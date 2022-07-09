package com.shiyuan.hokee;

import com.shiyuan.hokee.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HokeeApplicationTests {
    @Autowired
    private EmployeeService employeeService;

    @Test
    void contextLoads() {

        employeeService.list().forEach(System.out::println);

    }



}
