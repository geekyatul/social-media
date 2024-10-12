package com.machine.coding.socialmedia.dao;

import com.machine.coding.socialmedia.entitie.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> {
}
