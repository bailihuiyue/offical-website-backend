package offical_website.site.service;

import offical_website.site.model.User;

import java.util.List;

public interface UserService {

    /**
     * 新增一个用户
     *
     * @param name
     * @param age
     */
//    int create(String name, Integer age);

    /**
     * 根据name查询用户
     *
     * @param name
     * @return
     */
    User getByName(String name);
    User login(String name,String pwd);
    List<User> getUserAll();
    /**
     * 根据name删除用户
     *
     * @param name
     */
//    int deleteByName(String name);

    /**
     * 获取用户总量
     */
//    int getAllUsers();

    /**
     * 删除所有用户
     */
//    int deleteAllUsers();

}