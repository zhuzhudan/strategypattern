package com.study.pattern.strategy.business;

public class WechatShare extends ShareModel {
    public boolean isLogin() {
        return true;
    }

    public String getName() {
        return "微信";
    }
}
