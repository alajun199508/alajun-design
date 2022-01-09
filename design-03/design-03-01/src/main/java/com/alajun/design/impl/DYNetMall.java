package com.alajun.design.impl;

import com.alajun.design.NetMall;
import com.alibaba.fastjson.JSON;
import sun.misc.BASE64Encoder;

import java.util.HashMap;
import java.util.Map;

public class DYNetMall extends NetMall {

    public DYNetMall(String uId, String uPwd) {
        super(uId, uPwd);
    }

    @Override
    public Boolean login(String uId, String uPwd) {

        logger.info("模拟抖音用户登录 uId：{} uPwd：{}", uId, uPwd);
        return true;
    }

    @Override
    public Map<String, String> reptile(String skuUrl) {

        // 此处为调用第三方商品接口
        // String str = HttpClient.doGet(skuUrl);

        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "拖把");
        map.put("price", "48.00");
        logger.info("模拟抖音商品爬虫解析：{} | {} 元 {}", map.get("name"), map.get("price"), skuUrl);
        return map;
    }

    @Override
    public String createBase64(Map<String, String> goodsInfo) {

        BASE64Encoder encoder = new BASE64Encoder();
        logger.info("模拟生成抖音商品base64海报");
        return encoder.encode(JSON.toJSONString(goodsInfo).getBytes());
    }

}
