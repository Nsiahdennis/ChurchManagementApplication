package com.teamovercomers.Church.Management.Application.service;

import com.teamovercomers.Church.Management.Application.entity.Church;
import com.teamovercomers.Church.Management.Application.entity.MinistryDepartment;
import com.teamovercomers.Church.Management.Application.repository.MinistryDepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MinistryDepartmentService {

    @Autowired
    private MinistryDepartmentRepository ministryDepartmentRepository;

    private List<MinistryDepartment> getAllMinistryDepartment() {
        return ministryDepartmentRepository.findAll();
    }

    public MinistryDepartment getMinistryDepartmentById(Long id) {
        return ministryDepartmentRepository.findById(id).orElse(null);
    }

    public MinistryDepartment createMinistryDepartment(MinistryDepartment ministryDepartment) {
        return ministryDepartmentRepository.save(ministryDepartment);
    }

    public MinistryDepartment updateMinistryDepartment(Long id, MinistryDepartment ministryDepartment) {
        MinistryDepartment existingMinistryDepartment = ministryDepartmentRepository.findById(id).orElse(null);
        if (existingMinistryDepartment != null) {
            existingMinistryDepartment.setId(ministryDepartment.getId());
            existingMinistryDepartment.setName(ministryDepartment.getName());
            existingMinistryDepartment.setType(existingMinistryDepartment.getType());
            return ministryDepartmentRepository.save(existingMinistryDepartment);
        }
        return null;
    }

    public void deleteMinistryDepartment(Long id) {
        ministryDepartmentRepository.deleteById(id);
    }
}
