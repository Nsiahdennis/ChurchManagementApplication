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

    public Church createChurch(Church church) {
        return churchRepository.save(church);
    }

    public Church updateChurch(Integer id, Church church) {
        Church existingChurch = churchRepository.findById(id).orElse(null);
        System.out.println(existingChurch);
        if (existingChurch != null) {
            existingChurch.setChurch_name(church.getChurch_name());
            existingChurch.setLocation(church.getLocation());
            existingChurch.setEmail(existingChurch.getEmail());
            existingChurch.setAddress(existingChurch.getAddress());
            return churchRepository.save(existingChurch);
        }
        return null;
    }

    public void deleteChurch(Integer id) {
        churchRepository.deleteById(id);
    }
}


