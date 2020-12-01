package com.infosys.apimo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class ApimoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApimoApplication.class, args);
	}
	@GetMapping(value = "/api/apimo")
	public List<Object> getval() {
		RestTemplate restTemplate=new RestTemplate();
		List<Object> ob=restTemplate.getForObject("https://maddulasai77-eval-test.apigee.net/demo-api", List.class);
		
		return ob;
		
	}

}
