package com.eder.apitest.domain.post;

import com.eder.apitest.domain.user.User;

import java.util.Date;

public record PostDTO(String title, String content, Date createdAt, User user) {
}
