package ru.jenkins.sandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsSandboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsSandboxApplication.class, args);
	}


	@GetMapping("/start")
	public String showMessage(){
		return "message";
	}

}
