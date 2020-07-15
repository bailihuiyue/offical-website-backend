package offical_website.site.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@ApiModel(description = "案例实体")
public class Cases {
    @ApiModelProperty("案例编号")
    private Long id;

    @ApiModelProperty("案例图片路径")
    private String img;

    @ApiModelProperty("案例标题")
    private String title;

    @ApiModelProperty("案例标题")
    private String content;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("是否删除")
    private Boolean isDeleted;
}