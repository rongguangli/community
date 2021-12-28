package com.guang.community.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DiscussPost {

    private int id;
    private int userId;
    private String title;
    private String content;
    private int type;//0普通1置顶
    private int status;//0正常1精华2拉黑
    private Date createTime;
    private int commentCount;
    private double score;
}
