package com.machine.coding.socialmedia.controller;

import com.machine.coding.socialmedia.entitie.Comment;
import com.machine.coding.socialmedia.entitie.Like;
import com.machine.coding.socialmedia.entitie.Post;
import com.machine.coding.socialmedia.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    @Autowired
    private PostService postService;

    @PostMapping("/{groupId}/user/{userId}")
    public Post createPost(@PathVariable Long groupId, @PathVariable Long userId, @RequestParam String content) {
        return postService.createPost(groupId, userId, content);
    }

    @GetMapping("/group/{groupId}")
    public List<Post> getPostsByGroup(@PathVariable Long groupId) {
        return postService.getPostsByGroup(groupId);
    }

    @PostMapping("/{postId}/comment/user/{userId}")
    public Comment addComment(@PathVariable Long postId, @PathVariable Long userId, @RequestParam String commentContent) {
        return postService.addComment(postId, userId, commentContent);
    }

    @PostMapping("/{postId}/like/user/{userId}")
    public Like likePost(@PathVariable Long postId, @PathVariable Long userId) {
        return postService.likePost(postId, userId);
    }

}
