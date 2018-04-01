package com.edu.sdju.jounghu.mybatisgdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class MybatisGDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisGDemoApplication.class, args);
	}
}
