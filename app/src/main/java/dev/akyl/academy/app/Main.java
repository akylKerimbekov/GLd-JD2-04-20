package dev.akyl.academy.app;

import dev.akyl.academy.config.ConsoleConfig;
import dev.akyl.academy.domain.user.usecase.CreateUser;
import dev.akyl.academy.domain.user.usecase.FindUser;
import dev.akyl.academy.domain.user.usecase.LoginUser;
import dev.akyl.academy.domain.user.User;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var consoleConfig = new ConsoleConfig();
        CreateUser createUser = consoleConfig.createUser();
        FindUser findUser = consoleConfig.findUser();
        LoginUser loginUser = consoleConfig.loginUser();
        User user = new User();
        user.setLogin("akyl");
        user.setName("Akyl");
        user.setPassword("akyl");
        user.setBirthday(LocalDate.now());

        User currentUser = createUser.createUser(user);
        User findedUser = findUser.findByLogin("akyl");
        System.out.println("findedUser: " + findedUser);
        List<User> users = findUser.findAllUsers();
        System.out.println("users: " + users);
        loginUser.login("akyl", "akyl");
        System.out.println("Allowed to login");

    }
}
