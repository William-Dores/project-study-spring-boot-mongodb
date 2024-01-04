package com.estudo.workshopmongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudo.workshopmongodb.domain.User;
import com.estudo.workshopmongodb.repository.UserRepository;
import com.estudo.workshopmongodb.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
		@Autowired
		private UserRepository repo;
		
		public List<User> findAll(){
			return repo.findAll();
		}
		
		public User findById(String id){
			Optional<User> obj = repo.findById(id);
			return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
			
//			User user = repo.findOne(id);
//			if (user == null) {
//				throw new ObjectNotFoundException("Object not found!");
//			}
//			return user;
		}	
}
