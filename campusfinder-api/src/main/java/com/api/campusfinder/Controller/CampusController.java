package com.api.campusfinder.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.campusfinder.DTO.CampusDTO;
import com.api.campusfinder.Service.CampusService;

@RestController
@RequestMapping("/campus-finder/campus")
public class CampusController {


    private CampusService service;


    @PostMapping("/post")
    public void salvaCampus(@RequestBody CampusDTO dto){
        service.CadastraCampus(dto);
    }

}
