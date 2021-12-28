package com.guang.community.dao;

import com.guang.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    /**
     *
     * @param userId 用于个人主页查询个人全部帖子
     * @param offset 起始页数
     * @param limit 每页展示的数据条数
     * @return
     */
    public List<DiscussPost> selectDiscussPosts(int userId,int offset,int limit);

    /**
     * @Param:用于给参数取别名，当需要动态拼接sql且参数只有一个时，必须给参数取别名
     * @param userId
     * @return
     */
    public int selectDiscussPostRowsTotal(@Param("userId") int userId);
}
