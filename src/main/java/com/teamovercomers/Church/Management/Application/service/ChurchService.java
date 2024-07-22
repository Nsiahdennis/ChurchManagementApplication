package com.teamovercomers.Church.Management.Application.service;

import com.teamovercomers.Church.Management.Application.entity.Church;
import com.teamovercomers.Church.Management.Application.repository.ChurchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class ChurchService {

    @Autowired
    private ChurchRepository churchRepository;

    public List<Church> getAllChurches() {
        return churchRepository.findAll();
    }

    public Church getChurchById(Integer id) {
        return churchRepository.findById(id).orElse(null);
    }

    public Church createChurch(Church church_new){
        Church church = new Church();
        church.setId(church_new.getId());
        church.setChurch_name(church_new.getChurch_name());
        church.setAddress(church_new.getAddress());
        church.setEmail(church_new.getEmail());
        church.setLocation(church_new.getLocation());
        return churchRepository.save(church);
    }

    public Church updateChurch(Integer id, Church church) {
        Church existingChurch = churchRepository.findById(id).orElse(null);
        if (existingChurch != null) {
            existingChurch.setLocation(church.getLocation());
            if(church.getChurch_name() !=null){
                existingChurch.setChurch_name(church.getChurch_name());

            }
           existingChurch.setEmail(church.getEmail());
            existingChurch.setAddress(church.getAddress());
            return churchRepository.save(existingChurch);
        }
        return null;
    }

    public void deleteChurch(Integer id) {
        churchRepository.deleteById(id);
    }
}


