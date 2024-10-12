package com.machine.coding.socialmedia.service;

import com.machine.coding.socialmedia.dao.GroupRepository;
import com.machine.coding.socialmedia.entitie.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    private GroupRepository groupRepository;

    @Override
    public Group createGroup(String groupName) {
        Group group = new Group();
        group.setName(groupName);
        return groupRepository.save(group);
    }

    @Override
    public List<Group> getAllGroups() {
        return groupRepository.findAll();
    }
}
