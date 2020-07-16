package offical_website.site.dao;

import offical_website.site.model.News;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface NewsMapper {
    @Insert("INSERT INTO NEWS(type, img, title, content) VALUES(#{type}, #{img}, #{title}, #{content})")
    int createNews(@Param("type") int type, @Param("img") String img, @Param("title") String title, @Param("content") String content);

    @Delete("DELETE FROM NEWS WHERE id= #{id}")
    int deleteNews(@Param("id") long id);

    @Update("UPDATE NEWS SET type= #{type}, img=#{img}, title= #{title}, content= #{content} WHERE id= #{id}")
    int updateNews(@Param("type") int type, @Param("id") long id, @Param("img") String img, @Param("title") String title, @Param("content") String content);

    @Select("SELECT * FROM NEWS")
    List<News> getNewsAll();

    @Select("SELECT * FROM NEWS WHERE id= #{id}")
    News getNewsById(@Param("id") long id);
}
