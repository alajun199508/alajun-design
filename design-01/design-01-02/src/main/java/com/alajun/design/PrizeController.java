package com.alajun.design;

import com.alajun.design.card.IQYCardService;
import com.alajun.design.coupon.CouponResult;
import com.alajun.design.coupon.CouponService;
import com.alajun.design.goods.DeliverReq;
import com.alajun.design.goods.GoodsService;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrizeController {

    private final Logger logger = LoggerFactory.getLogger(PrizeController.class);

    public PrizeRes exchangePrizes(PrizeReq req) {

        PrizeRes prizeRes = null;

        try {
            // 1优惠券、2实物商品、3第三方兑换卡(爱奇艺)
            if (req.getPrizeType() == 1) {
                CouponService couponService = new CouponService();
                CouponResult couponResult = couponService.sendCoupon(req.getUId(), req.getPrizeNumber(), req.getBizId());
                if ("0000".equals(couponResult.getCode())) {
                    prizeRes = new PrizeRes("0000", "发放成功");
                } else {
                    prizeRes = new PrizeRes("0001", "发放失败");
                }
            } else if (req.getPrizeType() == 2) {
                GoodsService goodsService = new GoodsService();
                DeliverReq deliverReq = new DeliverReq();
                deliverReq.setUserName(queryUserName(req.getUId()));
                deliverReq.setUserPhone(queryUserPhoneNumber(req.getUId()));
                deliverReq.setSku(req.getPrizeNumber());
                deliverReq.setOrderId(req.getBizId());
                deliverReq.setConsigneeUserName(req.getExtMap().get("consigneeUserName"));
                deliverReq.setConsigneeUserPhone(req.getExtMap().get("consigneeUserPhone"));
                deliverReq.setConsigneeUserAddress(req.getExtMap().get("consigneeUserAddress"));
                Boolean isSuccess = goodsService.deliverGoods(deliverReq);
                if (isSuccess) {
                    prizeRes = new PrizeRes("0000", "发放成功");
                } else {
                    prizeRes = new PrizeRes("0001", "发放失败");
                }
            } else if (req.getPrizeType() == 3) {
                String bindMobileNumber = queryUserPhoneNumber(req.getUId());
                IQYCardService iqyCardService = new IQYCardService();
                iqyCardService.grantToken(bindMobileNumber, req.getPrizeNumber());
                prizeRes = new PrizeRes("0000", "发放成功");
            }
            logger.info("[奖品发放完成] uid：{}", req.getUId());
        } catch (Exception e) {
            logger.error("[奖品发放失败] uid：{} req:{}", req.getUId(), JSON.toJSONString(req), e);
            prizeRes = new PrizeRes("0001", e.getMessage());
        }

        return prizeRes;
    }

    private String queryUserName(String uId) {
        return "Allen";
    }

    private String queryUserPhoneNumber(String uId) {
        return "10086";
    }
}
