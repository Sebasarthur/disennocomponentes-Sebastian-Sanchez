package org.example.view;

import org.example.models.clienteModel;

import java.util.List;

public class clienteView {
    public void imprimirLista(List<clienteModel> clientes) {
        System.out.println("--- LISTA DE CLIENTES ---");
        for (clienteModel c : clientes) {
            System.out.println("ID: " + c.getId() + " | Nombre: " + c.getNombre());
        }
        System.out.println("-------------------------");
    }
}
