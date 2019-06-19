package com.mocloud.user.web.controller.user;

import com.mocloud.user.common.model.UserModel;
import com.mocloud.user.common.utils.ApiResponseUtil;
import com.mocloud.user.common.utils.dto.ResponseBaseDto;
import com.mocloud.user.service.user.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Create by likaihai 2019/1/22
 */
@Slf4j
@RestController
@RequestMapping("user")
public class UserController
{

    @Autowired
    private UserService userService;

    @GetMapping("/info/{userId}")
    public ResponseBaseDto findUserInfo(@PathVariable Long userId){
        UserModel userModel = userService.selectByUserInfoById(userId);
        return ApiResponseUtil.success(userModel);
    }

    @Autowired
    private AmqpTemplate amqpTemplate;



}
