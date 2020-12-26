package by.itacademy.service.user;

import by.itacademy.entity.User;
import by.itacademy.service.exception.UserNotFindException;
import by.itacademy.service.exception.UserPasswordIncorrectException;
import by.itacademy.service.util.PasswordEncoder;
import by.itacademy.service.util.UserRepository;

public class LoginUser {
    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public LoginUser(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User login(String login, String password){
        User user = userRepository.findByLogin(login);
        if (user == null) {
            throw new UserNotFindException(login);
        }
        String hash = passwordEncoder.encode(password);
        if (!user.getPassword().equals(hash)) {
            throw new UserPasswordIncorrectException(login);
        }
        return user;
    }
}
