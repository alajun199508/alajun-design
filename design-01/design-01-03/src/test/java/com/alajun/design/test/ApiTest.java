package com.alajun.design.test;

import com.alajun.design.StoreFactory;
import com.alajun.design.store.ICommodity;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ApiTest {

    @Test
    public void testCommodity() throws Exception {

        System.out.println("\r\n模拟发放优惠券\r");
        ICommodity commodityService1 = StoreFactory.getCommodityService(1);
        commodityService1.sendCommodity("10001", "EGM1023938910232121323432", "791098764902132", null);

        System.out.println("\r\n模拟方法实物商品\r");
        ICommodity commodityService2 = StoreFactory.getCommodityService(2);
        Map<String, String> extMap = new HashMap<String, String>();
        extMap.put("consigneeUserName", "Allen");
        extMap.put("consigneeUserPhone", "10086");
        extMap.put("consigneeUserAddress", "福建省.厦门市.湖里区.XX街道.帝景苑.#18-2109");
        commodityService2.sendCommodity("10001", "9820198721311", "1023000020112221113", extMap);

        System.out.println("\r\n第三方兑换卡(爱奇艺)\r");
        ICommodity commodityService3 = StoreFactory.getCommodityService(3);
        commodityService3.sendCommodity("10001", "AQY1xjkUodl8LO975GdfrYUio", "76352843962", null);
    }
}

