package tech.hibbs.sandbox;

import java.io.IOException;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import tech.hibbs.sandbox.config.AppConfiguration;
import tech.hibbs.sandbox.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws IOException
    {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  

        try(AnnotationConfigApplicationContext applicationContext = getApplicationContext()) {
            applicationContext.getBean(Boot.class).start();
        }

        System.out.println("\n\n");
    }

    public static AnnotationConfigApplicationContext getApplicationContext() {
        return new AnnotationConfigApplicationContext(AppConfiguration.class);
    }
}
