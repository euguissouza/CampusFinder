package com.api.campusfinder.Entity;

import jakarta.persistence.Id;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "campusTb")
public class CampusEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String campusNome;

    @OneToMany(mappedBy = "campus",fetch = FetchType.EAGER)
    @JsonManagedReference 
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

    @Override
    public String toString() {
        return "CampusEntity [id=" + id + ", campusNome=" + campusNome + ", aluno=" + aluno + "]";
    }




}
