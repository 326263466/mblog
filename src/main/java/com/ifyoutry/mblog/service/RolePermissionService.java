package com.ifyoutry.mblog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ifyoutry.mblog.module.entity.TbRolePermission;

import java.util.List;

/**
 * @author wangzhiheng
 * <p>
 * 2020-05-14
 */
public interface RolePermissionService extends IService<TbRolePermission> {

    List<Integer> getPermissionIdsByRoles(List<Integer> roleIds);
}
