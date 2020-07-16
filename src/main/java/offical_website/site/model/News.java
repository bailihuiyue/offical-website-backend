package offical_website.site.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(description = "新闻实体")
public class News {
    @ApiModelProperty("新闻编号")
    private Long id;

    @ApiModelProperty("新闻图片路径")
    private String img;

    @ApiModelProperty("新闻标题")
    private String title;

    @ApiModelProperty("新闻标题")
    private String content;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("是否删除")
    private Boolean isDeleted;

    @ApiModelProperty("新闻类型")
    private int type;
}