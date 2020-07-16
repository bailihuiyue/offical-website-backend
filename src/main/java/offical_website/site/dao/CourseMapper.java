package offical_website.site.dao;

import offical_website.site.model.Course;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface CourseMapper {
    @Insert("INSERT INTO COURSE(year, content) VALUES(#{year}, #{content})")
    int createCourse(@Param("year") String year, @Param("content") String content);

    @Delete("DELETE FROM COURSE WHERE id= #{id}")
    int deleteCourse(@Param("id") long id);

    @Update("UPDATE COURSE SET year= #{year}, content=#{content} WHERE id= #{id}")
    int updateCourse(@Param("year") String year, @Param("id") long id, @Param("content") String content);

    @Select("SELECT * FROM COURSE")
    List<Course> getCourseAll();

    @Select("SELECT * FROM COURSE WHERE id= #{id}")
    Course getCourseById(@Param("id") long id);
}
