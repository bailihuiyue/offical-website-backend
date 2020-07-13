package offical_website.site.model;

import java.util.Date;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ApiModel(description = "用户实体")
public class User {
    @ApiModelProperty("用户编号")
    private Long id;

    @ApiModelProperty("用户密码")
    private String password;

    @ApiModelProperty("是否激活")
    private Boolean isAction;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("是否删除")
    private Boolean isDeleted;

    @NotNull(message="用户名不能为空")
    @ApiModelProperty("用户名")
    private String loginName;
}