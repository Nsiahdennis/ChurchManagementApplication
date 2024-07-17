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
    public Facility getFacilityById(Integer id){
        return facilityRepository.findById(id).orElse(null);
    }
    public Facility createFacility(Facility facility){
        return facilityRepository.save(facility);
    }
    public Facility updateFacility(Integer id, Facility facility){
        Facility existingFacility = facilityRepository.findById(id).orElse(null);
        if(existingFacility!=null){
            existingFacility.setName(facility.getName());
            existingFacility.setType(facility.getType());
            existingFacility.setId(facility.getId());

            return facilityRepository.save(existingFacility);

        }
        return null;
    }
    public void deleteFacility(Integer id){
        facilityRepository.deleteById(id);
    }

}

