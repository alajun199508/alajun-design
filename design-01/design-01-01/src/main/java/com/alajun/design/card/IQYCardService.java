package com.alajun.design.card;

import com.alajun.design.coupon.CouponService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IQYCardService {

    private final Logger logger = LoggerFactory.getLogger(CouponService.class);

    public void grantToken(String bindMobileNumber, String cardId) {

        logger.info("[兑换奖品-第三方兑换卡（爱奇艺）] bindMobileNumber：{} cardId：{}", bindMobileNumber, cardId);
    }
}
