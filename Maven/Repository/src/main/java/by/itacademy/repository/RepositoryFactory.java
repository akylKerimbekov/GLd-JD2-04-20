package by.itacademy.repository;

import by.itacademy.repository.cache.RepositoryCache;

public class RepositoryFactory {
    public static Repository buildRepository() {
        return new RepositoryCache();
    }
}
