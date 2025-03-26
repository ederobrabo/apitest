package com.eder.apitest.services;

import com.eder.apitest.domain.user.User;
import com.eder.apitest.domain.user.UserDTO;
import com.eder.apitest.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUser(UUID id) throws Exception {
        return userRepository.findById(id).orElseThrow(() -> new Exception("usuário não encontrado"));
    }

    public User createUser(UserDTO data) {
        User newUser = new User(data);
        return userRepository.save(newUser);
    }

    public User updateUser(UUID id, UserDTO data) throws Exception {
        User user = userRepository.findById(id).orElseThrow(() -> new Exception("usuário não encontrado"));
        user.setFirstName(data.firstName());
        user.setLastName(data.lastName());
        user.setLogin(data.login());
        user.setPassword(data.password());
        return userRepository.save(user);
    }

    public void deleteUser(UUID id) {
        userRepository.deleteById(id);
    }
}
