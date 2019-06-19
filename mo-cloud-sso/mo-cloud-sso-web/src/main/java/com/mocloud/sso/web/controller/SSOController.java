package com.mocloud.sso.web.controller;

import com.mocloud.user.client.user.UserFeignClient;
import com.mocloud.user.common.utils.dto.ResponseBaseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by likaihai 2019/1/23
 */
@RestController
@RequestMapping("sso")
public class SSOController
{
    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("info")
    public ResponseBaseDto userInfo(){
        ResponseBaseDto userInfo = userFeignClient.findUserInfo(74L);
        return userInfo;
    }
}
