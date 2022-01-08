package com.alajun.design.test;

import com.alajun.design.PrizeController;
import com.alajun.design.PrizeReq;
import com.alajun.design.PrizeRes;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.HashMap;

public class PrizeControllerTest {

    private final Logger logger = LoggerFactory.getLogger(PrizeControllerTest.class);

    @Test
    public void exchangePrizes() {

        PrizeController prizeController = new PrizeController();

        System.out.println("\r\n模拟发放优惠券\r");
        PrizeReq req01 = new PrizeReq();
        req01.setUId("10001");
        req01.setPrizeType(1);
        req01.setPrizeNumber("EGM1023938910232121323432");
        req01.setBizId("791098764902132");
        PrizeRes res01 = prizeController.exchangePrizes(req01);

        logger.info("请求参数：{}", JSON.toJSON(req01));
        logger.info("测试结果：{}", JSON.toJSON(res01));

        System.out.println("\r\n模拟方法实物商品\r");
        PrizeReq req02 = new PrizeReq();
        req02.setUId("10001");
        req02.setPrizeType(2);
        req02.setPrizeNumber("9820198721311");
        req02.setBizId("1023000020112221113");
        req02.setExtMap(new HashMap<String, String>() {{
            put("consigneeUserName", "Allen");
            put("consigneeUserPhone", "10086");
            put("consigneeUserAddress", "福建省.厦门市.湖里区.XX街道.帝景苑.#18-2109");
        }});

        PrizeRes res02 = prizeController.exchangePrizes(req02);
        logger.info("请求参数：{}", JSON.toJSON(req02));
        logger.info("测试结果：{}", JSON.toJSON(res02));

        System.out.println("\r\n第三方兑换卡(爱奇艺)\r");
        PrizeReq req03 = new PrizeReq();
        req03.setUId("10001");
        req03.setPrizeType(3);
        req03.setPrizeNumber("AQY1xjkUodl8LO975GdfrYUio");

        PrizeRes res03 = prizeController.exchangePrizes(req03);
        logger.info("请求参数：{}", JSON.toJSON(req03));
        logger.info("测试结果：{}", JSON.toJSON(res03));
    }
}
