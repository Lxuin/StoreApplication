package com.yal.store.Exercises.UserRegistrationService;

public interface UserRepository {
    void save(User user);
    User findByEmail(String email);
}
