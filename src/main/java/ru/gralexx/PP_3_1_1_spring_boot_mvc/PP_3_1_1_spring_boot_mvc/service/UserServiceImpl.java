package ru.gralexx.PP_3_1_1_spring_boot_mvc.PP_3_1_1_spring_boot_mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.gralexx.PP_3_1_1_spring_boot_mvc.PP_3_1_1_spring_boot_mvc.dao.UserDao;
import ru.gralexx.PP_3_1_1_spring_boot_mvc.PP_3_1_1_spring_boot_mvc.model.User;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getLimitedUsers(int count) {
        return userDao.getLimitedUsers(count);
    }

    @Override
    @Transactional(readOnly = true)
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }
}
