package com.mocloud.user.client.user.demo;

import com.netflix.hystrix.HystrixCommandProperties;
import com.netflix.hystrix.HystrixThreadPoolProperties;

/**
 * Create by likaihai 2019/4/15
 */
public class HystrixThreadPoolPropertiesDemo
{
    public static void main(String[] args)
    {
        //最大并发采样统计
//        HystrixThreadPoolProperties.Setter threadPoolProperties = HystrixThreadPoolProperties.Setter()
//                .withMetricsRollingStatisticalWindowInMilliseconds(10000)
//                .withMetricsRollingStatisticalWindowBuckets(10);
//        //计数统计
//        HystrixCommandProperties.Setter compandProperties = HystrixCommandProperties.Setter()
//                .withMetricsRollingStatisticalWindowInMilliseconds(10000)
//                .withMetricsRollingStatisticalWindowBuckets
//                        (10);
//
//        HystrixCommandProperties.Setter compandProperties = HystrixCommandProperties.Setter()
//                .withMetricsRollingStatisticalWindowInMilliseconds(10000)
//                .withMetricsHealthSnapshotIntervalInMilliseconds(500);

        //延时分布采样统计
        HystrixCommandProperties.Setter compandProperties = HystrixCommandProperties.Setter()
                .withMetricsRollingPercentileWindowInMilliseconds(60000)
                .withMetricsRollingPercentileWindowBuckets(6);
    }
}
