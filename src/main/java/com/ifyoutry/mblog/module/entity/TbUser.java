package com.ifyoutry.mblog.module.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 用户
 *
 * @author wangzhiheng
 * <p>
 * 2020-05-14
 */
@Data
@TableName("tb_user")
@Accessors(chain = true)
@NoArgsConstructor
public class TbUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(type = IdType.ASSIGN_ID)
    private String id;

    /**
     * 用户名
     */
    @NotNull(message = "username不能为空")
    @Length(min = 2, max = 20, message = "用户名长度2-20之间")
    @TableField("username")
    private String username;

    /**
     * 别名
     */
    @Length(min = 2, max = 20, message = "别名长度2-20之间")
    @TableField("alias_name")
    private String aliasName;

    /**
     * 密码
     */
    @TableField("password")
    @Length(min = 5, max = 20, message = "密码长度2-20之间")
    private String password;

    /**
     * 0：使用，1：锁定，2：封号，3：注销
     */
    @TableField("status")
    private Integer status;
}
