package com.ll.exam.article;

import com.ll.exam.Rq;
import com.ll.exam.article.dto.ArticleDto;

import java.util.ArrayList;
import java.util.List;

public class ArticleController {
    public void showList(Rq rq){
        List<ArticleDto> articleDtos = new ArrayList<>();
        articleDtos.add(new ArticleDto(5,"제목 5", "내용5"));
        articleDtos.add(new ArticleDto(4,"제목 4", "내용4"));
        articleDtos.add(new ArticleDto(3,"제목 3", "내용3"));
        articleDtos.add(new ArticleDto(2,"제목 2", "내용2"));
        articleDtos.add(new ArticleDto(1,"제목 1", "내용1"));

        rq.setAttr("articles", articleDtos);


        rq.view("usr/article/list");
    }
}
