package com.eder.apitest.domain.user;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity(name = "users")
@Table(name = "users")
@EqualsAndHashCode(of = "id")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String firstName;
    private String lastName;
    private String login;
    private String password;
}
