package dev.akyl.academy.domain.user.adapter;

public interface UserPasswordEncryption {
    String decode(String password);
    String encode(String password);
}
