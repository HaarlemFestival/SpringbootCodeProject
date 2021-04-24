package com.springbootcodeproject.springbootcodeproject.Service;

import com.springbootcodeproject.springbootcodeproject.Enum.AccountType;
import com.springbootcodeproject.springbootcodeproject.Enum.UserType;
import com.springbootcodeproject.springbootcodeproject.Model.Account;
import com.springbootcodeproject.springbootcodeproject.Model.User;
import com.springbootcodeproject.springbootcodeproject.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    List<User> users = new ArrayList<User>();

    public List<User> getAllUsers(){
        userRepository.findAll().forEach(users::add);
        return users;
    }

    public void create(User user) {
        userRepository.save(user);
    }

    public Optional<User> read(Integer id) {
        return userRepository.findById(id);
    }

    public void update(Integer id, User user) {
        User userDB = userRepository.findById(id).orElseGet(User::new);
        if(userDB != null) {
            user.setId(userDB.getId());
        }
        userRepository.save(user);
    }

    public void delete(Integer id) {
        userRepository.deleteById(id);
    }
}
