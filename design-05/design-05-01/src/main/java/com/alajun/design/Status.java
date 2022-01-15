package com.alajun.design;

public enum Status {

    Editing, // 创建编辑
    Check,   // 待审核
    Pass,    // 审核通过(任务扫描成活动中)
    Refuse,  // 审核拒绝(可以撤审到编辑状态)
    Doing,   // 活动中
    Close,   // 活动关闭
    Open     // 活动开启(任务扫描成活动中)

}
