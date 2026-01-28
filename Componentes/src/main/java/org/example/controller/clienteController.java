package org.example.controller;
import org.example.dao.clienteDao;
import org.example.models.clienteModel;
import org.example.view.clienteView;

import java.util.List;

public class clienteController {

    private clienteView vista;
    private clienteDao dao; // El controlador tiene acceso al DAO

    public clienteController(clienteView vista, clienteDao dao) {
        this.vista = vista;
        this.dao = dao;
    }

    // Acción para registrar un nuevo cliente
    public void registrarCliente(String id, String nombre, String apellidos, String estado, String usuario) {
        // 1. Creamos el objeto (Modelo)
        clienteModel nuevoCliente = new clienteModel(id, nombre, apellidos, estado, usuario);

        // 2. Le decimos al DAO que lo guarde en el arreglo
        dao.crearCliente(nuevoCliente);

        // 3. Confirmamos en la vista
        System.out.println("Cliente guardado con éxito.");
    }

    // Acción para mostrar todos los clientes
    public void mostrarListaClientes() {
        // 1. Pedimos la lista al DAO
        List<clienteModel> lista = dao.obtenerTodos();

        // 2. Le pasamos la lista a la Vista para que la imprima
        vista.imprimirLista(lista);
    }

    // Método para eliminar
    public void eliminarCliente(String id) {
        if (dao.eliminarCliente(id)) {
            System.out.println("Éxito: Cliente eliminado.");
        } else {
            System.out.println("Error: No se encontró un cliente con ese ID.");
        }
    }
}
