package offical_website.site.dao;

import offical_website.site.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM USER WHERE LOGINNAME = #{name}")
    User findByName(@Param("name") String name);

    @Select("SELECT * FROM USER")
    List<User> getUserAll();

    @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);

    @Select("SELECT * FROM USER WHERE LOGINNAME = #{name} and password = #{pwd}")
    User login(@Param("name") String name,@Param("pwd") String pwd);
}
