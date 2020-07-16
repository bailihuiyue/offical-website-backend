package offical_website.site.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import offical_website.site.model.Enterprise;
import offical_website.site.service.impl.EnterpriseServiceImpl;
import offical_website.site.tools.ApiException;
import offical_website.site.tools.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Api(tags = "合作企业管理")
@RestController
@RequestMapping(value = "/Enterprise")
public class EnterpriseController {

    @Autowired
    EnterpriseServiceImpl enterpriseService;

    @PostMapping("/CreateEnterprise")
    @ApiOperation(value = "创建合作企业", notes = "创建合作企业")
    public Result<Integer> createEnterprise(@RequestHeader("token") String token, @Valid @RequestBody Enterprise enterpriseModel) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(enterpriseService.createEnterprise(enterpriseModel.getRemark(), enterpriseModel.getImg()));
    }

    @GetMapping("/DeleteEnterprise")
    @ApiOperation(value = "删除合作企业", notes = "删除合作企业")
    public Result<Integer> deleteEnterprise(@RequestHeader("token") String token, @RequestParam int id) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(enterpriseService.deleteEnterprise(id));
    }

    @PostMapping("/ModifiedEnterprise")
    @ApiOperation(value = "修改合作企业", notes = "创建合作企业")
    public Result<Integer> modifiedEnterprise(@RequestHeader("token") String token, @Valid @RequestBody Enterprise enterpriseModel) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(enterpriseService.updateEnterprise(enterpriseModel.getRemark(),enterpriseModel.getId(), enterpriseModel.getImg()));
    }

    @GetMapping("/GetEnterpriseAll")
    @ApiOperation(value = "获取合作企业列表", notes = "查询所有合作企业")
    public Result<List<Enterprise>> getEnterpriseAll(@RequestHeader("token") String token) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(enterpriseService.getEnterpriseAll());
    }

    @GetMapping("/GetEnterpriseById/{id}")
    @ApiOperation(value = "获取合作企业列表", notes = "查询所有合作企业")
    public Result<Enterprise> getEnterpriseById(@RequestHeader("token") String token, @PathVariable long id) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(enterpriseService.getEnterpriseById(id));
    }
}