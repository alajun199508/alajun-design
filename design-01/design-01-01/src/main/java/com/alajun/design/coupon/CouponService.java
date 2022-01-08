package com.alajun.design.coupon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CouponService {

    private final Logger logger = LoggerFactory.getLogger(CouponService.class);

    public CouponResult sendCoupon(String uId, String couponNumber, String bizId) {

        logger.info("[兑换奖品-优惠券] uId：{} couponNumber：{} bizId：{}", uId, couponNumber, bizId);
        return new CouponResult("0000", "发放成功");
    }
}
