package com.nicolasgandrade.restfulmongodb.services;

import com.nicolasgandrade.restfulmongodb.domain.Post;
import com.nicolasgandrade.restfulmongodb.repository.PostRepository;
import com.nicolasgandrade.restfulmongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    public List<Post> findByTitle(String text) {
        return repo.findByTitleContainingIgnoreCase(text);
    }

}
