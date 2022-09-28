package tech.hibbs.sandbox.service;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {
    @Autowired
    private DepartmentService departmentService;

    public EmployeeService() {
        super();

        System.out.println(this + ": ctor");
    }

    public String checkDepartment() {
        System.out.println(this + ": checkDepartment");

        return this.departmentService.getDepartmentName("EMP-0098");
    }
}
