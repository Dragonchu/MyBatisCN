package com.dragonchu.ibatis.knowledge.reflection;

import org.apache.ibatis.jdbc.Null;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class diffUtil {
    public static Map<String,String> diffObj(Object oldObject,Object newObject){
        Map<String,String> map = new HashMap<>();
        Class oldClazz = oldObject.getClass();
        Class newClazz = newObject.getClass();
        if(oldClazz.equals(newClazz)){
            Field[] fields = oldClazz.getDeclaredFields();
            for(Field field:fields){
                field.setAccessible(true);
                try {
                    Object oldValue = field.get(oldObject);
                    Object newValue = field.get(newObject);
                    if ((oldValue== null&&newValue!=null)||(oldValue!=null&&!oldValue.equals(newValue))){
                        map.put(field.getName(),"from "+oldValue+" to "+newValue);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return map;
    }
}
