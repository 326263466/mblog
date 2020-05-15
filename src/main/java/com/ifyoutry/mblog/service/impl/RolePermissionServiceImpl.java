package com.ifyoutry.mblog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ifyoutry.mblog.mapper.RolePermissionMapper;
import com.ifyoutry.mblog.module.entity.TbRolePermission;
import com.ifyoutry.mblog.service.RolePermissionService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangzhiheng
 * <p>
 * 2020-05-14
 */
@Service
public class RolePermissionServiceImpl extends ServiceImpl<RolePermissionMapper, TbRolePermission> implements RolePermissionService {

    @Override
    public List<Integer> getPermissionIdsByRoles(List<Integer> roleIds) {
        return baseMapper.getPermissionIdsByRoleIds(roleIds);
    }
}
