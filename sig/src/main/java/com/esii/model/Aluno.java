package com.esii.model;

import java.math.BigDecimal;

public class Aluno {

    private Matricula matricula;
    private String nome;
    private Turma turma;
    private BigDecimal nota;
    private boolean statusNota;


    public Aluno(Matricula matricula, String nome, Turma turma, BigDecimal nota) {
        this.matricula = matricula;
        this.nome = nome;
        this.turma = turma;
        this.nota = nota;
    }

    public Aluno(Matricula matricula, String nome, Turma turma) {
        this.matricula = matricula;
        this.nome = nome;
        this.turma = turma;
    }

	public Aluno() {
    }

   public void realizarMatricula() {
       
   }

    public BigDecimal getNota() {
        return this.nota;
    }

    public void setNota(BigDecimal nota) {
        this.nota = nota;
        this.setStatusNota(true);
    }

    public boolean isNota() {
        return this.statusNota;
    }

    public void setStatusNota(boolean status) {
        this.statusNota = status;
    }

}