package com.self.starter.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.self.starter.autoconfig.HelloService;

@RestController
public class HelloController {
	
	@Autowired
	HelloService helloService;
	
	/*
	 * http://localhost:8080/hello在页面上直接方法,就成功了,非常简单
	 */
	@GetMapping("/hello")
	public String hello() {
		return helloService.sayHelloAtguigu("测试我们自己定义的SpringBoot的Starter");
	}
}
