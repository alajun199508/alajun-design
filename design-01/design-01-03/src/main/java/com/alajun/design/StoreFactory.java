package com.alajun.design;

import com.alajun.design.store.ICommodity;
import com.alajun.design.store.impl.CardCommodityService;
import com.alajun.design.store.impl.CouponCommodityService;
import com.alajun.design.store.impl.GoodsCommodityService;

import java.util.HashMap;
import java.util.Map;

public class StoreFactory {

    private static Map<Integer, ICommodity> map = new HashMap<Integer, ICommodity>();

    static {
        map.put(1, new CouponCommodityService());
        map.put(2, new GoodsCommodityService());
        map.put(3, new CardCommodityService());
    }

    public static ICommodity getCommodityService(Integer prizeType) {

        ICommodity iCommodity = map.get(prizeType);
        if (null == iCommodity) {
            throw new RuntimeException("不存在的商品服务类型");
        }
        return iCommodity;
    }
}
