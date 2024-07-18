package com.teamovercomers.Church.Management.Application.Controllers;

import com.teamovercomers.Church.Management.Application.entity.MinistryDepartment;
import com.teamovercomers.Church.Management.Application.repository.MinistryDepartmentRepository;
import com.teamovercomers.Church.Management.Application.service.MinistryDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/MinistryDepartment")

public class MinistryDepart_Controller {
    @Autowired
    private MinistryDepartmentService ministryDepartmentService;

    @GetMapping

    public List<MinistryDepartment> getAllMinistryDepartment(){

        return ministryDepartmentService.getAllMinistryDepartment();


    }
}
