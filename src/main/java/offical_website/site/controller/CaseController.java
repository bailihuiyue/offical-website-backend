package offical_website.site.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import offical_website.site.model.Cases;
import offical_website.site.service.impl.CaseServiceImpl;
import offical_website.site.tools.ApiException;
import offical_website.site.tools.Result;
import offical_website.site.tools.TokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Api(tags = "案例管理")
@RestController
@RequestMapping(value = "/Cases")
public class CaseController {

    @Autowired
    CaseServiceImpl caseService;

    @PostMapping("/CreateCases")
    @ApiOperation(value = "创建案例", notes = "创建案例")
    public Result<Integer> createCases(@RequestHeader("token") String token, @Valid @RequestBody Cases casesModel) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(caseService.createCase(casesModel.getImg(), casesModel.getTitle(), casesModel.getContent()));
    }

    @GetMapping("/DeleteCases")
    @ApiOperation(value = "删除案例", notes = "删除案例")
    public Result<Integer> deleteCases(@RequestHeader("token") String token, @RequestParam int id) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(caseService.deleteCase(id));
    }

    @PostMapping("/ModifiedCases")
    @ApiOperation(value = "修改案例", notes = "创建案例")
    public Result<Integer> modifiedCases(@RequestHeader("token") String token, @Valid @RequestBody Cases casesModel) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(caseService.updateCase(casesModel.getId(), casesModel.getImg(), casesModel.getTitle(), casesModel.getContent()));
    }

    @GetMapping("/GetCasesAll")
    @ApiOperation(value = "获取案例列表", notes = "查询所有案例")
    public Result<List<Cases>> getCasesAll(@RequestHeader("token") String token) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(caseService.getCaseAll());
    }

    @GetMapping("/GetCasesById/{id}")
    @ApiOperation(value = "获取案例列表", notes = "查询所有案例")
    public Result<Cases> getCasesById(@RequestHeader("token") String token,@PathVariable long id) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(caseService.getCaseById(id));
    }
}