package offical_website.site.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "用户管理")
@RestController
@RequestMapping(value = "/users")  
public class UserController  {

    @GetMapping("/getUser")
    @ApiOperation(value = "获取用户列表")
    public String getUser() {
        return "Hello World";
    }

}