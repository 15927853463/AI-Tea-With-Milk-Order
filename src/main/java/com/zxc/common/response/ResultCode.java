package com.zxc.common.response;

/**
 * ResultCode
 * <p>
 * 10000--19999 通用错误代码
 * 20000--29999 媒资错误代码
 * 30000--39999 用户中心错误代码
 * 40000--49999 cms错误代码
 * 50000--59999 文件系统
 *
 * @Author: hanYong
 * @CreateTime: 2019-11-16
 */
public interface ResultCode {

    /**
     * 响应码
     *
     * @return 响应码
     */
    int code();

    /**
     * 响应信息
     *
     * @return 响应
     */
    String message();
}
