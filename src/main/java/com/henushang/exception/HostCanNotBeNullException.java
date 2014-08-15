package com.henushang.exception;

/**
 * 主机不能为空异常
 * <br />
 * 当主机名为null或者空字符串的时候，抛出此异常
 * @author henushang
 * @version 1.0
 * @createdate 2014/8/14
 */
public class HostCanNotBeNullException extends Exception {

    @Override
    public String getMessage() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "主机名不能够为空！";
    }
}
