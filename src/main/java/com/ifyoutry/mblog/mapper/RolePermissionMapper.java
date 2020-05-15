package com.ifyoutry.mblog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ifyoutry.mblog.module.entity.TbRolePermission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wangzhiheng
 * <p>
 * 2020-05-14
 */
@Mapper
public interface RolePermissionMapper extends BaseMapper<TbRolePermission> {

    List<Integer> getPermissionIdsByRoleIds(@Param("roleIds") List<Integer> roleIds);
}
