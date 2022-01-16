package com.alajun.design;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class LotteryServiceImpl implements LotteryService {

    private final Logger logger = LoggerFactory.getLogger(LotteryServiceImpl.class);

    private MinibusTargetService minibusTargetService = new MinibusTargetService();

    public LotteryResult doDraw(String uId) {

        String lottery = minibusTargetService.lottery(uId);

        logger.info("给用户 {} 发送短信通知(短信)：{}", uId, lottery);
        logger.info("记录用户 {} 摇号结果(MQ)：{}", uId, lottery);

        return new LotteryResult(uId, lottery, new Date());
    }

}
