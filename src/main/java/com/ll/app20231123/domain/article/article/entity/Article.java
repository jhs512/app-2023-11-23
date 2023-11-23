package com.ll.app20231123.domain.article.article.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Article {
    private Long id;
    private String title;
    private String body;
}
