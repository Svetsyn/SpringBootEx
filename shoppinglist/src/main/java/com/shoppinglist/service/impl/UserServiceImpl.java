package com.shoppinglist.service.impl;

import com.shoppinglist.model.entity.User;
import com.shoppinglist.model.servise.UserServiceModel;
import com.shoppinglist.repository.UserRepository;
import com.shoppinglist.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final  ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void register(UserServiceModel userServiceModel) {

    userRepository.save(modelMapper.map(userServiceModel, User.class));
    }

    @Override
    public UserServiceModel findByNameAndPassword(String username, String password) {
//        User user = userRepository.findByUsernameAndPassword(username, password).orElse(null);
//        return modelMapper.map(user,UserServiceModel.class);

        return userRepository.findByUsernameAndPassword(username,password)
                .map(user->modelMapper.map(user,UserServiceModel.class))
                .orElse(null);
    }
}
