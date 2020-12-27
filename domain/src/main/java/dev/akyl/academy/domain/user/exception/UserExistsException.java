package dev.akyl.academy.domain.user.exception;

public class UserExistsException extends RuntimeException{
    public UserExistsException(String login) {
        super(login);
    }
}
