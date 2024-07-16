package com.teamovercomers.Church.Management.Application.repository;

import com.teamovercomers.Church.Management.Application.entity.MinistryDepartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MinistryDepartmentRepository extends JpaRepository<MinistryDepartment, Long> {
}

