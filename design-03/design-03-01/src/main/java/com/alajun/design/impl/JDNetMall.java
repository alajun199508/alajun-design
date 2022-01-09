package com.alajun.design.impl;

import com.alajun.design.NetMall;
import com.alibaba.fastjson.JSON;
import sun.misc.BASE64Encoder;

import java.util.HashMap;
import java.util.Map;

/**
 * 模拟JD商城
 */
public class JDNetMall extends NetMall {

    public JDNetMall(String uId, String uPwd) {
        super(uId, uPwd);
    }

    public Boolean login(String uId, String uPwd) {

        logger.info("模拟京东用户登录 uId：{} uPwd：{}", uId, uPwd);
        return true;
    }

    public Map<String, String> reptile(String skuUrl) {

        // 此处为调用第三方商品接口
        // String str = HttpClient.doGet(skuUrl);

        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "iphone13");
        map.put("price", "5999.00");
        logger.info("模拟京东商品爬虫解析：{} | {} 元 {}", map.get("name"), map.get("price"), skuUrl);
        return map;
    }

    public String createBase64(Map<String, String> goodsInfo) {

        BASE64Encoder encoder = new BASE64Encoder();
        logger.info("模拟生成京东商品base64海报");
        return encoder.encode(JSON.toJSONString(goodsInfo).getBytes());
    }

}
