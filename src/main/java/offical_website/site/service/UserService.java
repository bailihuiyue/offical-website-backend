package offical_website.site.service;

import offical_website.site.model.User;

import java.util.List;

public interface UserService {
    int createUser(String loginName, String password, Boolean isAction);

    int deleteUser(int id);

    int updateUser(long id, String loginName, String password, Boolean isAction);

    List<User> getUserAll();

    User login(String name, String pwd);
}