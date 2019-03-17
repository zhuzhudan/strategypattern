package com.study.pattern.strategy.business;

public class MomentsShare extends ShareModel {
    public boolean isLogin() {
        return true;
    }

    public String getName() {
        return "朋友圈";
    }

}
