package br.com.fiap.checkpoint1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Checkpoint1Controller {

	@Autowired
	public Environment ambiente;
	
	@GetMapping("/ping")
	public String ping() {
		if("dev".equals(ambiente.getProperty("spring.profiles.active"))){
			return "pong em dev";
		}
		else if("stg".equals(ambiente.getProperty("spring.profiles.active"))){
			return "pong em stg";
		}
		else if ("prd".equals(ambiente.getProperty("spring.profiles.active"))){
			return "pong em prd";
		}
		else {
			return "pong";
		}
		
		
	}
	
}
