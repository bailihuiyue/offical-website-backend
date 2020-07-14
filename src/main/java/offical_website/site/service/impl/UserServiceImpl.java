package offical_website.site.service.impl;

import offical_website.site.dao.UserMapper;
import offical_website.site.model.User;
import offical_website.site.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getByName(String name) {
        User user = userMapper.findByName(name);
        return user;
    }

    @Override
    public User login(String name, String pwd) {
        User user = userMapper.login(name, pwd);
        return user;
    }

    @Override
    public List<User> getUserAll() {
        List<User> user = userMapper.getUserAll();
        return user;
    }
}