package dev.akyl.academy.domain.user.adapter;

import dev.akyl.academy.domain.user.User;

import java.util.List;

public interface UserRepository {
    User create(User user);

    User findByLogin(String login);

    List<User> findAllUsers();
}
