package repository;

import entity.User;

public interface UserRepository {
    void save(User user);
    boolean isUserNameAvailabile(String username);
}
