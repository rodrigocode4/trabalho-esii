package com.esii.dao;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import com.esii.dao.TurmaDao;
import com.esii.model.Aluno;
import com.esii.model.Matricula;
import com.esii.model.Professor;
import com.esii.model.Turma;

import org.junit.Before;
import org.junit.Test;

public class TurmaDaoTest {

    private Matricula matricula;
    private Turma turma;

    @Before
    public void instacer() {
        this.matricula = new Matricula(18640034);
        this.turma = new Turma("2016.4");
    }

    @Test
    public void deveBuscarAlunosMatriculados() {
        Aluno rodrigo = new Aluno(matricula, "Rodrigo", turma);
        Aluno randerson = new Aluno(matricula, "Randerson", turma);
        List<Aluno> alunosMatriculados = Arrays.asList(rodrigo, randerson);

        TurmaDao turmaDaoMock = mock(TurmaDao.class);
        when(turmaDaoMock.listarAlunosDaTurma(turma)).thenReturn(alunosMatriculados);

        assertEquals(2, turmaDaoMock.listarAlunosDaTurma(turma).size());
    }

    @Test
    public void deveBuscarProfessoresMatriculados() {
        Professor adailton = new Professor(1, "Adailton");
        Professor euziane = new Professor(2, "Elziane");
        Professor romeu = new Professor(3, "Romeu");
        Professor diogo = new Professor(4, "Diogo");
        List<Professor> professoresMatriculados = Arrays.asList(adailton, euziane, romeu, diogo);

        TurmaDao turmaDaoMock = mock(TurmaDao.class);
        when(turmaDaoMock.listarProfessoresDaTurma(turma)).thenReturn(professoresMatriculados);
        
        assertEquals(4, turmaDaoMock.listarProfessoresDaTurma(turma).size());
    }
}