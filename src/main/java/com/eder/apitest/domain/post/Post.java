package com.eder.apitest.domain.post;

import com.eder.apitest.domain.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Entity(name = "posts")
@Table(name = "posts")
@EqualsAndHashCode(of = "id")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String title;
    private String content;
    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    public Post(PostDTO data) {
        this.title = data.title();
        this.content = data.content();
        this.user = data.user();
    }
}
