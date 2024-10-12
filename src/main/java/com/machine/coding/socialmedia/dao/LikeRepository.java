package com.machine.coding.socialmedia.dao;

import com.machine.coding.socialmedia.entitie.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like, Long> {}
