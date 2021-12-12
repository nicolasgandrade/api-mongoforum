package com.nicolasgandrade.restfulmongodb.repository;

import com.nicolasgandrade.restfulmongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository                                          //<Tipo da classe de domínio, Tipo do Id dessa classe>
public interface UserRepository extends MongoRepository<User, String> {

}
