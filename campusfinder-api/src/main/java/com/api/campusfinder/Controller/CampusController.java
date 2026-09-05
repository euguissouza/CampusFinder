package com.api.campusfinder.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.campusfinder.DTO.CampusDTO;
import com.api.campusfinder.Entity.CampusEntity;
import com.api.campusfinder.Service.CampusService;
import com.api.campusfinder.Tools.ArvoreBinaria.Arvore;

@RestController
@RequestMapping("/campus-finder/campus")
public class CampusController {


    private CampusService service;
    private Arvore arvore;

    public CampusController(CampusService service) {
        this.service = service;
    }

    @PostMapping("/post")
    public void salvaCampus(@RequestBody CampusDTO dto){
        service.CadastraCampus(dto);
    }


    @GetMapping("/get/{campusNome}")
    public CampusEntity buscaCampus(@PathVariable String campusNome) throws Exception{
        return service.buscaPorNome(campusNome);
    }
}
