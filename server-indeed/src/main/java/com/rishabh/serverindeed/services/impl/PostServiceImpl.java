package com.rishabh.serverindeed.services.impl;

import com.rishabh.serverindeed.dto.PostDto;
import com.rishabh.serverindeed.model.Post;
import com.rishabh.serverindeed.repository.PostRepository;
import com.rishabh.serverindeed.services.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository repository;

    @Override
    public Post savePost(PostDto postDto) {
        log.info("Inside PostService Impl..... saving");
        Post post = new Post();
        post.setProfile(postDto.getProfile());
        post.setDescription(postDto.getDescription());
        post.setSalary(postDto.getSalary());
        post.setTechnology(postDto.getTechnology());
        post.setType(postDto.getType());
        post.setExperience(postDto.getExperience());
        post.setCreatedAt(new Date());
        return repository.save(post);
    }

    @Override
    public List<Post> getAllPosts() {
        log.info("Inside get all Posts : Service layer");
        return repository.findAll();
    }
}
