package com.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.controller.BlogRepository;
import com.backend.entity.BlogPost;

@Service
public class BlogService {
    @Autowired
    private BlogRepository blogRepository;
    
    public List<BlogPost> getAllPosts() {
        return blogRepository.findAll();
    }
    
    // Other methods to create, update, and delete posts
}
