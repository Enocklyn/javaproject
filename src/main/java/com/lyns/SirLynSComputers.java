package com.lyns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication

@EnableAutoConfiguration
public class SirLynSComputers extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SirLynSComputers.class); //To change body of generated methods, choose Tools | Templates.
    }
   public static void main(String[] args) {
		SpringApplication.run(SirLynSComputers.class, args);
	     
// System.exit(0);
        
        }
 
}
