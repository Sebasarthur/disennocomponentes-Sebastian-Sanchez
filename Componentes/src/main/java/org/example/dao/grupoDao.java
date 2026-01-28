package org.example.dao;


import org.example.models.cursoModel;
import org.example.models.grupoModel;
import java.util.ArrayList;
import java.util.List;

public class grupoDao {
    private List<grupoModel> listaGrupos;

    public grupoDao() {
        this.listaGrupos = new ArrayList<>();
    }

    // Guardar en el arreglo
    public void crearGrupo(grupoModel grupo) {
        listaGrupos.add(grupo);
    }

    // Leer todo el arreglo
    public List<grupoModel> obtenerTodos() {
        return listaGrupos;
    }

    // Buscar específico
    public grupoModel buscarPorId(String id) {
        for (grupoModel grupo : listaGrupos) {
            if (grupo.getId().equals(id)) {
                return grupo;
            }
        }
        return null;
    }

    // Eliminar
    public boolean eliminarGrupo(String id) {
        grupoModel grupo = buscarPorId(id);
        if (grupo != null) {
            listaGrupos.remove(grupo);
            return true;
        }
        return false;
    }
}
