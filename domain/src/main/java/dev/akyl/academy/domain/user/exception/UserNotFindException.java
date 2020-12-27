package dev.akyl.academy.domain.user.exception;

public class UserNotFindException extends RuntimeException{
    public UserNotFindException(String login) {
        super(login);
    }
}
