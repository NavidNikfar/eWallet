package repository.impl;

import repository.UserRepo;

import java.sql.Connection;


public class UserRepImpl implements UserRepo {

    Connection connection;

    public UserRepImpl(Connection connection) {
        this.connection = connection;
    }


}
