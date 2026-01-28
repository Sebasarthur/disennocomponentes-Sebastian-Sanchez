package org.example.dao;

import org.example.models.cursoModel;
import java.util.ArrayList;
import java.util.List;

public class cursoDao {
    private List<cursoModel> listaCursos;

    public cursoDao() {
        this.listaCursos = new ArrayList<>();
    }

    // Guardar en el arreglo
    public void crearCurso(cursoModel curso) {
        listaCursos.add(curso);
    }

    // Leer todo el arreglo
    public List<cursoModel> obtenerTodos() {
        return listaCursos;
    }

    // Buscar específico
    public cursoModel buscarPorId(String id) {
        for (cursoModel curso : listaCursos) {
            if (curso.getId().equals(id)) {
                return curso;
            }
        }
        return null;
    }

    // Eliminar
    public boolean eliminarCurso(String id) {
        cursoModel curso = buscarPorId(id);
        if (curso != null) {
            listaCursos.remove(curso);
            return true;
        }
        return false;
    }
}
