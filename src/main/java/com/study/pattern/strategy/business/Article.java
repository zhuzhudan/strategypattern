package com.study.pattern.strategy.business;

public class Article {
    private String content;

    public Article(String content){
        this.content = content;
    }

    public void share(ShareType shareType){
        ShareModel shareModel = ShareStrategy.get(shareType);
        shareModel.setContent(content);
        System.out.println("跳转到: "+shareModel.getName());
        System.out.println(shareModel.getContent());
        shareModel.share();
    }
}
