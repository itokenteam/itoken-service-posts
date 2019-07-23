package com.zhu.itoken.service.posts.mapper;

import com.zhu.itoken.common.domain.Posts;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PostsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Posts record);

    int insertSelective(Posts record);

    Posts selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Posts record);

    int updateByPrimaryKey(Posts record);

    int insertPosts(Posts posts);

    Posts selectPost(Integer id);
}