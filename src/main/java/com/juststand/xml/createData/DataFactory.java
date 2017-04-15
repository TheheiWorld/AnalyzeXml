package com.juststand.xml.createData;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.Random;

/**
 * Created by juststand on 2017/4/15.
 */

/**
 * 通过反射生成对象 并对对象属性赋值
 * 类的属性类型 暂时只做了 long int String Date
 */
public class DataFactory {

    /**
     *  模拟字符串数据
     */
    private final static String [] data = new String[]{"C","C++","java","php","wondertek","mysql",
    "oracle","redis","kafka","zhongguo"};

    /**
     * 造数据
     * @param className
     * @return
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static Object createData (String className) throws ClassNotFoundException, IllegalAccessException,
            InstantiationException {

        if (className !=null && !"".equals(className)) {
            Object object = Class.forName(className).newInstance();
            Class<?> clazz = object.getClass();
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                // 让属性暴露
                field.setAccessible(true);
                Class<?> type = field.getType();
                if (type == String.class) {
                    field.set(object,data[new Random().nextInt(10)]);
                }
                if (type == long.class) {
                    field.set(object,(long)Math.floor(new Random().nextDouble()*10000L));
                }
                if (type == int.class) {
                    field.set(object,new Random().nextInt(1000));
                }
                if (type == Date.class) {
                    field.set(object,new Date());
                }
            }
            return object;
        }
        return null;
    }
}
