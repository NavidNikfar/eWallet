package service.impl;

import entity.User;
import service.UserService;
import repository.UserRepository;


public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void save(User user) {
        if(!isUserNameAvailabile(user.getName())) {
            System.out.println("Error : User Name is NOT Available!");
            return;
        }

        userRepository.save(user);
    }


    @Override
    public boolean isUserNameAvailabile(String username) {
        return userRepository.isUserNameAvailabile(username);
    }


}
