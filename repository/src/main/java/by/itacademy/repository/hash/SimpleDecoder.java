package by.itacademy.repository.hash;

import by.itacademy.service.util.PasswordDecoder;

public class SimpleDecoder implements PasswordDecoder {
    @Override
    public String decode(String password) {
        return password;
    }
}
