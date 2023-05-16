package com.malek.users.service;

import java.util.List;

import com.malek.users.entities.Role;
import com.malek.users.entities.User;

public interface UserService {
User saveUser(User user);
User findUserByUsername (String username);
Role addRole(Role role);
User addRoleToUser(String username, String rolename);
List<User> findAllUsers();
}
