package com.estudo.workshopmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.estudo.workshopmongodb.domain.User;

public interface UserRepository extends MongoRepository<User, String>{



}
