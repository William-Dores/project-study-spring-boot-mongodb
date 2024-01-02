package com.estudo.workshopmongodb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.estudo.workshopmongodb.domain.User;
import com.estudo.workshopmongodb.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository; 
	
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User user1 = new User(null,"User111" , "user111@gmail.com");
		User user2 = new User(null,"User222" , "user222@gmail.com");
		User user3 = new User(null,"User333" , "user333@gmail.com");
		
		userRepository.saveAll(Arrays.asList(user1, user2, user3));
	}

}
