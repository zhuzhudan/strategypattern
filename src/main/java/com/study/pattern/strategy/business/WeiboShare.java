package com.study.pattern.strategy.business;

public class WeiboShare extends ShareModel {
    public boolean isLogin() {
        return false;
    }

    public String getName() {
        return "微博";
    }
}
