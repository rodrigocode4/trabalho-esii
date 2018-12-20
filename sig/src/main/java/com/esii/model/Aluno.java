package com.esii.model;

import java.math.BigDecimal;

public class Aluno {

    private Matricula matricula;
    private String nome;
    private Turma turma;
    private BigDecimal nota;
    private boolean statusNota;


    public Aluno(Matricula matricula, String nome, Turma turma, BigDecimal nota) {
        this(matricula, nome, turma);
        this.nota = nota;
    }

    public Aluno(Matricula matricula, String nome, Turma turma) {
        this();
        this.matricula = matricula;
        this.nome = nome;
        this.turma = turma;
    }

	public Aluno() {
    }

    public Matricula getMatricula() {
        return this.matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Turma getTurma() {
        return this.turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
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