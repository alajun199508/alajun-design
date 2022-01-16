package com.alajun.design.test;

import com.alajun.design.LotteryResult;
import com.alajun.design.LotteryService;
import com.alajun.design.LotteryServiceImpl;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiTest {

    private final Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test() {

        LotteryService lotteryService = new LotteryServiceImpl();
        LotteryResult result = lotteryService.draw("2765789109876");
        logger.info("测试结果：{}", JSON.toJSONString(result));
    }

}
