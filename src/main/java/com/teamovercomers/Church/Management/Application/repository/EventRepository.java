package com.teamovercomers.Church.Management.Application.repository;

import com.teamovercomers.Church.Management.Application.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository< Event, Integer> {
}
