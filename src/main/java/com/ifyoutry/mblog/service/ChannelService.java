package com.ifyoutry.mblog.service;

import com.ifyoutry.mblog.module.entity.TbChannel;

import java.util.List;

/**
 * 菜单接口
 *
 * @author Wanzhk
 * <p>
 * 2020-05-08
 */
public interface ChannelService {

    List<TbChannel> getChannelList(String title);

    TbChannel getChannelById(String id);

    boolean updateById(TbChannel channel);

    boolean deleteById(String id);

    boolean createChannel(TbChannel channel);
}
