package com.nbeverton.dio_santander_bootcamp.domain.service;

import com.nbeverton.dio_santander_bootcamp.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
