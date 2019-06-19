package com.mocloud.user.client.user;

import com.mocloud.user.common.utils.dto.ResponseBaseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create by likaihai 2019/1/23
 */
@FeignClient(name = "mo-cloud-user",configuration = FeignUserConfiguration.class,fallback = UserClientFallbackHystrix.class)
@RequestMapping
public interface UserFeignClient
{
    @GetMapping("user/info/{userId}")
    ResponseBaseDto findUserInfo(@PathVariable Long userId);
}
