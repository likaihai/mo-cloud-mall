package com.mocloud.user.common.utils.mapper.converter;

import org.modelmapper.AbstractConverter;

/**
 * @author liuli
 * @date 2018/7/2
 * @email
 * @Description
 */
public class Long2StringConverter extends AbstractConverter<Long, String>
{

    @Override
    protected String convert(Long source)
    {
        return source == null ? "" : source.toString();
    }

}
