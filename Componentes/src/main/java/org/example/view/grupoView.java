package org.example.view;

import org.example.models.grupoModel;

import java.util.List;

public class grupoView {

    public void imprimirListaGrupos(List<grupoModel> grupos) {
        System.out.println("--- LISTA DE GRUPOS ---");
        for (grupoModel g : grupos) {
            System.out.println("ID: " + g.getId() + " | Nombre: " + g.getNombre() + " | Estado: " + g.getEstado());
        }
        System.out.println("-----------------------");
    }
}
