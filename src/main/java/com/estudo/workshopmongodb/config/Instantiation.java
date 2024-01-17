package com.estudo.workshopmongodb.config;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.estudo.workshopmongodb.domain.Post;
import com.estudo.workshopmongodb.domain.User;
import com.estudo.workshopmongodb.dto.AuthorDTO;
import com.estudo.workshopmongodb.repository.PostRepository;
import com.estudo.workshopmongodb.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository; 
	
	@Autowired
	private PostRepository postRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new  SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userRepository.deleteAll();
		postRepository.deleteAll();
		
		User user1 = new User(null,"User111" , "user111@gmail.com");
		User user2 = new User(null,"User222" , "user222@gmail.com");
		User user3 = new User(null,"User333" , "user333@gmail.com");
		
		userRepository.saveAll(Arrays.asList(user1, user2, user3));
		
		Post post1 = new Post(null, sdf.parse("21/03/2021"), "Partiu Viagem", "Vou viajar para SP, abraços!", new AuthorDTO(user1));
		Post post2 = new Post(null, sdf.parse("23/03/2022"), "Bom dia", "Acordei Feliz!", new AuthorDTO(user1));
		
		postRepository.saveAll(Arrays.asList(post1, post2));
		
		user1.getPosts().addAll(Arrays.asList(post1, post2));
		
		userRepository.save(user1);
		
		
	}

}
