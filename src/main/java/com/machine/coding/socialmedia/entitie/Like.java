package com.machine.coding.socialmedia.entitie;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Like {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;  // Added user who liked the post

    // Getters and Setters
}
