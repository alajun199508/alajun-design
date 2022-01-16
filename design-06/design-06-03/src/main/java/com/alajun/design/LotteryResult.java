package com.alajun.design;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class LotteryResult {

    private String uId;    // 用户ID
    private String msg;    // 摇号信息
    private Date dateTime; // 业务时间

}
