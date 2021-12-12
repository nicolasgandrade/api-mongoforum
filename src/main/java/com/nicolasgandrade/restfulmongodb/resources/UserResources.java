package com.nicolasgandrade.restfulmongodb.resources;

import com.nicolasgandrade.restfulmongodb.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        User nicolas = new User("1", "Nicolas", "nicolas@gmail.com");
        User joao = new User("2", "João", "joao@gmail.com");

        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(nicolas, joao));
        return ResponseEntity.ok().body(list);
    }
}
