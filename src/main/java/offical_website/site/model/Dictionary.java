package offical_website.site.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(description = "数据字典实体")
public class Dictionary {
    @ApiModelProperty("数据字典编号")
    private Long id;

    @ApiModelProperty("数据字典key")
    private String dictKey;

    @ApiModelProperty("数据字典内容")
    private String content;

    @ApiModelProperty("是否删除")
    private Boolean isDeleted;
}