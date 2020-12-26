package by.itacademy.service.exception;

public class UserNotFindException extends RuntimeException{
    public UserNotFindException(String login) {
        super(login);
    }
}
