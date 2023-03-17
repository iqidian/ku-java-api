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
    	if(o == null || "".equals(o)) {
    		 Operational.warning(message);
    	}
    	if(o instanceof String) {
    		isBlank(o.toString(), message);
    	}
    }
    
    public static void isBlank(String o,String message) {
    	if(o.trim().length()<=0) {
    		Operational.warning(message.toString());
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
