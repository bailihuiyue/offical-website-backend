package offical_website.site.service;

import offical_website.site.model.Course;

import java.util.List;

public interface CourseService {
    int createCourse(String year, String content);

    int deleteCourse(long id);

    int updateCourse(String year,long id, String content);

    List<Course> getCourseAll();

    Course getCourseById(long id);
}