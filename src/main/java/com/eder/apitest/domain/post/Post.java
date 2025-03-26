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
    private Date createdAt;
    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;
}
