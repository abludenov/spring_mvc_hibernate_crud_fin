package ru.jm.spring_mvc_hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.jm.spring_mvc_hibernate.DAO.UserDAO;
import ru.jm.spring_mvc_hibernate.entity.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(final UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public void saveUser(final User user) {
        userDAO.saveUser(user);
    }

    @Override
    public User getUser(final int id) {
        return userDAO.getUser(id);
    }

    @Override
    public void deleteUser(final int id) {
        userDAO.deleteUser(id);
    }
}
