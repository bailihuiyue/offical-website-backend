package offical_website.site.controller;

import offical_website.site.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import offical_website.site.service.impl.*;

@Api(tags = "用户管理")
@RestController
@RequestMapping(value = "/User")
public class UserController  {
    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<>());

    @Autowired
    UserServiceImpl userService;

    @GetMapping("/Login")
    @ApiOperation(value = "获取用户列表",notes = "查询所有用户")
    public User getUser(String name) {
        return userService.getByName(name);
    }

    @PostMapping("/")
    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
    public String postUser(@Valid @RequestBody User user) {
        users.put(user.getId(), user);
        return "success";
    }
}