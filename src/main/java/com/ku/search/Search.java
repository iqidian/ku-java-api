package com.ku.search;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//查询条件
public class Search<T> {

    //条数
    private int size;
    //页数
    private int page;
    //查询条件
    private T search;
}
