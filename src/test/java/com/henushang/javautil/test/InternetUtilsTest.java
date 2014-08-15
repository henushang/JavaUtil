package com.henushang.javautil.test;

import com.henushang.javautil.InternetUtils;
import com.henushang.javautil.PrintUtil;
import org.junit.Test;

/**
 * Created by Administrator on 2014/8/14.
 */
public class InternetUtilsTest {

    @Test
    public void testGetIpByName () throws  Exception{
        PrintUtil.println(InternetUtils.getIpByName("119.75.218.77"));
        PrintUtil.println(InternetUtils.getAllIpByName("119.75.218.77"));
        PrintUtil.println(InternetUtils.getLocalHostIp());
        PrintUtil.println(InternetUtils.getLocalHostName());
        PrintUtil.println(InternetUtils.getName("119.75.218.77"));
    }


}
