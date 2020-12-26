package by.itacademy.service.user;

import by.itacademy.entity.User;
import by.itacademy.service.exception.UserExistsException;
import by.itacademy.service.util.PasswordDecoder;
import by.itacademy.service.util.UserRepository;

public class CreateUser {

    private UserRepository userRepository;
    private PasswordDecoder passwordDecoder;

    public CreateUser(UserRepository userRepository, PasswordDecoder passwordDecoder) {
        this.userRepository = userRepository;
        this.passwordDecoder = passwordDecoder;
    }

    public User createUser(User user) {
        if (userRepository.findByLogin(user.getLogin()) != null) {
            throw new UserExistsException(user.getLogin());
        }
        user.setPassword(passwordDecoder.decode(user.getPassword()));
        return userRepository.create(user);
    }
}
