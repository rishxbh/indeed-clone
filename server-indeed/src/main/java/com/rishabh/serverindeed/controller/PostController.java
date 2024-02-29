package com.rishabh.serverindeed.controller;

import com.rishabh.serverindeed.dto.PostDto;
import com.rishabh.serverindeed.model.Post;
import com.rishabh.serverindeed.services.PostService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@CrossOrigin
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping("/post")
    public Post savePost(@Valid @RequestBody PostDto postDto) {
        log.info("Inside savepost controller");
        return postService.savePost(postDto);
    }

    @GetMapping("/posts")
    public List<Post> getAllPosts() {
        log.info("Inside getAllPosts");
        return postService.getAllPosts();
    }

}
