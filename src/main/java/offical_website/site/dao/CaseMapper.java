package offical_website.site.dao;

import offical_website.site.model.Cases;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface CaseMapper {
    @Insert("INSERT INTO CASES(img, title, content) VALUES(#{img}, #{title}, #{content})")
    int createCase(@Param("img") String img, @Param("title") String title, @Param("content") String content);

    @Delete("DELETE FROM CASES WHERE id= #{id}")
    int deleteCase(@Param("id") long id);

    @Update("UPDATE CASES SET img=#{img}, title= #{title}, content= #{content} WHERE id= #{id}")
    int updateCase(@Param("id") long id, @Param("img") String img, @Param("title") String title, @Param("content") String content);

    @Select("SELECT * FROM CASES")
    List<Cases> getCaseAll();
}
