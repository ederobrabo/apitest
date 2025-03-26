package com.eder.apitest.services;

import com.eder.apitest.domain.post.Post;
import com.eder.apitest.domain.post.PostDTO;
import com.eder.apitest.domain.post.PostUpdateDTO;
import com.eder.apitest.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Post getPostById(UUID id) throws Exception {
        return postRepository.findById(id).orElseThrow(() -> new Exception());
    }

    public Post createPost(PostDTO data) {
        Post newPost = new Post(data);
        return postRepository.save(newPost);
    }

    public Post updatePost(UUID id, PostUpdateDTO data) throws Exception{
        Post post = postRepository.findById(id).orElseThrow(() -> new Exception());
        post.setTitle(data.title());
        post.setContent(data.content());
        return postRepository.save(post);
    }

    public void deletePost(UUID id) {
        postRepository.deleteById(id);
    }
}
