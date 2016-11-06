
package com.sqlite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sqlite.models.LoginModel;
import com.sqlite.service.IUserService;

@SpringBootApplication
public class SampleSqliteApplication {
	
    	public static void main(String[] args) {
    	  ApplicationContext ctx = 
	  		SpringApplication.run(SampleSqliteApplication.class, args);
	  		/*String[] beanNames = ctx.getBeanDefinitionNames();
	  		    Arrays.sort(beanNames);
	  		    System.out.println("***********************");
	  		    for (String beanName : beanNames) {
	  		        System.out.println(beanName);
	  		    }
	  		    System.out.println("***********************");*/
    	  
    	  IUserService userService = 
    		  ctx.getBean("userService", IUserService.class);
    	LoginModel loginModel =new LoginModel();
    	loginModel.setPassword("dbase123");
    	loginModel.setUserName("bharat0126");
    	 System.out.println(userService.getUser(loginModel).toString());
    	
    }
}
