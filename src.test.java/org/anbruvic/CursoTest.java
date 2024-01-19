package org.anbruvic;

import static org.junit.Assert.assertNotNull;

import org.anbruvic.dao.CursoDao;
import org.anbruvic.dao.ICursoDao;
import org.anbruvic.domain.Curso;
import org.junit.Test;


public class CursoTest {

    private ICursoDao cursoDao;

    public CursoTest() {
        cursoDao = new CursoDao();
    }

    @Test
    public void cadastrar() {
        Curso curso = new Curso();
        curso.setCodigo("A1");
        curso.setDescricao("CURSO TESTE - Hibernate OGM");
        curso.setNome("Curso de Java Backend");
        curso = cursoDao.cadastrar(curso);

        assertNotNull(curso);
        assertNotNull(curso.getId());
    }
}
