package com.ku.search;

import lombok.Data;

@Data
public class Search<T> {
    private int size;
    private int page;
    private T search;
}
