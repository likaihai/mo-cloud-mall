package com.mocloud.user.common.utils.dto;


import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

/**
 * Created by liuli on 2018/5/28
 *
 * @Description 请求的 返回结果 通用类
 *
 */
public class ResponseBaseDto implements Serializable
{

    private Boolean success;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;
    private int code;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object data;

    public ResponseBaseDto()
    {
    }

    public ResponseBaseDto(Object data)
    {
        this.data = data;
    }

    public int getCode()
    {
        return code;
    }

    public void setCode(int code)
    {
        this.code = code;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public Object getData()
    {
        return data;
    }

    public void setData(Object data)
    {
        this.data = data;
    }

    public Boolean getSuccess()
    {
        return success;
    }

    public void setSuccess(Boolean success)
    {
        this.success = success;
    }
}
