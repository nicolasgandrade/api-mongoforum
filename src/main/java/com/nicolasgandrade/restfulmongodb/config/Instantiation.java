package com.nicolasgandrade.restfulmongodb.config;

import com.nicolasgandrade.restfulmongodb.domain.Post;
import com.nicolasgandrade.restfulmongodb.domain.User;
import com.nicolasgandrade.restfulmongodb.dto.AuthorDTO;
import com.nicolasgandrade.restfulmongodb.repository.PostRepository;
import com.nicolasgandrade.restfulmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        //Deleta o que está no  banco para inserir os novos objetos
        userRepository.deleteAll();
        postRepository.deleteAll();

        User maria = new User(null, "Maria Souza", "maria@gmail.com");
        User rafaela = new User(null, "Rafaela Gomes", "rafaela@gmail.com");
        User gustavo = new User(null, "Gustavo Vieira", "gustavo@gmail.com");

        //Salva primeiro os usuários para depois serem passados ao AuthorDTO
        userRepository.saveAll(Arrays.asList(maria, rafaela, gustavo));

        Post post1 = new Post(null, sdf.parse("12/12/2012"), "Hoje é um dia especial", "Hoje é dia 12, do mês 12, no ano de 2012!", new AuthorDTO(maria));
        Post post2 = new Post(null, sdf.parse("01/01/2013"), "Feliz ano novo!", "Feliz ano novo, galera! Um ano muito próspero para vocês!", new AuthorDTO(rafaela));

        postRepository.saveAll(Arrays.asList(post1, post2));

    }


}
