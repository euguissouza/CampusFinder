package com.api.campusfinder.Controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.campusfinder.DTO.AlunoDTO;
import com.api.campusfinder.Repository.AlunoRepository;
import com.api.campusfinder.Service.AlunoService;

@RestController
@RequestMapping("/campus-finder")
public class AlunoController {

    private AlunoRepository repository;
    private AlunoService service;

    public AlunoController(AlunoRepository repository, AlunoService service) {
        this.repository = repository;
        this.service = service;
    }

    @PostMapping("/post")
    public void salvaAluno( @RequestBody AlunoDTO dto){
     service.cadastraAluno(dto);
    }
    
}
