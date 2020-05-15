package com.ifyoutry.mblog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ifyoutry.mblog.mapper.PermissionMapper;
import com.ifyoutry.mblog.module.entity.TbPermission;
import com.ifyoutry.mblog.service.PermissionService;
import org.springframework.stereotype.Service;

/**
 * @author wangzhiheng
 * <p>
 * 2020-05-14
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, TbPermission> implements PermissionService {

}
