package tech.hibbs.sandbox;

import org.springframework.beans.factory.annotation.Autowired;

import tech.hibbs.sandbox.service.EmployeeService;

public class Boot {
    @Autowired
    EmployeeService employeeService;
    
    public void start() {
        System.out.println("Boot started!");

        //System.out.print(employeeService.checkDepartment());
    }
}
