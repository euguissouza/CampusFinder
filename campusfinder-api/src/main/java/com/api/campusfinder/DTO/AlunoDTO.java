package com.api.campusfinder.DTO;

import com.api.campusfinder.Enum.Campus;

public class AlunoDTO {
    private String aluno;
    private String rgm;
    private Campus campus;

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
    public Campus getCampus() {
        return campus;
    }
    public void setCampus(Campus campus) {
        this.campus = campus;
    }
}
