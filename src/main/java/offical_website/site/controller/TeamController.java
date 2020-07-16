package offical_website.site.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import offical_website.site.model.Team;
import offical_website.site.service.impl.TeamServiceImpl;
import offical_website.site.tools.ApiException;
import offical_website.site.tools.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Api(tags = "团队管理")
@RestController
@RequestMapping(value = "/Team")
public class TeamController {

    @Autowired
    TeamServiceImpl teamService;

    @PostMapping("/CreateTeam")
    @ApiOperation(value = "创建团队", notes = "创建团队")
    public Result<Integer> createTeam(@RequestHeader("token") String token, @Valid @RequestBody Team teamModel) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(teamService.createTeam(teamModel.getRemark(), teamModel.getImg()));
    }

    @GetMapping("/DeleteTeam")
    @ApiOperation(value = "删除团队", notes = "删除团队")
    public Result<Integer> deleteTeam(@RequestHeader("token") String token, @RequestParam int id) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(teamService.deleteTeam(id));
    }

    @PostMapping("/ModifiedTeam")
    @ApiOperation(value = "修改团队", notes = "创建团队")
    public Result<Integer> modifiedTeam(@RequestHeader("token") String token, @Valid @RequestBody Team teamModel) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(teamService.updateTeam(teamModel.getRemark(),teamModel.getId(), teamModel.getImg()));
    }

    @GetMapping("/GetTeamAll")
    @ApiOperation(value = "获取团队列表", notes = "查询所有团队")
    public Result<List<Team>> getTeamAll(@RequestHeader("token") String token) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(teamService.getTeamAll());
    }

    @GetMapping("/GetTeamById/{id}")
    @ApiOperation(value = "获取团队列表", notes = "查询所有团队")
    public Result<Team> getTeamById(@RequestHeader("token") String token, @PathVariable long id) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(teamService.getTeamById(id));
    }
}