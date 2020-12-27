package dev.akyl.academy.domain.user.usecase;

import dev.akyl.academy.domain.user.User;
import dev.akyl.academy.domain.user.adapter.UserRepository;

import java.util.List;

public class FindUser {

    private UserRepository userRepository;

    public FindUser(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    public List<User> findAllUsers(){
        return userRepository.findAllUsers();
    }
}
