package by.itacademy.config;

import by.itacademy.repository.InMemoryUserRepository;
import by.itacademy.repository.hash.SimpleDecoder;
import by.itacademy.repository.hash.SimpleEncoder;
import by.itacademy.service.user.CreateUser;
import by.itacademy.service.user.FindUser;
import by.itacademy.service.user.LoginUser;
import by.itacademy.service.util.PasswordDecoder;
import by.itacademy.service.util.PasswordEncoder;
import by.itacademy.service.util.UserRepository;

public class ConsoleConfig {
    private UserRepository userRepository = new InMemoryUserRepository();
    private PasswordDecoder passwordDecoder = new SimpleDecoder();
    private PasswordEncoder passwordEncoder = new SimpleEncoder();

    public CreateUser createUser() {
        return new CreateUser(userRepository, passwordDecoder);
    }

    public FindUser findUser() {
        return new FindUser(userRepository);
    }

    public LoginUser loginUser() {
        return new LoginUser(userRepository, passwordEncoder);
    }
}
