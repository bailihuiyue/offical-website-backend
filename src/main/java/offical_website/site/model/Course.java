package offical_website.site.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(description = "发展历程实体")
public class Course {
    @ApiModelProperty("发展历程编号")
    private Long id;

    @ApiModelProperty("发展历程年份")
    private String year;

    @ApiModelProperty("发展历程内容")
    private String content;

    @ApiModelProperty("是否删除")
    private Boolean isDeleted;
}