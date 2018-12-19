package com.esii.dao;

import java.util.ArrayList;
import java.util.List;

import com.esii.model.Aluno;
import com.esii.model.Professor;
import com.esii.model.Turma;

public class TurmaDao {


    public List<Aluno> listarAlunosDaTurma(Turma turma) {
        List<Aluno> alunos = new ArrayList<>();
        return alunos;
    }

    public List<Professor> listarProfessoresDaTurma(Turma turma) {
        List<Professor> professores = new ArrayList<>();
       return professores;
    }


}