package edu.maximo_aguilar_gonzalez.actividades.actividad3.ui;

import java.util.Scanner;

import edu.maximo_aguilar_gonzalez.actividades.actividad3.models.Producto;
import edu.maximo_aguilar_gonzalez.actividades.actividad3.process.PriceCalculator;
import edu.maximo_aguilar_gonzalez.actividades.actividad3.process.ProductComparator;

//En CLI (Command Line Interface) se proporciona una interfaz para el usuario en la que va a interactuar 
public class CLI {

    public static void runApp (){

        //Se crea y se asigna los valores a dos objetos
        try (Scanner scanner = new Scanner(System.in)) {

            Producto producto1 = new Producto();
            Producto producto2 = new Producto();

            System.out.println("Ingrese la descripción del producto 1:");
            producto1.setDescripcion(scanner.nextLine());

            System.out.println("Ingrese el costo del producto 1:");
            producto1.setCosto(Double.parseDouble(scanner.nextLine()));

            System.out.println("Ingrese el impuesto del producto 1 (en decimal:");
            producto1.setImpuesto(Double.parseDouble(scanner.nextLine()));

            System.out.println("Ingrese la descripción del producto 2:");
            producto2.setDescripcion(scanner.nextLine());

            System.out.println("Ingrese el costo del producto 2:");
            producto2.setCosto(Double.parseDouble(scanner.nextLine()));

            System.out.println("Ingrese el impuesto del producto 2 (en decimal:");
            producto2.setImpuesto(Double.parseDouble(scanner.nextLine()));

            PriceCalculator calculator = new PriceCalculator(0.2);
            ProductComparator comparator = new ProductComparator();

            String resultado = comparator.compararProductos(producto1, producto2, calculator);
            System.out.println(resultado);

        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
}

