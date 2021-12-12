package com.nicolasgandrade.restfulmongodb.config;

import com.nicolasgandrade.restfulmongodb.domain.User;
import com.nicolasgandrade.restfulmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        //Deleta o que está no  banco para inserir os novos objetos
        userRepository.deleteAll();

        User maria = new User(null, "Maria Souza", "maria@gmail.com");
        User rafaela = new User(null, "Rafaela Gomes", "rafaela@gmail.com");

        userRepository.save(maria);
        userRepository.save(rafaela);

    }
}
