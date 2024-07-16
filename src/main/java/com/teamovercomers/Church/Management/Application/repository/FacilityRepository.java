package com.teamovercomers.Church.Management.Application.repository;

import com.teamovercomers.Church.Management.Application.entity.Facility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacilityRepository extends JpaRepository<Facility, Integer>{
}