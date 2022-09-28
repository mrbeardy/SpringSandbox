package tech.hibbs.sandbox.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import tech.hibbs.sandbox.Boot;
import tech.hibbs.sandbox.service.DepartmentService;
import tech.hibbs.sandbox.service.EmployeeService;

@Configuration
public class AppConfiguration {
    
    @Lazy @Bean
    public DepartmentService departmentService() {
        return new DepartmentService();
    }

    @Lazy @Bean
    public EmployeeService employeeService() {
        return new EmployeeService();
    }

    @Lazy @Bean
    public Boot boot() {
        return new Boot();
    }

}
