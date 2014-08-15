package com.henushang.javautil;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

/**
 *@description 这是一个对于数组、Collection的相关类的工具类
 *@createtime 2014/8/13.
 */
public class ArrayUtil {

    // 默认的分隔符
    private static  String defaultdelimiter = ",";

    /**
     *
     * @return 组合后的字符串
     */
    public static String join(int[] array, String delimiter) {
        if (ArrayUtils.isEmpty(array)) {
            return "";
        }
        if (StringUtils.isEmpty(delimiter)) {
            delimiter = defaultdelimiter;
        }
        return  ArrayUtil.toString(Arrays.asList(array), delimiter);
    }

    /**
     * 把List<T>数组转化为字符串，并且没有除数据以外的空格；<br />
     * 如果delimiter为null或者空字符串，则默认为英文逗号','作为分隔符
     * @param list
     * @param delimiter
     * @return 以delimiter作为分隔符的字符串
     */
    public static <T> String toString(List<T> list, String delimiter) {
        if (StringUtils.isEmpty(delimiter)) {
            delimiter = defaultdelimiter;
        }
        StringBuilder buffer = new StringBuilder();
        for(T item : list) {
            buffer.append(delimiter + item.toString());
        }
        return buffer.toString().replaceFirst(delimiter, "");
    }

}
