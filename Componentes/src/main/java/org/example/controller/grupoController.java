package org.example.controller;

import org.example.dao.grupoDao;
import org.example.models.grupoModel;
import org.example.view.grupoView;
import java.util.List;


public class grupoController {

    private grupoDao dao;
    private grupoView vista;

    public grupoController(grupoDao dao, grupoView vista) {
        this.dao = dao;
        this.vista = vista;
    }

    public void registrarGrupo(String id, String nombre, String estado) {
        grupoModel nuevoGrupo = new grupoModel(id, nombre, estado);
        dao.crearGrupo(nuevoGrupo);

    }

    public void mostrarGrupos() {
        List<grupoModel> grupos = dao.obtenerTodos();
        vista.imprimirListaGrupos(grupos);
    }

    // Método para eliminar
    public void eliminarGrupo(String id) {
        if (dao.eliminarGrupo(id)) {
            System.out.println("Éxito: Grupo eliminado.");
        } else {
            System.out.println("Error: No se encontró un grupo con ese ID.");
        }
    }

}
