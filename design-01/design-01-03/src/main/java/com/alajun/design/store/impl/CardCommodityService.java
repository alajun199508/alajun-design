package com.alajun.design.store.impl;

import com.alajun.design.card.IQYCardService;
import com.alajun.design.store.ICommodity;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class CardCommodityService implements ICommodity {

    private final Logger logger = LoggerFactory.getLogger(CardCommodityService.class);

    // 模拟注入
    private IQYCardService iqyCardService = new IQYCardService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {

        String mobile = queryUserMobile(uId);
        iqyCardService.grantToken(mobile, bizId);
        logger.info("请求参数[爱奇艺兑换卡] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[爱奇艺兑换卡]：success");
    }

    private String queryUserMobile(String uId) {

        return "10086";
    }
}
