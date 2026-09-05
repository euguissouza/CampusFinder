package com.api.campusfinder.DTO;

import java.util.List;

import com.api.campusfinder.Entity.AlunoEntity;

public class CampusDTO {
    private Long id;
    private String campusNome;
    private List<AlunoEntity> aluno;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getCampusNome() {
        return campusNome;
    }
    
    public void setCampusNome(String campusNome) {
        this.campusNome = campusNome;
    }

    public List<AlunoEntity> getAluno() {
        return aluno;
    }

    public void setAluno(List<AlunoEntity> aluno) {
        this.aluno = aluno;
    }
}
