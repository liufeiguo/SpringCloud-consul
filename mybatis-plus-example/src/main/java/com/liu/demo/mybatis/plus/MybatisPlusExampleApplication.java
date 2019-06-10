package com.liu.demo.mybatis.plus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.liu.demo.mybatis.plus.dao")
public class MybatisPlusExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisPlusExampleApplication.class, args);
	}

}
