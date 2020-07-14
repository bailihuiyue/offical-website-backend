package offical_website.site.controller;

import offical_website.site.model.User;
import offical_website.site.responseType.LoginRes;
import offical_website.site.tools.ApiException;
import offical_website.site.tools.MD5Utils;
import offical_website.site.tools.Result;
import offical_website.site.tools.TokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import offical_website.site.service.impl.*;

import java.util.List;

@Api(tags = "用户管理")
@RestController
@RequestMapping(value = "/User")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    TokenUtils tokenUtils;
    MD5Utils md5;

    @GetMapping("/GetUserAll")
    @ApiOperation(value = "获取用户列表", notes = "查询所有用户")
    public Result<List<User>> getUser(@RequestHeader("token") String token) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(userService.getUserAll());
    }

    @PostMapping("/Login")
    @ApiOperation(value = "登陆", notes = "用户名密码登陆")
    public Result<LoginRes> postUser(@Valid @RequestBody User user) throws Exception {

        User userInfo = userService.login(user.getLoginName(), md5.md5(user.getPassword()));
        LoginRes login = new LoginRes();
        if (userInfo != null) {
            login.bRes = true;
            login.Ticket = tokenUtils.token(user.getLoginName(), user.getPassword());
            return Result.success(login);
        } else {
            login.bRes = false;
            login.Ticket = null;
            throw ApiException.handleException("用户名或密码不正确,请重试!");
        }
    }
}