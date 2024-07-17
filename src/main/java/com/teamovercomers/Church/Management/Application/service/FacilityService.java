package com.teamovercomers.Church.Management.Application.service;

import com.teamovercomers.Church.Management.Application.entity.Facility;
import com.teamovercomers.Church.Management.Application.repository.FacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityService {
    @Autowired
    private FacilityRepository facilityRepository;

    public List<Facility> getAllFacility() {
      return facilityRepository.findAll();

    }

}
