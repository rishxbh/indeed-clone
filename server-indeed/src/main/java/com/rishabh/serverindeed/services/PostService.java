package com.rishabh.serverindeed.services;

import com.rishabh.serverindeed.dto.PostDto;
import com.rishabh.serverindeed.model.Post;

import java.util.List;

public interface PostService {
    Post savePost(PostDto postDto);

    List<Post> getAllPosts();
}
