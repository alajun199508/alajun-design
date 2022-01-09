package com.alajun.design.test;

import com.alajun.design.NetMall;
import com.alajun.design.impl.JDNetMall;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiTest {

    public Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_NetMall() {

        NetMall netMall = new JDNetMall("1000001","*******");
        String base64 = netMall.generateGoodsPoster("https://item.jd.com/100008348542.html");
        logger.info("测试结果：{}", base64);
    }

}
