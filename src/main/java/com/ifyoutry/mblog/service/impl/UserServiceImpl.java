package com.ifyoutry.mblog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ifyoutry.mblog.mapper.UserMapper;
import com.ifyoutry.mblog.module.entity.TbUser;
import com.ifyoutry.mblog.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author wangzhiheng
 * <p>
 * 2020-05-14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, TbUser> implements UserService {
    @Override
    public TbUser getUserByUserName(String username) {
        QueryWrapper<TbUser> wrapper = new QueryWrapper<>();
        wrapper.eq("username", username);
        return baseMapper.selectOne(wrapper);
    }
}
