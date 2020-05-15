package com.ifyoutry.mblog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ifyoutry.mblog.mapper.UserRoleMapper;
import com.ifyoutry.mblog.module.entity.TbUserRole;
import com.ifyoutry.mblog.service.UserRoleService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangzhiheng
 * <p>
 * 2020-05-14
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, TbUserRole> implements UserRoleService {


    @Override
    public List<Integer> getRoleIdsByUserId(String userId) {
        return baseMapper.getRoleIdsByUserId(userId);
    }

}
