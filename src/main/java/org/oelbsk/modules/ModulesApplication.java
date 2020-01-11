package org.oelbsk.modules;

import javax.annotation.PostConstruct;

import org.oelbsk.modules.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModulesApplication {

	
	@Autowired
	IService service;	
	
	public static void main(String[] args) {
		SpringApplication.run(ModulesApplication.class, args);
	}

	@PostConstruct
	void init() {
		System.out.println(service.hello());
	}
	
}
