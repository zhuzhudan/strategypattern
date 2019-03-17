package com.study.pattern.strategy.business;

public class ErrorShare extends ShareModel {

    public boolean isLogin() {
        return false;
    }

    public String getName() {
        return "分享失败";
    }

}
