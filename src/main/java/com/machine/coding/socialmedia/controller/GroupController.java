package com.machine.coding.socialmedia.controller;

import com.machine.coding.socialmedia.entitie.Group;
import com.machine.coding.socialmedia.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/groups")
public class GroupController {

    @Autowired
    private GroupService groupService;

    @PostMapping
    public Group createGroup(@RequestParam String groupName) {
        return groupService.createGroup(groupName);
    }

    @GetMapping
    public List<Group> getAllGroups() {
        return groupService.getAllGroups();
    }
}
