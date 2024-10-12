package com.machine.coding.socialmedia.service;

import com.machine.coding.socialmedia.entitie.Group;

import java.util.List;

public interface GroupService {
    Group createGroup(String groupName);
    List<Group> getAllGroups();
}
