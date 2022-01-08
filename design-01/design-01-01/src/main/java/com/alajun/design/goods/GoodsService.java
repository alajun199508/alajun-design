package com.alajun.design.goods;

import com.alajun.design.coupon.CouponService;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoodsService {

    private final Logger logger = LoggerFactory.getLogger(CouponService.class);

    public Boolean deliverGoods(DeliverReq req){

        logger.info("[兑换奖品-实物] req：{}", JSON.toJSON(req));
        return true;
    }
}
