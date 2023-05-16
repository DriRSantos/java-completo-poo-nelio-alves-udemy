package com.udemynelio.workshopspringjpa.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.udemynelio.workshopspringjpa.entities.User;
import com.udemynelio.workshopspringjpa.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception { 
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); // colocou null no id, pois ele será gerado pelo banco de dados automaticamente
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
}
