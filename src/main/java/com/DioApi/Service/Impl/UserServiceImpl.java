package com.DioApi.Service.Impl;

import com.DioApi.Models.User;
import com.DioApi.Repositories.UserRepository;
import com.DioApi.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(repository.existsByAccountId(userToCreate.getAccount().getId())){
            throw new IllegalArgumentException("This account already exists");
        }
        return repository.save(userToCreate);
    }
}
