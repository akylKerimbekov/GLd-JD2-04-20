package dev.akyl.academy.domain.user.usecase;

import dev.akyl.academy.domain.user.adapter.UserPasswordEncryption;
import dev.akyl.academy.domain.user.User;
import dev.akyl.academy.domain.user.exception.UserNotFindException;
import dev.akyl.academy.domain.user.exception.UserPasswordIncorrectException;
import dev.akyl.academy.domain.user.adapter.UserRepository;

public class LoginUser {
    private UserRepository userRepository;
    private UserPasswordEncryption userPasswordEncryption;

    public LoginUser(UserRepository userRepository, UserPasswordEncryption userPasswordEncryption) {
        this.userRepository = userRepository;
        this.userPasswordEncryption = userPasswordEncryption;
    }

    public User login(String login, String password){
        User user = userRepository.findByLogin(login);
        if (user == null) {
            throw new UserNotFindException(login);
        }
        String hash = userPasswordEncryption.encode(password);
        if (!user.getPassword().equals(hash)) {
            throw new UserPasswordIncorrectException(login);
        }
        return user;
    }
}
