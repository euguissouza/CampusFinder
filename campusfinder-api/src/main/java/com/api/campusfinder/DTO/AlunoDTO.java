package com.api.campusfinder.DTO;

import com.api.campusfinder.Entity.CampusEntity;


public class AlunoDTO {
    private String aluno;
    private String rgm;
    private CampusEntity campus;

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
}
