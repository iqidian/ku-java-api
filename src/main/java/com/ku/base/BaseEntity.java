package com.ku.base;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class BaseEntity {
    //状态 0 默认
    private int status;
    //创建人姓名
    private String createFullName;
    //创建人用户ID
    private Long createBy;
    //创建时间
    private LocalDateTime createTime;
    //更新人姓名
    private String updateFullName;
    //更新人用户ID
    private Long updateBy;
    //更新时间
    private LocalDateTime updateTime;
}
