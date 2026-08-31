package com.api.campusfinder.Controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.campusfinder.DTO.AlunoDTO;
import com.api.campusfinder.Service.AlunoService;

@RestController
@RequestMapping("/campus-finder/alunos")
public class AlunoController {


    private AlunoService service;

    public AlunoController(AlunoService service) {
        this.service = service;
    }

    @PostMapping("/post")
    public void salvaAluno( @RequestBody AlunoDTO dto){
     service.cadastraAluno(dto);
    }
    
}
