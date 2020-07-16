package offical_website.site.dao;

import offical_website.site.model.Team;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface TeamMapper {
    @Insert("INSERT INTO TEAM(remark, img) VALUES(#{remark}, #{img})")
    int createTeam(@Param("remark") String remark, @Param("img") String img);

    @Delete("DELETE FROM TEAM WHERE id= #{id}")
    int deleteTeam(@Param("id") long id);

    @Update("UPDATE TEAM SET remark= #{remark}, img=#{img} WHERE id= #{id}")
    int updateTeam(@Param("remark") String remark, @Param("id") long id, @Param("img") String img);

    @Select("SELECT * FROM TEAM")
    List<Team> getTeamAll();

    @Select("SELECT * FROM TEAM WHERE id= #{id}")
    Team getTeamById(@Param("id") long id);
}
