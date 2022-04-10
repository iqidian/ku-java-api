package com.ku.util;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class ArrayUtils {

    public static <T> T create(Class<T> zclass) {
        try {
            return zclass.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return  null;
    }
    public static <T> T create() {
        try {
            return (T) new ArrayList<T>();
        }catch (Exception e){
            e.printStackTrace();
        }
        return  null;
    }

    public static <T> boolean isNotEmpty(final T[] array) {
        return !isEmpty(array);
    }

    public static boolean isEmpty(final Object[] array) {
        return getLength(array) == 0;
    }
    public static int getLength(final Object array) {
        if (array == null) {
            return 0;
        }
        return Array.getLength(array);
    }

    public static  boolean isEmpty(Collection array){
        if (array == null) {
            return  true;
        }
        return Array.getLength(array)  == 0;
    }
}
