package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.po.Article;
import com.example.demo.service.ArticleService;
import com.example.demo.mapper.ArticleMapper;
import org.springframework.stereotype.Service;

/**
* @author 26357
* @description 针对表【t_article】的数据库操作Service实现
* @createDate 2024-02-06 19:10:57
*/
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article>
    implements ArticleService{

}




