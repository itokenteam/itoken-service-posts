package com.zhu.itoken.service.posts.service;

import com.zhu.itoken.common.domain.Posts;

public interface PostsService {

    int insert(Posts posts);
    Posts getPosts(Integer id);
}
