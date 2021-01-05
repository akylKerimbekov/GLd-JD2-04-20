package dev.akyl.academy.adapter.encryption;

import dev.akyl.academy.domain.user.adapter.UserPasswordEncryption;

public class SimpleEncryptionUser implements UserPasswordEncryption {
    @Override
    public String decode(String password) {
        return password;
    }

    @Override
    public String encode(String password) {
        return password;
    }
}
