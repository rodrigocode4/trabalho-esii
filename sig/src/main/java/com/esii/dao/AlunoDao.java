package com.esii.dao;

import java.util.ArrayList;
import java.util.List;

import com.esii.model.Aluno;

public class AlunoDao {

    public List<Aluno> notasLancadas() {
        return porEncerrado(true);
    }

    private List<Aluno> porEncerrado(boolean status) {
        List<Aluno> leiloes = new ArrayList<>();
        return leiloes;
    }

    public void atualizar(Aluno aluno) {

    }

}