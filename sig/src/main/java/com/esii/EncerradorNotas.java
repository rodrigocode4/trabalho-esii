package com.esii;

import java.util.List;

import com.esii.dao.AlunoDao;
import com.esii.model.Aluno;

public class EncerradorNotas {

    private int total = 0;
    private final AlunoDao alunoDao;

    public EncerradorNotas (AlunoDao alunoDao) {
        this.alunoDao = alunoDao;
    }
    
    public void encerrar()  {
        List<Aluno> todosALunosComNotas = alunoDao.notasLancadas();
        for(Aluno aluno : todosALunosComNotas) {
                aluno.setStatusNota(true);
                total++;
                alunoDao.atualizar(aluno);
        }
    }

    public int getTotalNotasEncerradas() {
        return total;
    }
}