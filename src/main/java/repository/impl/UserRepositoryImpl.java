package repository.impl;

import entity.User;
import repository.UserRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserRepositoryImpl implements UserRepository {

    Connection connection;

    public UserRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void save(User user) {
        try {

            PreparedStatement prs = connection.prepareStatement
                    ("INSERT INTO user_table " +
                            "(name)" +
                            " VALUES (?);");

            prs.setString(1, user.getName());

            prs.execute();
            prs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean isUserNameAvailabile(String userName) {
        try {
            PreparedStatement prs = connection.prepareStatement
                    ("SELECT name FROM user_table WHERE name = ?");
            prs.setString(1, userName);
            ResultSet resultSet = prs.executeQuery();
            if (resultSet.next()) {
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }




}
