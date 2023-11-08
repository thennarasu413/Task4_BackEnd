package com.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.entity.BlogPost;
import com.backend.service.BlogService;

@RestController
@RequestMapping("/api/posts")
public class BlogController {
    @Autowired
    private BlogService blogService;
    
    @GetMapping
    public List<BlogPost> getAllPosts() {
        return blogService.getAllPosts();
    }
}
