package offical_website.site.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import offical_website.site.model.Course;
import offical_website.site.service.impl.CourseServiceImpl;
import offical_website.site.tools.ApiException;
import offical_website.site.tools.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Api(tags = "发展历程管理")
@RestController
@RequestMapping(value = "/Course")
public class CourseController {

    @Autowired
    CourseServiceImpl courseService;

    @PostMapping("/CreateCourse")
    @ApiOperation(value = "创建发展历程", notes = "创建发展历程")
    public Result<Integer> createCourse(@RequestHeader("token") String token, @Valid @RequestBody Course courseModel) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(courseService.createCourse(courseModel.getYear(), courseModel.getContent()));
    }

    @GetMapping("/DeleteCourse")
    @ApiOperation(value = "删除发展历程", notes = "删除发展历程")
    public Result<Integer> deleteCourse(@RequestHeader("token") String token, @RequestParam long id) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(courseService.deleteCourse(id));
    }

    @PostMapping("/ModifiedCourse")
    @ApiOperation(value = "修改发展历程", notes = "创建发展历程")
    public Result<Integer> modifiedCourse(@RequestHeader("token") String token, @Valid @RequestBody Course courseModel) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(courseService.updateCourse(courseModel.getYear(),courseModel.getId(), courseModel.getContent()));
    }

    @GetMapping("/GetCourseAll")
    @ApiOperation(value = "获取发展历程列表", notes = "查询所有发展历程")
    public Result<List<Course>> getCourseAll(@RequestHeader("token") String token) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(courseService.getCourseAll());
    }

    @GetMapping("/GetCourseById/{id}")
    @ApiOperation(value = "获取发展历程列表", notes = "查询所有发展历程")
    public Result<Course> getCourseById(@RequestHeader("token") String token, @PathVariable long id) throws Exception {
        ApiException.invalidToken(token);
        return Result.success(courseService.getCourseById(id));
    }
}