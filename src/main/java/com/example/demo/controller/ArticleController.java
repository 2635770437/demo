package com.example.demo.controller;

import com.example.demo.common.CommonResult;
import com.example.demo.po.Article;
import com.example.demo.service.ArticleService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "文章")
@RestController
@CrossOrigin
@RequestMapping("/demo/article")
public class ArticleController {

    @Resource
    private ArticleService articleService;
    /**
     * 新增文章
     */
    @PostMapping("")
    public CommonResult<String > addArticle(@RequestBody Article article) {
        articleService.save(article);
        return CommonResult.success("添加成功");
    }

    /**
     * 获取文章信息
     */
    @GetMapping("")
    public CommonResult<List<Article>> getArticle() {
        return CommonResult.success(articleService.list());
    }

    /**
     * 获得文章详情
     */
    @GetMapping("/detail/{id}")
    public CommonResult<Article> getArticle(@PathVariable("id") Integer id) {
        return CommonResult.success(articleService.getById(id));
    }



}
