package offical_website.site.dao;

import offical_website.site.model.Enterprise;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface EnterpriseMapper {
    @Insert("INSERT INTO ENTERPRISE(remark, img) VALUES(#{remark}, #{img})")
    int createEnterprise(@Param("remark") String remark, @Param("img") String img);

    @Delete("DELETE FROM ENTERPRISE WHERE id= #{id}")
    int deleteEnterprise(@Param("id") long id);

    @Update("UPDATE ENTERPRISE SET remark= #{remark}, img=#{img} WHERE id= #{id}")
    int updateEnterprise(@Param("remark") String remark, @Param("id") long id, @Param("img") String img);

    @Select("SELECT * FROM ENTERPRISE")
    List<Enterprise> getEnterpriseAll();

    @Select("SELECT * FROM ENTERPRISE WHERE id= #{id}")
    Enterprise getEnterpriseById(@Param("id") long id);
}
