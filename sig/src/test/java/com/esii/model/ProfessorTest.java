package com.esii.model;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class ProfessorTest {

    private Matricula matricula;
    private Turma turma;
    private Professor professor;
    private Aluno aluno;

    @Before
    public void instancer() {
        this.matricula = new Matricula(18640034);
        this.turma = new Turma("2016.4");
        this.professor = new Professor(1, "Adailton");
        this.aluno = new Aluno(matricula, "Rodrigo", turma);
    }

    @Test
    public void deveLancarNota(){

        professor.lancarNota(new BigDecimal(10), aluno);
        assertTrue(aluno.getNota().compareTo(new BigDecimal(10)) == 0);

    }

    @Test(expected = RuntimeException.class)
    public void deveLancarExceptionComNotasForasDoIntervalo() {
        professor.lancarNota(new BigDecimal(11), aluno);
        assertTrue(aluno.getNota().compareTo(new BigDecimal(10)) == -1);
    }


}