package com.machine.coding.socialmedia.dao;

import com.machine.coding.socialmedia.entitie.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {}

