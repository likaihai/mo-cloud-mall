package com.mocloud.user.service.user;

import com.mocloud.user.common.model.UserModel;

/**
 * Create by likaihai 2019/1/23
 */
public interface UserService
{
    UserModel selectByUserInfoById(Long userId);
}
