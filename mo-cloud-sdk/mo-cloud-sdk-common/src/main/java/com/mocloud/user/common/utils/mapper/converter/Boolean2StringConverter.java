package com.mocloud.user.common.utils.mapper.converter;

import org.modelmapper.AbstractConverter;

/**
 * @author liuli
 * @date 2018/7/2
 * @email
 * @Description
 */
public class Boolean2StringConverter extends AbstractConverter<Boolean, String>
{

    @Override
    protected String convert(Boolean source)
    {
        return source == null ? "" : source.toString();
    }

}
