package offical_website.site.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(description = "团队实体")
public class Honor {
    @ApiModelProperty("团队编号")
    private Long id;

    @ApiModelProperty("团队图片路径")
    private String img;

    @ApiModelProperty("团队标题")
    private String remark;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("是否删除")
    private Boolean isDeleted;
}