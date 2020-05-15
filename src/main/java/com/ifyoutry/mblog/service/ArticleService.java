package com.ifyoutry.mblog.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ifyoutry.mblog.module.entity.TbArticle;

/**
 * 文章接口
 *
 * @author Wanzhk
 * <p>
 * 2020-05-08
 */
public interface ArticleService extends IService<TbArticle> {

    IPage<TbArticle> getArticleList(int current, int size);
}
