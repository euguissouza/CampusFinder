package com.api.campusfinder.Service;

import org.springframework.stereotype.Service;

import com.api.campusfinder.DTO.AlunoDTO;
import com.api.campusfinder.Entity.AlunoEntity;
import com.api.campusfinder.Repository.AlunoRepository;

@Service
public class AlunoService {

    private AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public void cadastraAluno(AlunoDTO dto){

        AlunoEntity aluno = new AlunoEntity();
        aluno.setAluno(dto.getAluno());
        aluno.setRgm(dto.getRgm());
        repository.save(aluno);
    }

}
