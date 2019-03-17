package com.study.pattern.strategy.business;

import java.util.HashMap;
import java.util.Map;

/**
 * 分享到动态切换
 */
public class ShareStrategy {
    private static Map<ShareType, ShareModel> SHARE_MAP = new HashMap<ShareType, ShareModel>();

    static {
        SHARE_MAP.put(ShareType.MOMENTS_SHARE, new MomentsShare());
        SHARE_MAP.put(ShareType.WECHAT_SHARE, new WechatShare());
        SHARE_MAP.put(ShareType.QQ_SHARE, new QQShare());
        SHARE_MAP.put(ShareType.WEIBO_SHARE, new WeiboShare());
    }

    public static ShareModel get(ShareType shareType){
        if(!SHARE_MAP.containsKey(shareType)){
            return SHARE_MAP.get(new ErrorShare());
        }
        return SHARE_MAP.get(shareType);
    }
}
