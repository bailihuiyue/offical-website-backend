package offical_website.site.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import offical_website.site.model.News;
import offical_website.site.service.impl.NewsServiceImpl;
import offical_website.site.tools.ApiException;
import offical_website.site.tools.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Api(tags = "新闻管理")
@RestController
@RequestMapping(value = "/News")
public class NewsController {

    @Autowired
    NewsServiceImpl newsService;

    @PostMapping("/CreateNews")
    @ApiOperation(value = "创建新闻", notes = "创建新闻")
    public Result<Integer> createNews(@RequestHeader("token") String token, @Valid @RequestBody News newsModel) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(newsService.createNews(newsModel.getType(), newsModel.getImg(), newsModel.getTitle(), newsModel.getContent()));
    }

    @GetMapping("/DeleteNews")
    @ApiOperation(value = "删除新闻", notes = "删除新闻")
    public Result<Integer> deleteNews(@RequestHeader("token") String token, @RequestParam int id) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(newsService.deleteNews(id));
    }

    @PostMapping("/ModifiedNews")
    @ApiOperation(value = "修改新闻", notes = "创建新闻")
    public Result<Integer> modifiedNews(@RequestHeader("token") String token, @Valid @RequestBody News newsModel) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(newsService.updateNews(newsModel.getType(),newsModel.getId(), newsModel.getImg(), newsModel.getTitle(), newsModel.getContent()));
    }

    @GetMapping("/GetNewsAll")
    @ApiOperation(value = "获取新闻列表", notes = "查询所有新闻")
    public Result<List<News>> getNewsAll(@RequestHeader("token") String token) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(newsService.getNewsAll());
    }

    @GetMapping("/GetNewsById/{id}")
    @ApiOperation(value = "获取新闻列表", notes = "查询所有新闻")
    public Result<News> getNewsById(@RequestHeader("token") String token, @PathVariable long id) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(newsService.getNewsById(id));
    }
}