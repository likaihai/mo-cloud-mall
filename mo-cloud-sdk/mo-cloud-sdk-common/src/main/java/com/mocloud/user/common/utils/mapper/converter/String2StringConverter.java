package com.mocloud.user.common.utils.mapper.converter;

import org.modelmapper.AbstractConverter;

/**
 * @author liuli
 * @date 2018/7/2
 * @email
 * @Description
 */
public class String2StringConverter extends AbstractConverter<String, String>
{

    @Override
    protected String convert(String source)
    {
        return source == null ? null : source;
    }

}
