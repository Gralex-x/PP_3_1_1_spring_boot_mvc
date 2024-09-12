package ru.gralexx.PP_3_1_1_spring_boot_mvc.PP_3_1_1_spring_boot_mvc.dao;


import ru.gralexx.PP_3_1_1_spring_boot_mvc.PP_3_1_1_spring_boot_mvc.model.User;

import java.util.List;

public interface UserDao {

    List<User> getUsers();

    List<User> getLimitedUsers(int count);

    User getUserById(int id);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

}
