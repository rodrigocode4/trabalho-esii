package com.esii.model;

import java.util.List;

public class Turma {

    private String id;
    private List<Aluno> alunos;
    private List<Professor> professores;

    public Turma(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public List<Aluno> getAlunos() {
        return this.alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Professor> getProfessores() {
        return this.professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

}