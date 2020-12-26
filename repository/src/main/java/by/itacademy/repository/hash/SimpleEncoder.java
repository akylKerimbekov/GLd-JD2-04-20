package by.itacademy.repository.hash;

import by.itacademy.service.util.PasswordEncoder;

public class SimpleEncoder implements PasswordEncoder {
    @Override
    public String encode(String password) {
        return password;
    }
}
