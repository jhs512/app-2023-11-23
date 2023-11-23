package com.ll.app20231123.domain.article.article.controller;

import com.ll.app20231123.domain.article.article.entity.Article;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/articles")
public class ApiV1ArticlesController {
    @GetMapping("")
    public List<Article> getArticles() {
        return new ArrayList<>() {{
            add(new Article(1L, "title1", "body1"));
            add(new Article(2L, "title2", "body2"));
            add(new Article(3L, "title3", "body3"));
        }};
    }
}
