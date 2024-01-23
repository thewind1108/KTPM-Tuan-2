package com.demo.NguyenThePhong_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.demo.nguyenthephong_product_entity")
public class NguyenThePhongProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(NguyenThePhongProductApplication.class, args);
	}

}
