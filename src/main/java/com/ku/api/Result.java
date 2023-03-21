package com.ku.api;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Result<T> {

    private boolean state;
    private Object messages;
    private T data;
    private Integer errCode;

    public static <T> Result<T> ok(T b) {
        return new Result<T>(true, "访问成功", b,10000);
    }

    public static <T> Result<T> fail(Object messages) {
        return new Result<T>(false, messages, null,10001);
    }

    public static <T> Result<T> fail(Integer errCode,Object messages) {
        return new Result<T>(false, messages, null,10001);
    }

}
