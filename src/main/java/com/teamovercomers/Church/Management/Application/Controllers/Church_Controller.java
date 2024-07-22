package com.teamovercomers.Church.Management.Application.Controllers;


import com.teamovercomers.Church.Management.Application.entity.Church;
import com.teamovercomers.Church.Management.Application.service.ChurchService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/churches")
@AllArgsConstructor

public class Church_Controller {
    @Autowired

    private ChurchService churchService;

    @GetMapping
    public List<Church> getAllChurches() {
        return churchService.getAllChurches();
    }


    @GetMapping("/{id}")
    public Church getChurchById(@PathVariable Integer id) {

        return churchService.getChurchById(id);
    }

    @PostMapping
    public Church createChurch(@RequestBody Church church) {

        return churchService.createChurch(church);
    }
//    @PutMapping("/{id}")
//    public Church updateChurch(@PathVariable Integer id, @RequestBody Church church){
//        return churchService.updateChurch(id, church);
//    }
    @PutMapping("/{id}")
    public Church updatesChurch(@PathVariable Integer id, @RequestBody Church Church){
        return churchService.updateChurch(id, Church);
    }
    @DeleteMapping("/{id}")
    public Church DeleteChurch(@PathVariable Integer id){
     churchService.deleteChurch(id);
        return null;
    }





}
