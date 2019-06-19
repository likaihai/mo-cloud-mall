package com.mocloud.user.common.utils.mapper;

import com.mocloud.user.common.utils.mapper.mapping.MapperMapping;
import com.mocloud.user.common.utils.mapper.converter.*;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.NameTokenizers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.ArrayList;

/**
 * @author liuli
 * @date 2018/7/2
 * @email
 * @Description
 */
public class MapperUtils
{

    private static final Logger logger = LoggerFactory.getLogger(MapperUtils.class);

    private static final ModelMapper modelMapper = new ModelMapper();

    private static final ModelMapper modelMapper2 = new ModelMapper();

    static
    {
        setDefaultConverter(modelMapper);
    }

    private MapperUtils()
    {
    }

    private static void setDefaultConverter(ModelMapper modelMapper)
    {
        modelMapper.addConverter(new BigDecimal2StringConverter());
        modelMapper.addConverter(new Boolean2StringConverter());
        modelMapper.addConverter(new Date2StringConverter());
        modelMapper.addConverter(new Integer2StringConverter());
        modelMapper.addConverter(new Long2StringConverter());
        modelMapper.addConverter(new String2StringConverter());
        modelMapper.getConfiguration().setSourceNameTokenizer(NameTokenizers.UNDERSCORE).setDestinationNameTokenizer(NameTokenizers.UNDERSCORE);
    }

    private static void mapper(Object source, Object destination, MapperMapping propertyMap)
    {
        if (source == null || destination == null)
        {
            return;
        }
        modelMapper.map(source, destination);
        if (propertyMap != null)
        {
            propertyMap.setSource(source);
            propertyMap.setDestination(destination);
            propertyMap.configure();
        }
    }

    public static <D> D mapper(Object source, Class<D> destination)
    {
        if (source == null || destination == null)
        {
            return null;
        }

        return modelMapper.map(source, destination);
    }

    public static <D> D mapper(Object source, Class<D> destination, MapperMapping propertyMap)
    {
        if (source == null || destination == null)
        {
            return null;
        }

        D newInstance = null;

        try
        {
            newInstance = destination.newInstance();
        } catch (InstantiationException e)
        {
            logger.error("destination.newInstance InstantiationException " + e.getMessage(), e);
        } catch (IllegalAccessException e)
        {
            logger.error("destination.newInstance InstantiationException " + e.getMessage(), e);
        }

        mapper(source, newInstance, propertyMap);

        return newInstance;
    }

    public static <D> List<D> mapper(List sources, Class<D> destinationType)
    {

        List<D> list = new ArrayList();
        if (sources != null && sources.size() > 0)
        {
            for (Object obj : sources)
            {
                list.add(mapper(obj, destinationType));
            }
        }
        return list;

    }

    public static <D> List<D> mapper(List sources, Class<D> destinationType, MapperMapping propertyMap)
    {
        List<D> list = new ArrayList();
        if (sources != null && sources.size() > 0)
        {
            for (Object obj : sources)
            {
                list.add(mapper(obj, destinationType, propertyMap));
            }
        }
        return list;
    }

    public static <D> D mapperNoDefault(Object source, Class<D> destinationType) {
        if (source == null) {
            return null;
        }
        return modelMapper2.map(source, destinationType);
    }

}
