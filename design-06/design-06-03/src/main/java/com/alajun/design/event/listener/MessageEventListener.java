package com.alajun.design.event.listener;

import com.alajun.design.LotteryResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageEventListener implements EventListener {

    private final Logger logger = LoggerFactory.getLogger(MessageEventListener.class);

    @Override
    public void doEvent(LotteryResult result) {

        logger.info("给用户 {} 发送短信通知(短信)：{}", result.getUId(), result.getMsg());
    }

}