package com.DioApi.Service;

import com.DioApi.Models.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
