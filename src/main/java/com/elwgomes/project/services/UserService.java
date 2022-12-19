package com.elwgomes.project.services;

import org.springframework.stereotype.Service;

import com.elwgomes.project.entities.User;
import com.elwgomes.project.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll () {
        return repository.findAll();
    }

    public User findById (Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }
}
