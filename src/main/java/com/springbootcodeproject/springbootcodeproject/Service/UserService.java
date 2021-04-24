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

@Service
public class UserService {

    List<User> users = new ArrayList<User>();

    public List<User> getAllUsers(){
        return users;
    }

    public User create(User user) {
        users.add(user);
        return user;
    }

    public User read(Integer id) {
        return users.get(id);
    }

    public User update(Integer id, User user) {
        user.setId(id);
        User prevUser = users.set(id, user);
        return prevUser;
    }

    public void delete(Integer id) {
        users.remove(id);
    }
}
