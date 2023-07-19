package com.example.utp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan(value = "com.example.utp.Mapper")
@EnableSwagger2
public class UtpApplication {

	public static void main(String[] args) {
		SpringApplication.run(UtpApplication.class, args);
	}

}
