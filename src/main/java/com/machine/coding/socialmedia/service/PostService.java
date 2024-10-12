package com.machine.coding.socialmedia.service;

import com.machine.coding.socialmedia.entitie.Comment;
import com.machine.coding.socialmedia.entitie.Like;
import com.machine.coding.socialmedia.entitie.Post;

import java.util.List;

public interface PostService {
    Post createPost(Long groupId, Long userId, String content);
    List<Post> getPostsByGroup(Long groupId);
    Comment addComment(Long postId, Long userId, String commentContent);
    Like likePost(Long postId, Long userId);
}
