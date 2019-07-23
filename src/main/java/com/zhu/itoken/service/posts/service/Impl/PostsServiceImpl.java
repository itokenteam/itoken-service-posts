package com.zhu.itoken.service.posts.service.Impl;

import com.zhu.itoken.common.domain.Posts;
import com.zhu.itoken.service.posts.mapper.PostsMapper;
import com.zhu.itoken.service.posts.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class PostsServiceImpl implements PostsService {

    @Autowired
    PostsMapper postsMapper;

    @Override
    @Transactional(readOnly = false)
    public int insert(Posts posts) {
        return postsMapper.insertPosts(posts);
    }

    @Override
    @Transactional(readOnly = true)
    public Posts getPosts(Integer id) {
        return postsMapper.selectPost(id);
    }
}
