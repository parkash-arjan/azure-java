package com.fibonacci.rs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fibonacci.model.beans.HelloAzureBean;

@RestController
public class HelloAzureController {

	//@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	@GetMapping(path = "/azure")
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping(path = "/hello-world-bean")
	public HelloAzureBean helloWorldBean() {
		return new HelloAzureBean("Hello World-Bean");
	}

	@GetMapping(path = "/hello-world-bean/path-variable/{name}")
	public HelloAzureBean helloWorldBean(@PathVariable String name) {
		return new HelloAzureBean("Hello World-Bean  " + name);
	}
}
