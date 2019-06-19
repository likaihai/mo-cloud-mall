package com.mocloud.user.common.utils.mapper.mapping;

/**
 * @author liuli
 * @date 2018/7/2
 * @email
 * @Description
 */
public abstract class MapperMapping<S, D>
{
    private S source;
    private D destination;

    public S getSource()
    {
        return source;
    }

    public void setSource(S source)
    {
        this.source = source;
    }

    public D getDestination()
    {
        return destination;
    }

    public void setDestination(D destination)
    {
        this.destination = destination;
    }

    public abstract void configure();
}
