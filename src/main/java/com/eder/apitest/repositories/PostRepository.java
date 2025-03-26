package com.eder.apitest.repositories;

import com.eder.apitest.domain.post.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PostRepository extends JpaRepository<Post, UUID> {
    public Post findByTitle(String title);
}
