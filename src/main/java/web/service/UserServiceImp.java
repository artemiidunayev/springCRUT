package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.entity.User;

import java.util.List;

@Service
public class UserServiceImp {
    private final UserDao userDao;

    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }


    @Transactional

    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @Transactional

    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Transactional

    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Transactional

    public User updateUser(int id, User updatedUser) {
        return userDao.updateUser(id, updatedUser);
    }

    @Transactional

    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

}
