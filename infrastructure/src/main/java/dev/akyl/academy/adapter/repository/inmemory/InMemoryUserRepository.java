package dev.akyl.academy.adapter.repository.inmemory;

import dev.akyl.academy.domain.user.User;
import dev.akyl.academy.domain.user.adapter.UserRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryUserRepository implements UserRepository {
    private Map<String, User> inMemoryUsers = new HashMap<>();

    @Override
    public User create(User user) {
        inMemoryUsers.put(user.getLogin(), user);
        return user;
    }

    @Override
    public User findByLogin(String login) {
        return inMemoryUsers.get(login);
    }

    @Override
    public List<User> findAllUsers() {
        return new ArrayList<>(inMemoryUsers.values());
    }
}
