package com.ku.util;


public class Operational {

    public static  void warning(String messages){
        throw new IllegalArgumentException(messages);
    }

    public static void fail(String messages) {
        throw new IllegalArgumentException(messages);
    }

    public static void err(Object o,String message){
        Operational.warning(message);
    }

    public static void isNull(Object o,String message){
        if(o == null){
            Operational.warning(message);
        }
    }

    public static void isNotNull(Object o, String message) {
        if(o != null){
            Operational.warning(message);
        }
    }

    public static  void isNull(String str,String message){
        if (str.trim().length()<=0){
            Operational.warning(message);
        }
    }

    public static void isNotNull(String str,String message){
        if(str.trim().length()>0){
            Operational.warning(message);
        }
    }
    public static void isTrue(Boolean is,String message){
        if(is){
            Operational.warning(message);
        }
    }

    public static void isFalse(Boolean is,String message){
        isTrue(!is,message);
    }
}
