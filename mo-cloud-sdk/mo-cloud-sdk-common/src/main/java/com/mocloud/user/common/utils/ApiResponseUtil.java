package com.mocloud.user.common.utils;

import com.mocloud.user.common.utils.dto.ResponseBaseDto;
import com.mocloud.user.common.utils.exception.BizErrorException;
import org.slf4j.helpers.FormattingTuple;
import org.slf4j.helpers.MessageFormatter;

/**
 * api返回值设置的处理辅助类
 * 参见接口文档，简介部分的关于接口返回值的说明
 */
public final class ApiResponseUtil
{

    // 缺省的成功返回值
    public static ResponseBaseDto SUCCESS = success();

    /**
     * 返回正常响应结果，没有业务具体返回数据（比如更新的场合）
     */
    public static ResponseBaseDto success()
    {
        ResponseBaseDto result = new ResponseBaseDto();
        result.setCode(0);
        return result;
    }

    /**
     * 返回正常响应结果，有业务具体返回数据
     */
    public static <E> ResponseBaseDto success(E data)
    {
        ResponseBaseDto result = new ResponseBaseDto();
        result.setCode(0);
        if (data != null) {
            result.setData(data);
        }
        return result;
    }

    /**
     * 返回异常响应结果，包括error code和简短异常信息说明
     */
    public static ResponseBaseDto error(int code, String msg, Object... args)
    {
        ResponseBaseDto result = new ResponseBaseDto();
        result.setCode(code);
        result.setMessage(arrayFormat(msg, args));
        return result;
    }

    /**
     * 返回异常响应结果，包括error code，简短异常信息说明和业务数据
     */
    public static <E> ResponseBaseDto errorWithData(int code, E data, String msg, Object... args)
    {
        ResponseBaseDto result = new ResponseBaseDto();
        result.setCode(code);
        result.setMessage(arrayFormat(msg, args));
        if (data != null) {
            result.setData(data);
        }
        return result;
    }

    /**
     * 根据异常信息返回
     */
    public static ResponseBaseDto error(BizErrorException exp)
    {
        ResponseBaseDto result = new ResponseBaseDto();
        result.setCode(exp.getErrCode());
        result.setMessage(arrayFormat(exp.getMessage(), exp.getArgArray()));
        if (exp.getData() != null) {
            result.setData(exp.getData());
        }
        return result;
    }

    // 这里直接引用slf4j的代码
    private static String arrayFormat(String messagePattern, Object[] argArray)
    {
        if (messagePattern == null)
        {
            return null;
        }
        FormattingTuple ft = MessageFormatter.arrayFormat(messagePattern, argArray);
        return ft.getMessage();
    }
}
