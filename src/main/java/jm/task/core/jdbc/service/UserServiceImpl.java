package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    private static final UserDao uDjbdc = new UserDaoJDBCImpl();
    public void createUsersTable() {
        uDjbdc.createUsersTable();
    }

    public void dropUsersTable() {
        uDjbdc.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        uDjbdc.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        uDjbdc.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return uDjbdc.getAllUsers();
    }

    public void cleanUsersTable() {
        uDjbdc.cleanUsersTable();
    }
}
