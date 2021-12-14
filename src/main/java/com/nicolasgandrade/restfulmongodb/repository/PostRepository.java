package com.nicolasgandrade.restfulmongodb.repository;

import com.nicolasgandrade.restfulmongodb.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
