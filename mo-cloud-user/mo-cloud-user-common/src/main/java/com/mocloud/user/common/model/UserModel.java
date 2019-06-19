package com.mocloud.user.common.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Create by likaihai 2019/1/23
 */
@Data
public class UserModel implements Serializable
{
    private Long id;

    private String username;

    private String account;

    private String password;

    private String salt;

    private String profileImg;

    private Byte userType;

    private Byte sex;

    private Date birthday;

    private String email;

    private String phone;

    private String address;

    private Byte membershipGrade;

    private Integer score;

    private String remark;

    private Long createdBy;

    private Long updatedBy;

    private Date createDate;

    private Date updateDate;

    private Byte valid;

}
