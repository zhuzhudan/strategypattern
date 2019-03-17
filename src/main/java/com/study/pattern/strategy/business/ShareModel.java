package com.study.pattern.strategy.business;

/**
 * 分享模型
 */
public abstract class ShareModel {

    private String content;
    public String getContent(){
        return content;
    }

    public abstract boolean isLogin();

    public abstract String getName();

    public void setContent(String content){
        this.content = content;
    }

    public void share(){
        if(isLogin()){
            System.out.println(getContent() + "，分享成功");
        }else {
            System.out.println("分享失败");
        }
    }
}
