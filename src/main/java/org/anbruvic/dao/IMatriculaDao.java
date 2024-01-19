package org.anbruvic.dao;

import org.anbruvic.domain.Curso;
import org.anbruvic.domain.Matricula;

import java.util.List;

public interface IMatriculaDao {

    Matricula cadastrar(Matricula mat);

    Matricula buscarPorCodigoCurso(String codigoCurso);

    Matricula buscarPorCurso(Curso curso);

    Matricula buscarPorCodigoCursoCriteria(String codigoCurso);

    Matricula buscarPorCursoCriteria(Curso curso);

    List<Matricula> buscarTodos();

    void excluir(Matricula matricula);
}
