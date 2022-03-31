package com.ku.api;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class R<T>{
    private T data;
    private Object message;
    private int code;
    private boolean state;

    public static <T> T success(Object data) {
        return (T) new R(data,"访问成功",10000,true);
    }

    public static <T> T failure(Object message) {
        return (T) new R(null,message,10002,true);
    }
    public static <T> T error( Object message) {
        return (T) new R(null,message,10001,false);
    }
    public  static <T> T error() {
        return (T) new R(null,"系统异常",10001,false);
    }
}
