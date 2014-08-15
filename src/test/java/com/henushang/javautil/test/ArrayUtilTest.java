package com.henushang.javautil.test;

import com.henushang.javautil.ArrayUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2014/8/13.
 */
public class ArrayUtilTest {

    @Test
    public void testToString(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        String result = ArrayUtil.toString(list, null);
        Assert.assertEquals(result, "1,2");
    }

    @Test
    public void testJoinInt() {
        String result = "";
        int[] array = null;
        result = ArrayUtil.join(array, "");
        Assert.assertEquals("", result);

        array = new int[]{};
        result = ArrayUtil.join(array, "");
        Assert.assertEquals("", result);

        array = new int[]{1, 2};
        result = ArrayUtil.join(array, "");
        Assert.assertEquals("1,2", result);

        result = ArrayUtil.join(array, ";");
        Assert.assertEquals("1,2", result);
    }
}
