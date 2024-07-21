package br.com.cfarias.zookeeper_client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cfarias.zookeeper_client.client.HelloWorldClient;

@RestController
public class HelloWorldController {

	@Autowired
	private HelloWorldClient helloWorldClient;

	@GetMapping("/greetings")
	public String helloWorld() {
		return helloWorldClient.HelloWorld();
	}


}
