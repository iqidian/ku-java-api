package com.ku.api;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuppressWarnings({ "unchecked", "rawtypes", "serial" })
public class R<T> implements Serializable {
    private T data;
    private Object message;
    private int code;
    private boolean success;

	public static <T> T success(Object data) {
        return (T) new R(data,"访问成功",10000,true);
    }

    public static <T> T failure(Object message) {
        return (T) new R(null,message,10002,true);
    }
    
    public static <T> T failure(Integer code,Object message) {
        return (T) new R(null,message,10002,true);
    }
    
    public static <T> T error( Object message) {
        return (T) new R(null,message,10001,false);
    }
    public static <T> T error(Integer code, Object message) {
        return (T) new R(null,message,code,false);
    }
    public  static <T> T error() {
        return (T) new R(null,"系统异常",10001,false);
    }
}
