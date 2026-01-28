package org.example;

import org.example.controller.*;
import org.example.dao.*;
import org.example.view.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static Scanner scanner = new Scanner(System.in);
    static clienteController clienteController;
    static cursoController cursoController;
    static grupoController grupoController;

    public static void main(String[] args) {
        inicializarSistema(); // Paso 1: Arrancar MVC
        mostrarMenuPrincipal(); // Paso 2: Mostrar menú
    }

    private static void inicializarSistema() {
        //CLIENTES
        clienteDao clienteDao = new clienteDao();
        clienteView clienteView = new clienteView();
        clienteController = new clienteController(clienteView, clienteDao);

        //CURSOS
        cursoDao cursoDao = new cursoDao();
        cursoView cursoView = new cursoView();
        cursoController = new cursoController(cursoDao, cursoView);

        //GRUPOS
        grupoDao grupoDao = new grupoDao();
        grupoView grupoView = new grupoView();
        grupoController = new grupoController(grupoDao, grupoView);
    }

    private static void mostrarMenuPrincipal() {
        int opcion = 0;
        do {
            System.out.println("\n=== SISTEMA DE GESTIÓN ===");
            System.out.println("1. Gestionar Clientes");
            System.out.println("2. Gestionar Cursos");
            System.out.println("3. Gestionar Grupos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    gestionClientes();
                    break;
                case 2:
                    gestionCursos();
                    break;
                case 3:
                    gestionGrupos();
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }

    // --- Submenú Clientes ---
    private static void gestionClientes() {
        int opcion = 0;
        do {
            System.out.println("\n--- GESTIÓN DE CLIENTES ---");
            System.out.println("1. Registrar Cliente");
            System.out.println("2. Listar Clientes");
            System.out.println("3. Eliminar Cliente"); // Opción nueva
            System.out.println("4. Volver");
            System.out.print("Opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Apellidos: ");
                    String apellidos = scanner.nextLine();
                    System.out.print("Estado (1=Activo, 0=Inactivo): ");
                    String estado = scanner.nextLine();
                    System.out.print("Usuario asignado: ");
                    String usuario = scanner.nextLine();

                    clienteController.registrarCliente(id, nombre, apellidos, estado, usuario);
                    break;
                case 2:
                    clienteController.mostrarListaClientes();
                    break;
                case 3:
                    System.out.print("Ingrese el ID del cliente a eliminar: ");
                    String idEliminar = scanner.nextLine();
                    clienteController.eliminarCliente(idEliminar);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
    }

    // --- Submenú Cursos ---
    private static void gestionCursos() {
        int opcion = 0;
        do {
            System.out.println("\n--- GESTIÓN DE CURSOS ---");
            System.out.println("1. Registrar Curso");
            System.out.println("2. Listar Cursos");
            System.out.println("3. Eliminar Curso"); // Opción nueva
            System.out.println("4. Volver");
            System.out.print("Opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("ID del Curso: ");
                    String id = scanner.nextLine();
                    System.out.print("Nombre del Curso: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Descripción: ");
                    String desc = scanner.nextLine();
                    System.out.print("Duración: ");
                    String tiempo = scanner.nextLine();
                    System.out.print("Creado por: ");
                    String user = scanner.nextLine();

                    cursoController.registrarCurso(id, nombre, desc, tiempo, user);
                    break;
                case 2:
                    cursoController.mostrarCursos();
                    break;
                case 3:
                    System.out.print("Ingrese el ID del curso a eliminar: ");
                    String idEliminar = scanner.nextLine();
                    cursoController.eliminarCurso(idEliminar);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
    }

    // --- Submenú Grupos ---
    private static void gestionGrupos() {
        int opcion = 0;
        do {
            System.out.println("\n--- GESTIÓN DE GRUPOS ---");
            System.out.println("1. Registrar Grupo");
            System.out.println("2. Listar Grupos");
            System.out.println("3. Eliminar Grupo"); // Opción nueva
            System.out.println("4. Volver");
            System.out.print("Opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("ID Grupo: ");
                    String id = scanner.nextLine();
                    System.out.print("Nombre Grupo: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Estado: ");
                    String estado = scanner.nextLine();

                    grupoController.registrarGrupo(id, nombre, estado);
                    break;
                case 2:
                    grupoController.mostrarGrupos();
                    break;
                case 3:
                    System.out.print("Ingrese el ID del grupo a eliminar: ");
                    String idEliminar = scanner.nextLine();
                    grupoController.eliminarGrupo(idEliminar);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
    }

}
