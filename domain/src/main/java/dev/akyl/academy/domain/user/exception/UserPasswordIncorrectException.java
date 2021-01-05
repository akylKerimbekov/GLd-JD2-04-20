package dev.akyl.academy.domain.user.exception;

public class UserPasswordIncorrectException extends RuntimeException{
    public UserPasswordIncorrectException(String login) {
        super(login);
    }
}
