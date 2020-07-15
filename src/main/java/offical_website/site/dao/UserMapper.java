package offical_website.site.dao;

import offical_website.site.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface UserMapper {
    @Insert("INSERT INTO USER(loginName, password, isAction) VALUES(#{loginName}, #{password}, #{isAction})")
    int createUser(@Param("loginName") String loginName, @Param("password") String password, @Param("isAction") Boolean isAction);

    @Delete("DELETE FROM USER WHERE id= #{id}")
    int deleteUser(@Param("id") int id);

    @Update("UPDATE USER SET loginName=#{loginName}, password= #{password}, isAction= #{isAction} WHERE id= #{id}")
    int updateUser(@Param("id") long id, @Param("loginName") String loginName, @Param("password") String password, @Param("isAction") Boolean isAction);

    @Select("SELECT * FROM USER")
    List<User> getUserAll();

    @Select("SELECT * FROM USER WHERE LOGINNAME = #{name} and password = #{pwd} and isAction=1")
    User login(@Param("name") String name,@Param("pwd") String pwd);

}
