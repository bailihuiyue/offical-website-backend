package offical_website.site.service.impl;

import offical_website.site.dao.UserMapper;
import offical_website.site.model.User;
import offical_website.site.service.UserService;

import offical_website.site.tools.MD5Utils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public int createUser(String loginName, String password, Boolean isAction) {
        int user = userMapper.createUser(loginName, MD5Utils.md5(password), isAction);
        return user;
    }

    @Override
    public int deleteUser(int id) {
        int user = userMapper.deleteUser(id);
        return user;
    }

    @Override
    public int updateUser(long id, String loginName, String password, Boolean isAction) {
        int user = userMapper.updateUser(id, loginName, MD5Utils.md5(password), isAction);
        return user;
    }

    @Override
    public List<User> getUserAll() {
        List<User> user = userMapper.getUserAll();
        return user;
    }

    @Override
    public User login(String name, String pwd) {
        User user = userMapper.login(name, MD5Utils.md5(pwd));
        return user;
    }
}