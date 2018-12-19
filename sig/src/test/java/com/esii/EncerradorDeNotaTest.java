package com.esii;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import com.esii.EncerradorNotas;
import com.esii.dao.AlunoDao;
import com.esii.model.Aluno;
import com.esii.model.Matricula;
import com.esii.model.Turma;

import org.junit.Before;
import org.junit.Test;

public class EncerradorDeNotaTest {

    private Matricula matricula;
    private Turma turma;
    private BigDecimal nota;

    @Before
    public void instacer() {
        this.matricula = new Matricula(18640034);
        this.turma = new Turma("2016.4");
        this.nota = new BigDecimal(10);
    }
  
    @Test
    public void deveVerificarAlunosNotasLancadas() {
        Aluno rodrigo = new Aluno(matricula, "Rodrigo", turma, nota);
        Aluno randerson = new Aluno(matricula, "Randerson", turma, nota);
        List<Aluno> alunosComNotas = Arrays.asList(rodrigo, randerson);

        AlunoDao alunoDaoMock  = mock(AlunoDao.class);
        when(alunoDaoMock.notasLancadas()).thenReturn(alunosComNotas);
        
        EncerradorNotas encerrador = new EncerradorNotas(alunoDaoMock);
        encerrador.encerrar();

        assertTrue(rodrigo.isNota());
        assertTrue(randerson.isNota());
        assertEquals(2, encerrador.getTotalNotasEncerradas());

    }
}