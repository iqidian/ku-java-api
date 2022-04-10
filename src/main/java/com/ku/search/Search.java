package com.ku.search;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("查询条件")
public class Search<T> {

    @ApiModelProperty("条数")
    private int size;
    @ApiModelProperty("页数")
    private int page;
    @ApiModelProperty("查询条件")
    private T search;
}
