package tasks.dao;

import tasks.model.User;

import java.util.List;

public interface UserDao {

    public void addUser(User user);
    public List<User> getAllUsers();
    public User getUserById(int id);
    public void updateUser(User user);
    public void deleteUserById(int id);

}
