package tasks.service;


import tasks.model.User;

import java.util.List;

public interface UserService {

    public void addUser(User user);

    public List<User> getAllUsers();

    public void updateUser(User user);

    public void deleteUserById(int id);
}