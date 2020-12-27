package dev.akyl.academy.config;

import dev.akyl.academy.adapter.repository.inmemory.InMemoryUserRepository;
import dev.akyl.academy.adapter.encryption.SimpleEncryptionUser;
import dev.akyl.academy.domain.user.adapter.UserPasswordEncryption;
import dev.akyl.academy.domain.user.usecase.CreateUser;
import dev.akyl.academy.domain.user.usecase.FindUser;
import dev.akyl.academy.domain.user.usecase.LoginUser;
import dev.akyl.academy.domain.user.adapter.UserRepository;

public class ConsoleConfig {
    private UserRepository userRepository = new InMemoryUserRepository();
    private UserPasswordEncryption userPasswordEncryption = new SimpleEncryptionUser();

    public CreateUser createUser() {
        return new CreateUser(userRepository, userPasswordEncryption);
    }

    public FindUser findUser() {
        return new FindUser(userRepository);
    }

    public LoginUser loginUser() {
        return new LoginUser(userRepository, userPasswordEncryption);
    }
}
