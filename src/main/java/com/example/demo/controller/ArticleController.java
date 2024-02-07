package com.example.demo.controller;

import com.example.demo.common.CommonResult;
import com.example.demo.po.Article;
import com.example.demo.service.ArticleService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "文章")
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Resource
    private ArticleService articleService;
    /**
     * 新增文章
     */
    @PostMapping("/新增文章")
    public CommonResult<String > addArticle(Article article) {
        articleService.save(article);
        return CommonResult.success("添加成功");
    }

    /**
     * 获取文章信息
     */
    @GetMapping("/获取文章信息")
    public CommonResult<List<Article>> getArticle() {
        return CommonResult.success(articleService.list());
    }




}
