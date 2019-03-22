package jdk;

import java.io.File;
import java.lang.reflect.Field;
import java.time.Clock;
import java.time.Instant;
import java.util.Date;

public class main2 {
    public static void main(String[] args) throws NoSuchFieldException {
//        File file1=new File("F:\\内网通");
//        System.out.println();

        //得出类的属性名
        Class clazz=aa.class;
        Field[] def=clazz.getDeclaredFields();
        for(int i=0;i<def.length;i++){
            String name = def[i].getName();

        }
        Field declaredField = clazz.getDeclaredField("a");
        declaredField.setAccessible(true);
        System.out.println(declaredField);


    }
}
