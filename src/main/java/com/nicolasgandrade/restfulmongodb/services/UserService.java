package com.nicolasgandrade.restfulmongodb.services;

import com.nicolasgandrade.restfulmongodb.domain.User;
import com.nicolasgandrade.restfulmongodb.repository.UserRepository;
import com.nicolasgandrade.restfulmongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired //O autowired instancia automaticamente
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }
}
