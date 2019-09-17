package com.codeclan.relationshiplab.relationship.repositories;

import com.codeclan.relationshiplab.relationship.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository   extends JpaRepository<Department, Long> {
}
