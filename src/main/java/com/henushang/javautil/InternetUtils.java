package com.henushang.javautil;

import com.henushang.exception.HostCanNotBeNullException;
import org.apache.commons.lang3.StringUtils;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

/**
 * 关于网络应用的一些工具类
 * @author henushang
 * @version 1.0
 * @createdate 2014/8/14
 */
public class InternetUtils {

    /**
     * 根据主机名获取IP地址 <br />
     * 如果host为null或者空字符串则返回null；如果主机不存在则抛出UnknownHostException异常。
     * @param host  主机名
     * @return 如果主机存在，则返回该主机的ip地址
     * @throws HostCanNotBeNullException 当主机名为null或空字符串时返回此异常
     * @throws UnknownHostException 找不到host对应的ip地址
     */
    public static String getIpByName(String host) throws HostCanNotBeNullException, UnknownHostException {
       checkHost(host);
        try {
            InetAddress address = InetAddress.getByName(host);
            return  address.getHostAddress();
        }catch (UnknownHostException e){
            throw e;
        }
    }

    /**
     * 根据主机名获取该主机所有的IP地址
     * @param host 主机名
     * @return 主机对应的所有的IP地址的List列表
     * @throws HostCanNotBeNullException 当主机名为null或空字符串时返回此异常
     * @throws UnknownHostException 找不到host对应的ip地址
     */
    public static List<String> getAllIpByName (String host) throws HostCanNotBeNullException, UnknownHostException {
       checkHost(host);
        try {
            InetAddress[] addresses = InetAddress.getAllByName(host);
            List<String> list = new ArrayList<String>();
            for(InetAddress item : addresses) {
                list.add(item.getHostAddress());
            }
            return list;
        } catch (UnknownHostException e) {
            throw  e;
        }
    }

    /**
     * 获取本地主机的名字
     * @return 本地主机命
     * @throws UnknownHostException
     */
    public static String getLocalHostName() throws UnknownHostException{
        return InetAddress.getLocalHost().getHostName();
    }

    /**
     * 获取本地主机的IP地址
     * @return 本地主机IP地址
     * @throws UnknownHostException
     */
    public static String getLocalHostIp() throws UnknownHostException {
        return InetAddress.getLocalHost().getHostAddress();
    }

    /**
     * 此方法是用来获取主机名的，主要是根据IP地址来获取主机名，但是，如果传入的参数是主机名的话也是可以正常运行的
     * @param ip 主机的ip地址
     * @return 目标主机的主机名
     * @throws HostCanNotBeNullException
     * @throws UnknownHostException
     */
    public static String getName(String ip) throws HostCanNotBeNullException, UnknownHostException{
        checkHost(ip);
        try {
            return InetAddress.getByName(ip).getHostName();
        } catch (UnknownHostException e) {
            throw  e;
        }
    }

    /**
     * 校验主机名是否合法，如果不合法，则抛出HostCanNotBeNull异常
     * @param host 主机名
     * @throws HostCanNotBeNullException 当主机名为null或者空字符串时抛出此异常
     */
    private static void checkHost(String host) throws HostCanNotBeNullException {
        if (StringUtils.isEmpty(host)) {
            throw new HostCanNotBeNullException();
        }
    }
}
