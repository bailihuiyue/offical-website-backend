package offical_website.site.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import offical_website.site.model.Dictionary;
import offical_website.site.service.impl.DictionaryServiceImpl;
import offical_website.site.tools.ApiException;
import offical_website.site.tools.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Api(tags = "数据字典管理")
@RestController
@RequestMapping(value = "/Dictionary")
public class DictionaryController {

    @Autowired
    DictionaryServiceImpl dictionaryService;

    @PostMapping("/CreateDictionary")
    @ApiOperation(value = "创建数据字典", notes = "创建数据字典")
    public Result<Integer> createDictionary(@RequestHeader("token") String token, @Valid @RequestBody Dictionary dictionaryModel) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(dictionaryService.createDictionary(dictionaryModel.getDictKey(), dictionaryModel.getContent()));
    }

    @GetMapping("/DeleteDictionary")
    @ApiOperation(value = "删除数据字典", notes = "删除数据字典")
    public Result<Integer> deleteDictionary(@RequestHeader("token") String token, @RequestParam int id) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(dictionaryService.deleteDictionary(id));
    }

    @PostMapping("/ModifiedDictionary")
    @ApiOperation(value = "修改数据字典", notes = "创建数据字典")
    public Result<Integer> modifiedDictionary(@RequestHeader("token") String token, @Valid @RequestBody Dictionary dictionaryModel) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(dictionaryService.updateDictionary(dictionaryModel.getDictKey(),dictionaryModel.getId(), dictionaryModel.getContent()));
    }

    @GetMapping("/GetDictionaryAll")
    @ApiOperation(value = "获取数据字典列表", notes = "查询所有数据字典")
    public Result<List<Dictionary>> getDictionaryAll(@RequestHeader("token") String token) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(dictionaryService.getDictionaryAll());
    }

    @GetMapping("/GetDictionaryById/{id}")
    @ApiOperation(value = "获取数据字典列表", notes = "查询所有数据字典")
    public Result<Dictionary> getDictionaryById(@RequestHeader("token") String token, @PathVariable long id) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(dictionaryService.getDictionaryById(id));
    }
}