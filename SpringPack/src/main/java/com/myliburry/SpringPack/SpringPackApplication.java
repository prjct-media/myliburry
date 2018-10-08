package com.myliburry.SpringPack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *                                                                                        
 * @SpringBootApplication -> Provides the annotations below.                 
 *                
 * @Configuration -> marks class as source of bean definitions for the application context  
 *                                                                                             
 * @EnableAutoConfiguration-> tells SpringBoot to add beans based on classpath settings,   
 * 							  other beans, and various property settings.                   
 *                                                                                             
 * @EnableWebMvc -> flags application as a web application and activates vital behaviors    
 * 				    such as setting up a Dispatcher Servlet                                 
 * 				    Added automatically when it sees spring-webmvc on classpath.  
 * 
 * @ComponentScan -> tells Spring to look for other components, configurations, and services
 * 					in the root package (com.myliburry.SpringPack)
 */

@SpringBootApplication
public class SpringPackApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPackApplication.class, args);
	}
}
