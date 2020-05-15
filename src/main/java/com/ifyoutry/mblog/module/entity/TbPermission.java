package com.ifyoutry.mblog.module.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 权限表
 *
 * @author wangzhiheng
 * <p>
 * 2020-05-14
 */
@Data
@TableName("tb_permission")
@Accessors(chain = true)
@NoArgsConstructor
public class TbPermission implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(type = IdType.ASSIGN_ID)
    private String id;

    /**
     * 权限名
     */
    private String name;

}
