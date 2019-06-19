package com.mocloud.user.common.utils.mapper.converter;

import com.mocloud.user.common.utils.DateUtils;
import org.apache.commons.lang3.StringUtils;
import org.modelmapper.AbstractConverter;

import java.util.Date;

/**
 * @author liuli
 * @date 2018/7/2
 * @email
 * @Description
 */
public class String2DateConverter extends AbstractConverter<String, Date>
{

    @Override
    protected Date convert(String source)
    {
        return StringUtils.isBlank(source) ? null : DateUtils.stringToDate(source);
    }
}
