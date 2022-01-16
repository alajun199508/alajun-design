package com.alajun.design;

import java.util.Date;

public class LotteryServiceImpl extends LotteryService {

    private MinibusTargetService minibusTargetService = new MinibusTargetService();

    @Override
    protected LotteryResult doDraw(String uId) {

        // 摇号
        String lottery = minibusTargetService.lottery(uId);
        return new LotteryResult(uId, lottery, new Date());
    }

}
