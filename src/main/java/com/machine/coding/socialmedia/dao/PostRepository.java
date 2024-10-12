package com.machine.coding.socialmedia.dao;

import com.machine.coding.socialmedia.entitie.Group;
import com.machine.coding.socialmedia.entitie.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByGroup(Group group);
}