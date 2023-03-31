package com.exam.service;

import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.model.exam.Question;
import com.exam.model.exam.Quiz;

import java.util.List;
import java.util.Set;

public interface UserService {

    //creating user
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;

    //get user by id
    public User getUser(Long userId);

    //delete user by id
    public void deleteUser(Long userId);

    public List<User> getAllUsers();


}
