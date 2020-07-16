package offical_website.site.dao;

import offical_website.site.model.Dictionary;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface DictionaryMapper {
    @Insert("INSERT INTO DICTIONARY(dictKey, content) VALUES(#{dictKey}, #{content})")
    int createDictionary(@Param("dictKey") String dictKey, @Param("content") String content);

    @Delete("DELETE FROM DICTIONARY WHERE id= #{id}")
    int deleteDictionary(@Param("id") long id);

    @Update("UPDATE DICTIONARY SET dictKey= #{dictKey}, content=#{content} WHERE id= #{id}")
    int updateDictionary(@Param("dictKey") String dictKey, @Param("id") long id, @Param("content") String content);

    @Select("SELECT * FROM DICTIONARY")
    List<Dictionary> getDictionaryAll();

    @Select("SELECT * FROM DICTIONARY WHERE id= #{id}")
    Dictionary getDictionaryById(@Param("id") long id);
}
