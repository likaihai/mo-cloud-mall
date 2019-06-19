package com.mocloud.user.common.utils.mapper.converter;

import org.modelmapper.AbstractConverter;

/**
 * @author liuli
 * @date 2018/7/2
 * @email
 * @Description
 */
public class Integer2StringConverter extends AbstractConverter<Integer, String>
{

    @Override
    protected String convert(Integer source)
    {
        return source == null ? "" : source.toString();
    }
}
