package tech.hibbs.sandbox.service;

public class DepartmentService {

    public DepartmentService() {
        super();

        System.out.println(this + ": ctor");
    }

    public String getDepartmentName(String employeeId) {
        System.out.println(this + ": getDepartmentName");

        return "Accounts";
    }
}
