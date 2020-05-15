package com.ifyoutry.mblog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ifyoutry.mblog.module.entity.TbArticle;
import org.apache.ibatis.annotations.Mapper;

/**
 * 文章DAO
 *
 * @author Wanzhk
 * <p>
 * 2020-05-08
 */
@Mapper
public interface ArticleMapper extends BaseMapper<TbArticle> {
}
