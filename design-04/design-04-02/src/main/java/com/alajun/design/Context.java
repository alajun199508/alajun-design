package com.alajun.design;

import java.math.BigDecimal;

public class Context<T> {

    private ICouponDiscount<T> couponDiscount;

    public Context(ICouponDiscount<T> couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    public BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice) {

        BigDecimal bigDecimal = couponDiscount.discountAmount(couponInfo, skuPrice);

        // 例如对策略执行完的数据处理等等
        doSomething();

        return bigDecimal;
    }

    private void doSomething() {

    }
}
