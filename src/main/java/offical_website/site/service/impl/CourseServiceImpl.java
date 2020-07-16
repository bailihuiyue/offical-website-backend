package offical_website.site.service.impl;

import offical_website.site.dao.CourseMapper;
import offical_website.site.model.Course;
import offical_website.site.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseMapper courseMapper;

    @Override
    public int createCourse(String year, String content) {
        int course = courseMapper.createCourse(year, content);
        return course;
    }

    @Override
    public int deleteCourse(long id) {
        int course = courseMapper.deleteCourse(id);
        return course;
    }

    @Override
    public int updateCourse(String year, long id, String content) {
        int course = courseMapper.updateCourse(year, id, content);
        return course;
    }

    @Override
    public List<Course> getCourseAll() {
        List<Course> course = courseMapper.getCourseAll();
        return course;
    }

    @Override
    public Course getCourseById(long id) {
        Course course = courseMapper.getCourseById(id);
        return course;
    }
}