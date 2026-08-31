package com.api.campusfinder.DTO;

import com.api.campusfinder.Entity.AlunoEntity;

public class CampusDTO {
    private String campusNome;
    private AlunoEntity aluno;

    public String getCampusNome() {
        return campusNome;
    }
    public void setCampusNome(String campusNome) {
        this.campusNome = campusNome;
    }
    public AlunoEntity getAluno() {
        return aluno;
    }
    public void setAluno(AlunoEntity aluno) {
        this.aluno = aluno;
    }
  
}
