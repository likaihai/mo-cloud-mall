package com.mocloud.user.common.utils.mapper.converter;

import com.mocloud.user.common.utils.DateUtils;
import org.modelmapper.AbstractConverter;

import java.util.Date;

/**
 * @author liuli
 * @date 2018/7/2
 * @email
 * @Description
 */
public class Date2StringConverter extends AbstractConverter<Date, String>
{

    @Override
    protected String convert(Date source)
    {
        return source == null ? "" : DateUtils.dateToString(source);
    }

}
