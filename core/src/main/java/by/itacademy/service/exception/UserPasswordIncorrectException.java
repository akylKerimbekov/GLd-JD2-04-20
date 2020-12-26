package by.itacademy.service.exception;

public class UserPasswordIncorrectException extends RuntimeException{
    public UserPasswordIncorrectException(String login) {
        super(login);
    }
}
