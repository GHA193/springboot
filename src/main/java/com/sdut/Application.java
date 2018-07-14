package com.sdut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 入口类   SpringBootApplication注解，标识该类是一个springboot入口类，只能出现一次
 * @author Administrator
 *
 */
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		//参数1：入口类的class对象，   参数2：main方法的参数
		SpringApplication.run(Application.class, args);
	}
}
