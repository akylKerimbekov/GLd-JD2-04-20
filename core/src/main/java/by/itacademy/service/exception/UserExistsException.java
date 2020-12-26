package by.itacademy.service.exception;

public class UserExistsException extends RuntimeException{
    public UserExistsException(String login) {
        super(login);
    }
}
