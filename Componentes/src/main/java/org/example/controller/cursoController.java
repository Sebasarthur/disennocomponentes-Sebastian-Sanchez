package org.example.controller;

import org.example.dao.cursoDao;
import org.example.models.cursoModel;
import org.example.view.cursoView;
import java.util.List;

public class cursoController {
    private cursoDao dao;
    private cursoView vista;

    public cursoController(cursoDao dao, cursoView vista) {
        this.dao = dao;
        this.vista = vista;
    }

    // Método que recibe datos sueltos, crea el objeto y lo manda al DAO
    public void registrarCurso(String id, String nombre, String descripcion, String tiempo, String usuario) {
        cursoModel nuevoCurso = new cursoModel(id, nombre, descripcion, tiempo, usuario);
        dao.crearCurso(nuevoCurso);
    }

    // Pide la lista al DAO y se la da a la Vista
    public void mostrarCursos() {
        List<cursoModel> cursos = dao.obtenerTodos();
        vista.imprimirListaCursos(cursos);
    }
    // Método para eliminar
    public void eliminarCurso(String id) {
        if (dao.eliminarCurso(id)) {
            System.out.println("Éxito: Curso eliminado.");
        } else {
            System.out.println("Error: No se encontró un curso con ese ID.");
        }
    }
}
