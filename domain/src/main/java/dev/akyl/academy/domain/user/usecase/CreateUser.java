package dev.akyl.academy.domain.user.usecase;

import dev.akyl.academy.domain.user.adapter.UserPasswordEncryption;
import dev.akyl.academy.domain.user.User;
import dev.akyl.academy.domain.user.exception.UserExistsException;
import dev.akyl.academy.domain.user.adapter.UserRepository;

public class CreateUser {

    private UserRepository userRepository;
    private UserPasswordEncryption userPasswordEncryption;

    public CreateUser(UserRepository userRepository, UserPasswordEncryption userPasswordEncryption) {
        this.userRepository = userRepository;
        this.userPasswordEncryption = userPasswordEncryption;
    }

    public User createUser(User user) {
        if (userRepository.findByLogin(user.getLogin()) != null) {
            throw new UserExistsException(user.getLogin());
        }
        user.setPassword(userPasswordEncryption.decode(user.getPassword()));
        return userRepository.create(user);
    }
}
