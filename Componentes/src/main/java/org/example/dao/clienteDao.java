package org.example.dao;

import org.example.models.clienteModel;
import java.util.ArrayList;
import java.util.List;

public class clienteDao {
    private List<clienteModel> listaClientes;

    public clienteDao() {
        this.listaClientes = new ArrayList<>();
    }

    // Método para GUARDAR (Agregar al arreglo)
    public void crearCliente(clienteModel cliente) {
        listaClientes.add(cliente);
    }

    // Método para LEER (Obtener del arreglo)
    public List<clienteModel> obtenerTodos() {
        return listaClientes;
    }

    // Método para BUSCAR por ID
    public clienteModel buscarPorId(String id) {
        for (clienteModel c : listaClientes) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    // Método para ELIMINAR del arreglo
    public boolean eliminarCliente(String id) {
        clienteModel cliente = buscarPorId(id);
        if (cliente != null) {
            listaClientes.remove(cliente);
            return true;
        }
        return false;
    }
}
