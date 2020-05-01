package com.forezp.bean;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>Description: 用户实体类 </p>
 * <p>Company: http://www.dream.com </p>
 *
 *@author JinJiacheng
 *@version 2020/5/1 20:22
 */
@Data
@Getter
@Setter
public class User {

    private Integer userNo; //用户编码

    private String userName; //用户名称

    @JSONField(format="yyyy-MM-dd")
    private Date userBirthday; //用户生日

}
