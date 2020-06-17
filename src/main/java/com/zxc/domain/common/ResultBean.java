package com.zxc.domain.common;

import com.zxc.common.response.ResultCode;

import java.io.Serializable;

/**
 * ResultBean
 * 返回对象包装类(带泛型)
 *
 * @Author: hanYong
 * @CreateTime: 2019-04-19
 */
public class ResultBean<T> implements Serializable {

    /**
     * 没有登陆
     */
    public static final Integer NO_LOGIN = -1;
    /**
     * 成功
     */
    public static final Integer SUCCESS = 0;
    /**
     * 校验失败
     */
    public static final Integer CHECK_FAIL = 1;
    /**
     * 没有权限
     */
    public static final Integer NO_PERMISSION = 2;
    /**
     * 未知异常
     */
    public static final Integer UNKNOWN_EXCEPTION = -99;
    /**
     * 服务器处理异常
     */
    public static final Integer SERVER_EXCEPTION = 500;

    private static final long serialVersionUID = 1L;
    /**
     * 返回的信息(主要出错的时候使用)
     */
    private String msg = "success";

    /**
     * 接口返回码, 0表示成功, 其他看对应的定义
     * 晓风轻推荐的做法是:
     * 0   : 成功
     * >0 : 表示已知的异常(例如提示错误等, 需要调用地方单独处理)
     * <0 : 表示未知的异常(不需要单独处理, 调用方统一处理)
     */
    private Integer code = SUCCESS;

    /**
     * 返回的数据列表
     */
    private T data;

    private Long count;

    public ResultBean() {
        super();
    }

    public ResultBean(T data) {
        super();
        if(data instanceof PageInfo){
            this.data = (T) ((PageInfo) data).getList();
            this.count = ((PageInfo) data).getTotal();
        }else {
            this.data = data;
        }
    }

    public ResultBean(int code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }

    public ResultBean(int code, String msg, T data) {
        super();
        this.code = code;
        this.msg = msg;
        if(data instanceof PageInfo){
            this.data = (T) ((PageInfo) data).getList();
            this.count = ((PageInfo) data).getTotal();
        }else {
            this.data = data;
        }
    }

    public ResultBean(Throwable e) {
        super();
        this.msg = e.toString();
        this.code = UNKNOWN_EXCEPTION;
    }

    public ResultBean(ResultCode resultCode) {
        super();
        this.msg = resultCode.message();
        this.code = resultCode.code();
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}