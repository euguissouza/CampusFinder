package com.api.campusfinder.Controller;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.campusfinder.DTO.AlunoDTO;
import com.api.campusfinder.Entity.AlunoEntity;
import com.api.campusfinder.Entity.CampusEntity;
import com.api.campusfinder.Repository.AlunoRepository;
import com.api.campusfinder.Service.AlunoService;

@RestController
@RequestMapping("/campus-finder/alunos")
public class AlunoController {


    private AlunoService service;
    private AlunoRepository repository;

    public AlunoController(AlunoService service, AlunoRepository repository) {
        this.service = service;
        this.repository = repository;
    }

    @PostMapping("/post")
    public void salvaAluno( @RequestBody AlunoDTO dto){
        service.cadastraAluno(dto);
    }


    @GetMapping("/get")
    public ResponseEntity<List<AlunoEntity>> buscaTudo(AlunoEntity alunos){
        List<AlunoEntity> busca = repository.findAll();
        return ResponseEntity.ok(busca);
    }
    
}
