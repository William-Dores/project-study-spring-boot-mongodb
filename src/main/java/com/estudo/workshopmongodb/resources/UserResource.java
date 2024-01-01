package com.estudo.workshopmongodb.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.estudo.workshopmongodb.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		User teste1 = new User("1", "Teste 111", "teste1@gmail.com");
		User teste2 = new User("2", "Teste 222", "teste2@gmail.com");
		
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(teste1, teste2));
		return ResponseEntity.ok().body(list);
		
	}

}
