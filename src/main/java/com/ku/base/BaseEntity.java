package com.ku.base;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class BaseEntity {
    @ApiModelProperty("状态 0 默认")
    private int status;
    @ApiModelProperty("创建人姓名")
    private String createFullName;
    @ApiModelProperty("创建人用户ID")
    private Long createBy;
    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;
    @ApiModelProperty("更新人姓名")
    private String updateFullName;
    @ApiModelProperty("更新人用户ID")
    private Long updateBy;
    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;
}
