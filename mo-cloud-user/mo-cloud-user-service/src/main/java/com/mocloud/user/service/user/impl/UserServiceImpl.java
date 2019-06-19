package com.mocloud.user.service.user.impl;

import com.mocloud.user.common.model.UserModel;
import com.mocloud.user.common.utils.mapper.MapperUtils;
import com.mocloud.user.dal.entity.UserEntity;
import com.mocloud.user.dal.mapper.UserMapper;
import com.mocloud.user.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create by likaihai 2019/1/23
 */

@Service("userService")
public class UserServiceImpl implements UserService
{

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserModel selectByUserInfoById(Long userId)
    {
        UserEntity userEntity = userMapper.selectByUserInfoById(userId);
        UserModel userModel = MapperUtils.mapper(userEntity, UserModel.class);
        return userModel;
    }
}
