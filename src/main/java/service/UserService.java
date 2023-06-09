package service;

import entity.User;

public interface UserService {
    void save(User user);
    boolean isUserNameAvailabile(String username);

}
