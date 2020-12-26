package by.itacademy.service.util;

import by.itacademy.entity.User;

import java.util.List;

public interface UserRepository {
    User create(User user);

    User findByLogin(String login);

    List<User> findAllUsers();
}
