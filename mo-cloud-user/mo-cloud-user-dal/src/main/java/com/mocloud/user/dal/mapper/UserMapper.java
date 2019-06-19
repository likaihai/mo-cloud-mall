package com.mocloud.user.dal.mapper;

import com.mocloud.user.dal.entity.UserEntity;
import feign.Param;
import org.springframework.stereotype.Repository;

/**
 * @author zhangningbo
 * @date 2019/1/21 18:38
 */
@Repository
public interface UserMapper {

    UserEntity selectByUserInfoById(@Param("userId") Long userId);

}
