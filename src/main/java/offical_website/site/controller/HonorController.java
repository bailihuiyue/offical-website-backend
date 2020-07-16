package offical_website.site.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import offical_website.site.model.Honor;
import offical_website.site.service.impl.HonorServiceImpl;
import offical_website.site.tools.ApiException;
import offical_website.site.tools.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Api(tags = "荣誉墙管理")
@RestController
@RequestMapping(value = "/Honor")
public class HonorController {

    @Autowired
    HonorServiceImpl honorService;

    @PostMapping("/CreateHonor")
    @ApiOperation(value = "创建荣誉墙", notes = "创建荣誉墙")
    public Result<Integer> createHonor(@RequestHeader("token") String token, @Valid @RequestBody Honor honorModel) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(honorService.createHonor(honorModel.getRemark(), honorModel.getImg()));
    }

    @GetMapping("/DeleteHonor")
    @ApiOperation(value = "删除荣誉墙", notes = "删除荣誉墙")
    public Result<Integer> deleteHonor(@RequestHeader("token") String token, @RequestParam int id) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(honorService.deleteHonor(id));
    }

    @PostMapping("/ModifiedHonor")
    @ApiOperation(value = "修改荣誉墙", notes = "创建荣誉墙")
    public Result<Integer> modifiedHonor(@RequestHeader("token") String token, @Valid @RequestBody Honor honorModel) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(honorService.updateHonor(honorModel.getRemark(),honorModel.getId(), honorModel.getImg()));
    }

    @GetMapping("/GetHonorAll")
    @ApiOperation(value = "获取荣誉墙列表", notes = "查询所有荣誉墙")
    public Result<List<Honor>> getHonorAll(@RequestHeader("token") String token) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(honorService.getHonorAll());
    }

    @GetMapping("/GetHonorById/{id}")
    @ApiOperation(value = "获取荣誉墙列表", notes = "查询所有荣誉墙")
    public Result<Honor> getHonorById(@RequestHeader("token") String token, @PathVariable long id) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(honorService.getHonorById(id));
    }
}