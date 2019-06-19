package com.mocloud.sso.web.controller.configRefreshScope;

import com.mocloud.user.common.utils.ApiResponseUtil;
import com.mocloud.user.common.utils.dto.ResponseBaseDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by likaihai 2019/1/25
 */

@RestController
@RefreshScope
public class ConfigClientController
{

    @Value("${aaa}")
    private String name;

    @RequestMapping("nav")
    public ResponseBaseDto nav(){
        return ApiResponseUtil.success("aaa的值为：" + name);
    }

}
