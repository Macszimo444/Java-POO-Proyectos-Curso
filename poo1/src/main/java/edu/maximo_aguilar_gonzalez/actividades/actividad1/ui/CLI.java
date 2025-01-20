package edu.maximo_aguilar_gonzalez.actividades.actividad1.ui;

import java.util.Scanner;

import edu.maximo_aguilar_gonzalez.actividades.actividad1.models.Car;
import edu.maximo_aguilar_gonzalez.actividades.actividad1.process.StockManager;


public class CLI {

    /**
     * Ejecutar la aplicación
     */
    public static void runApp() {
        // Captura entrada
        Scanner scanner = new Scanner(System.in);
        // Gestionar el catálogo de coches
        StockManager stockManager = new StockManager();
        showMenu();
        // Captura el inicio de lo que usuario inserte
        int opcion = scanner.nextInt();
        scanner.nextLine();

        // Bucle que continua hasta que usuario seleccione la opción 3

        while (opcion != 3) {
            switch (opcion) {
                case 1:

                    System.out.println("Introduce el numero de puertas ");
                    int numPuertas = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Introduce el color ");
                    String color = scanner.nextLine();
                    System.out.println("Introduce el modelo ");
                    String modelo = scanner.nextLine();
                    System.out.println("Introduce la marca ");
                    String marca = scanner.nextLine();
                    stockManager.addCar(modelo, marca, numPuertas, color);
                    break;

                case 2:
                    if (stockManager.getStock().isEmpty()) {
                        System.out.println("El catalogo se encuentra vacío, primero ingrese un coche de favor");

                    } else {

                        int auto = 1;
                        for (Car car : stockManager.getStock()) {
                            System.out.println("Auto#" + auto + ":");
                            System.out.println("Modelo:" + car.getModelo());
                            System.out.println("Color:" + car.getColor());
                            System.out.println("NumPuertas:" + car.getNumPuertas());
                            System.out.println("Marca:" + car.getMarca());
                            auto++; // Se incrementa el contador
                        }
                    }

                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            // Volver a mostrar el menu despues de procesar la opción seleccionada
            showMenu();
            // Captura la siguiente opción del usuario
            opcion = scanner.nextInt();
        }
        System.out.println("Saliendo de la aplicación...");
        scanner.close();
    }

    /**
     * Interfaz de terminal pequeña de Menú
     */
    public static void showMenu(){
        System.out.println("""
                'Menú'
                --------------------------------
                1. Agregar Carro al catalogo   +
                2. Mostrar catalogo            +
                3. Salir                       +
                --------------------------------
                """);
    }
}

