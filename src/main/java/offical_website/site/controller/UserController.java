package offical_website.site.controller;

import offical_website.site.model.User;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "用户管理")
@RestController
@RequestMapping(value = "/users")  
public class UserController  {
    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<>());

    @GetMapping("/getUser")
    @ApiOperation(value = "获取用户列表",notes = "查询所有用户")
    public String getUser() {
        return "Hello World";
    }

    @PostMapping("/")
    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
    public String postUser(@Valid @RequestBody User user) {
        users.put(user.getId(), user);
        return "success";
    }
}