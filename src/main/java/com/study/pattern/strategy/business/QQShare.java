package com.study.pattern.strategy.business;

public class QQShare extends ShareModel {
    public boolean isLogin() {
        return true;
    }

    public String getName() {
        return "QQ";
    }
}
