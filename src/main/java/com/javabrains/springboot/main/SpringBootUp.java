package com.javabrains.springboot.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Libin on 1/29/2017.
 */

@SpringBootApplication(scanBasePackages = {"com.javabrains.springboot"})
@EnableJpaRepositories(basePackages  ={"com.javabrains.springboot.service"})
@EntityScan(basePackages  ={"com.javabrains.springboot"})
public class SpringBootUp {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootUp.class,args);
    }
}
