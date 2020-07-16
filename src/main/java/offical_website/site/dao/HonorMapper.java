package offical_website.site.dao;

import offical_website.site.model.Honor;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface HonorMapper {
    @Insert("INSERT INTO HONOR(remark, img) VALUES(#{remark}, #{img})")
    int createHonor(@Param("remark") String remark, @Param("img") String img);

    @Delete("DELETE FROM HONOR WHERE id= #{id}")
    int deleteHonor(@Param("id") long id);

    @Update("UPDATE HONOR SET remark= #{remark}, img=#{img} WHERE id= #{id}")
    int updateHonor(@Param("remark") String remark, @Param("id") long id, @Param("img") String img);

    @Select("SELECT * FROM HONOR")
    List<Honor> getHonorAll();

    @Select("SELECT * FROM HONOR WHERE id= #{id}")
    Honor getHonorById(@Param("id") long id);
}
