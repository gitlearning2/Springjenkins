package io.mostafa;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringjenkinsApplication {
	
	private static final Logger log = LoggerFactory.getLogger(SpringjenkinsApplication.class);
	@PostConstruct
	public void init() {
		log.info("app started");
	}

	public static void main(String[] args) {
		log.info("startingn main me");
		SpringApplication.run(SpringjenkinsApplication.class, args);
	}

}
