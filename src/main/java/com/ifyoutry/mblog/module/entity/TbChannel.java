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
 * 菜单
 *
 * @author Wanzhk
 * <p>
 * 2020-05-08
 */
@Data
@TableName("tb_channel")
@Accessors(chain = true)
@NoArgsConstructor
public class TbChannel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键，雪花算法
     */
    @TableId(type = IdType.ASSIGN_ID)
    private String id;

    /**
     * 名称
     */
    @NotNull(message = "名称不能为空")
    @Length(min = 1, max = 20, message = "长度1-20位")
    @TableField("name")
    private String name;

    /**
     * 图标
     */
    @TableField("icon")
    private String icon;

    /**
     * 状态：1-显示，0-隐藏
     */
    @TableField("status")
    private Integer status;

    /**
     * 权重
     */
    @TableField("weight")
    private Integer weight;

}
