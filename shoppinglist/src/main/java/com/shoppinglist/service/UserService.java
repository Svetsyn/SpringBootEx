package com.shoppinglist.service;

import com.shoppinglist.model.servise.UserServiceModel;

public interface UserService {
    void register(UserServiceModel userServiceModel);


    UserServiceModel findByNameAndPassword(String username, String password);
}
