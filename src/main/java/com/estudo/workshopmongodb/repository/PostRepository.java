package com.estudo.workshopmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.estudo.workshopmongodb.domain.Post;


public interface PostRepository extends MongoRepository<Post, String> {

}
