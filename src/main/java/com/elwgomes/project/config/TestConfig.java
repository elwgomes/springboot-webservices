package com.elwgomes.project.config;

import com.elwgomes.project.entities.User;
import com.elwgomes.project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(
                null,
                "Leonardo Gomes",
                "leo@leo.com",
                "988885555",
                "senha123"
        );
        User u2 = new User(
                null,
                "Francisco Guilherme",
                "gui@gui.com",
                "966662222",
                "123senha"
        );

        userRepository.saveAll(Arrays.asList(u1, u2));

    }
}
