package com.teamovercomers.Church.Management.Application.repository;


import com.teamovercomers.Church.Management.Application.entity.Church;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ChurchRepository extends JpaRepository<Church, Integer> {


}

