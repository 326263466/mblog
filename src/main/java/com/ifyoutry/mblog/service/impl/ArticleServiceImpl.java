package com.ifyoutry.mblog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ifyoutry.mblog.mapper.ArticleMapper;
import com.ifyoutry.mblog.module.entity.TbArticle;
import com.ifyoutry.mblog.service.ArticleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 文章接口实现类
 *
 * @author Wanzhk
 * <p>
 * 2020-05-08
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, TbArticle> implements ArticleService {

    @Override
    @Transactional(rollbackFor = Exception.class)
    public IPage<TbArticle> getArticleList(int current, int size) {
        return baseMapper.selectPage(
                new Page<TbArticle>(current, size),
                new QueryWrapper<TbArticle>().orderByDesc("create_time"));
    }
}
