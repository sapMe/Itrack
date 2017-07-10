package com.saps.product.itrack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class ItrackApplication extends SpringBootServletInitializer {

   
    	 public static void main(final  String[] args) {
    	        SpringApplication.run(ItrackApplication.class, args);
    	    }


    	 @Override 
    	 protected final SpringApplicationBuilder configure(final SpringApplicationBuilder application) { 
    		 return application.sources(ItrackApplication.class); 

    } 

}
