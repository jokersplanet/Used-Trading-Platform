package com.example.utp.Entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Date;

@Data
@TableName("user")
public class User {

    @TableId(type = IdType.AUTO)
    @ApiModelProperty(allowEmptyValue = false , value = "账号")
    private Integer id;

    @TableField("username")
    @ApiModelProperty(allowEmptyValue = false, value = "昵称")
    private Integer username;

    @TableField("password")
    @ApiModelProperty(allowEmptyValue = false, value = "密码")
    private String password;

    @TableField("gender")
    @ApiModelProperty(allowEmptyValue = true, value = "性别")
    private Integer gender;

    @TableField("email")
    @ApiModelProperty(allowEmptyValue = true, value = "邮箱")
    private String email;

    @TableField("tel")
    @ApiModelProperty(allowEmptyValue = true, value = "电话号")
    private String tel;

    @TableField("id_number")
    @ApiModelProperty(allowEmptyValue = true, value = "身份证号")
    private Integer idNumber;

    @TableField("name")
    @ApiModelProperty(allowEmptyValue = true, value = "姓名")
    private String name;

    @TableField("birthday")
    @ApiModelProperty(allowEmptyValue = true, value = "生日")
    private Date birthday;

    @TableField("avatar")
    @ApiModelProperty(allowEmptyValue = true, value = "头像")
    private String avatar;

    @TableField("question")
    @ApiModelProperty(allowEmptyValue = true, value = "密保问题")
    private String question;

    @TableField("answer")
    @ApiModelProperty(allowEmptyValue = true, value = "答案")
    private String answer;

    @TableField("address")
    @ApiModelProperty(allowEmptyValue = true, value = "地址")
    private String address;

    @TableField("register")
    @ApiModelProperty(allowEmptyValue = false, value = "注册日期")
    private Date register;

    @TableField("privilege")
    @ApiModelProperty(allowEmptyValue = false, value = "权限等级")
    private Integer privilege;

    @TableField("status")
    @ApiModelProperty(allowEmptyValue = true, value = "状态")
    private Integer status;

    @TableField("identify")
    @ApiModelProperty(allowEmptyValue = false, value = "学校认证")
    private Integer identify;

    @TableField("credit")
    @ApiModelProperty(allowEmptyValue = false, value = "信誉积分")
    private Integer credit;


}
