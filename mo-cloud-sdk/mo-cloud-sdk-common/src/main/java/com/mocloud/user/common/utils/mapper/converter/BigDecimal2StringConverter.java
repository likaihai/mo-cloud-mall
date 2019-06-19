package com.mocloud.user.common.utils.mapper.converter;

import org.modelmapper.AbstractConverter;

import java.math.BigDecimal;

/**
 * @author liuli
 * @date 2018/7/2
 * @email
 * @Description
 */
public class BigDecimal2StringConverter extends AbstractConverter<BigDecimal, String>
{
    @Override
    protected String convert(BigDecimal source)
    {
        return source == null ? "" : source.toString();
    }
}
