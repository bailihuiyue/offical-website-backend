package offical_website.site.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(description = "荣誉墙实体")
public class Enterprise {
    @ApiModelProperty("荣誉墙编号")
    private Long id;

    @ApiModelProperty("荣誉墙图片路径")
    private String img;

    @ApiModelProperty("荣誉墙标题")
    private String remark;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("是否删除")
    private Boolean isDeleted;
}