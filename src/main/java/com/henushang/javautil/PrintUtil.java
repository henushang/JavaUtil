package com.henushang.javautil;

import java.util.Objects;

import static java.lang.System.out;

/**
 * 控制台打印工具类
 * @author henushang
 * @version 1.0
 * @createdate 2014/8/14
 */
public class PrintUtil {

    /**
     * 换行
     */
    public static void println() {
        out.println();
    }

    public static void println(String s) {
        out.println(s);
    }

    public static void println(Object o) {
        out.print(o);
    }
}
