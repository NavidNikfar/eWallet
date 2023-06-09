package repository.impl;

import repository.UserRepository;

import java.sql.Connection;


public class UserRepositoryImpl implements UserRepository {

    Connection connection;

    public UserRepImpl(Connection connection) {
        this.connection = connection;
    }


}
