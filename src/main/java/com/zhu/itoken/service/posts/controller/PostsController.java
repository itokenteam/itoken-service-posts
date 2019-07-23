package com.zhu.itoken.service.posts.controller;

import com.zhu.itoken.common.domain.Posts;
import com.zhu.itoken.common.dto.BaseResoult;
import com.zhu.itoken.service.posts.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostsController {

    @Autowired
    PostsService postsService;

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Object queryPosts(@PathVariable("id") Integer id){
        return BaseResoult.ok(postsService.getPosts(id));
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Object insertPosts(Posts posts){
        postsService.insert(posts);
        return BaseResoult.ok();
    }
}
