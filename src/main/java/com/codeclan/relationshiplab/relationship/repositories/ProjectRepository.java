package com.codeclan.relationshiplab.relationship.repositories;

import com.codeclan.relationshiplab.relationship.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
