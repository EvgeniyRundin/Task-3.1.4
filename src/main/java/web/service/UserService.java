package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user, long[] role_id);

    User getUserById(Long id);

    void updateUser(User user, long[] role_id);

    void deleteUser(Long id);

    List<User> getAllUsers();

    User getUserByName(String name);
}
