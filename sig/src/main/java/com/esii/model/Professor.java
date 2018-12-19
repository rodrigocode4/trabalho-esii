package com.esii.model;

import java.math.BigDecimal;

public class Professor {

    private int id;
    private String nome;

    public Professor(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void lancarNota(BigDecimal nota, Aluno aluno) {
        if (nota.intValue() > 10 || nota.intValue() < 0) {
            throw new RuntimeException("Nota não permitida");
        } 
        aluno.setNota(nota);
    }

}