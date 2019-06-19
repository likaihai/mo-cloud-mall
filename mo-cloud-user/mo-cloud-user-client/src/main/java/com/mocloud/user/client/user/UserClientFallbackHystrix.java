package com.mocloud.user.client.user;

import com.mocloud.user.common.utils.ApiResponseUtil;
import com.mocloud.user.common.utils.dto.ResponseBaseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Create by likaihai 2019/1/23
 */

@Slf4j
@Component
public class UserClientFallbackHystrix implements UserFeignClient
{
    @Override
    public ResponseBaseDto findUserInfo(Long userId)
    {
        return ApiResponseUtil.error(999,"前方道路拥挤，请稍后重试");
    }
}
