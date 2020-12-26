package by.itacademy.service.user;

import by.itacademy.entity.User;
import by.itacademy.service.util.UserRepository;

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
