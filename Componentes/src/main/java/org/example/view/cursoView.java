package org.example.view;
import org.example.models.clienteModel;
import org.example.models.cursoModel;

import java.util.List;

public class cursoView {

    public void imprimirListaCursos(List<cursoModel> cursos) {
        System.out.println("--- LISTA DE CURSOS ---");
        for (cursoModel c : cursos) {
            System.out.println("ID: " + c.getId() + " | Curso: " + c.getNombre() + " | Duración: " + c.getTiempo());
        }
        System.out.println("-----------------------");
    }
    
}


