package com.nicolasgandrade.restfulmongodb.services;

import com.nicolasgandrade.restfulmongodb.domain.User;
import com.nicolasgandrade.restfulmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired //O autowired instancia automaticamente
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }
}
