package com.mocloud.user.common.utils.exception;


import lombok.Getter;

import java.util.Map;

/**
 * Created by liuli on 2018/5/26
 *
 * @Description 业务逻辑 运行时异常
 *
 */
@Getter
public class BizErrorException extends RuntimeException
{

    private int errCode;
    private Map<String, Object> data;
    private Object[] argArray;


    public BizErrorException(String message)
    {
        super(message);
    }

    public BizErrorException(String message, Throwable e) {
        super(message, e);
    }

    public BizErrorException(Throwable e) {
        super(e);
    }
    /**
     * 返回异常响应结果，包括error code和简短异常信息说明
     */
    public BizErrorException(int code, String message, Object... args)
    {
        super(message);
        this.errCode = code;
        argArray = args;
    }

    /**
     * 返回异常响应结果，包括error code，简短异常信息说明和业务数据
     */
    public BizErrorException(int code, Map<String, Object> data, String message, Object... args)
    {
        super(message);
        this.data = data;
        this.errCode = code;
        argArray = args;
    }

    public int getErrCode()
    {
        return errCode;
    }

    public void setErrCode(int errCode)
    {
        this.errCode = errCode;
    }

    public Map<String, Object> getData()
    {
        return data;
    }

    public void setData(Map<String, Object> data)
    {
        this.data = data;
    }

    public Object[] getArgArray()
    {
        return argArray;
    }

    public void setArgArray(Object[] argArray)
    {
        this.argArray = argArray;
    }
}
