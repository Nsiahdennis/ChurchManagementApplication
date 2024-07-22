package com.teamovercomers.Church.Management.Application.Controllers;

import com.teamovercomers.Church.Management.Application.entity.MinistryDepartment;
import com.teamovercomers.Church.Management.Application.service.MinistryDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/MinistryDepartment")

public class MinistryDepart_Controller {
    @Autowired
    private MinistryDepartmentService ministryDepartmentService;

    public MinistryDepart_Controller(MinistryDepartmentService ministryDepartmentService) {
        this.ministryDepartmentService = ministryDepartmentService;
    }

    @GetMapping

    public List<MinistryDepartment> getAllMinistryDepartment() {

        return ministryDepartmentService.getAllMinistryDepartment();


    }

    @GetMapping("/{id}")
    public MinistryDepartment getMinistryDepartmentById(@PathVariable Long id) {

        return ministryDepartmentService.getMinistryDepartmentById(id);
    }

    @PostMapping("/{id}")
    public MinistryDepartment createMinistryDepartment(@RequestBody MinistryDepartment ministryDepartment) {


        return ministryDepartmentService.createMinistryDepartment(ministryDepartment);
    }

    @PutMapping("/{id}")
    public MinistryDepartment updateMinistryDepartment(@PathVariable Long id, @RequestBody MinistryDepartment MinistryDepartment) {

        return ministryDepartmentService.updateMinistryDepartment(id, MinistryDepartment);

    }

    @PatchMapping("/{id}")
    public MinistryDepartment updatesChurch(@PathVariable Long id, @RequestBody MinistryDepartment MinistryDepartment) {
        return ministryDepartmentService.updateMinistryDepartment(id, MinistryDepartment);

    }

    @DeleteMapping("/{id}")
    public MinistryDepartment
    DeleteMinistryDepartment(@PathVariable Long id) {
        ministryDepartmentService.deleteMinistryDepartment(id);
        return null;
    }
}
