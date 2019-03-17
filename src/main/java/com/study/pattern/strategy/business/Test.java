package com.study.pattern.strategy.business;

public class Test {
    public static void main(String[] args) {
        Article article = new Article("如何使用策略设计模式");
        article.share(ShareType.MOMENTS_SHARE);
        article.share(ShareType.WEIBO_SHARE);
    }
}
