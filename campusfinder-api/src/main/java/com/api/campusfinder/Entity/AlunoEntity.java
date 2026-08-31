package com.api.campusfinder.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "aluno")
public class AlunoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String aluno;
    private String rgm;
    private CampusEntity campus;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAluno() {
        return aluno;
    }
    public void setAluno(String aluno) {
        this.aluno = aluno;
    }
    public String getRgm() {
        return rgm;
    }
    public void setRgm(String rgm) {
        this.rgm = rgm;
    }
    public CampusEntity getCampus() {
        return campus;
    }
    public void setCampus(CampusEntity campus) {
        this.campus = campus;
    }


    @Override
    public String toString() {
        return "AlunoEntity [id=" + id + ", aluno=" + aluno + ", rgm=" + rgm + ", campus=" + campus + "]";
    }

    
}
