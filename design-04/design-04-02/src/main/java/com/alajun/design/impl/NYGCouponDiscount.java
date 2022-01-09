package com.alajun.design.impl;


import com.alajun.design.ICouponDiscount;

import java.math.BigDecimal;


public class NYGCouponDiscount implements ICouponDiscount<Double> {

    /**
     * n元购购买
     * 1. 无论原价多少钱都固定金额购买
     */
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {

        return new BigDecimal(couponInfo);
    }

}
