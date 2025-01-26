package edu.maximo_aguilar_gonzalez.actividades.actividad2.ui;

import java.util.Scanner;

import edu.maximo_aguilar_gonzalez.actividades.actividad2.process.NameValidator;

public class CLI {

    public static void runApp() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre, de favor: ");
        String userName = scanner.nextLine();

        if (NameValidator.isNameValid(userName)) {
            System.out.println("Hola " + userName + " , Tu nombre está aquí registrado.");
        }else{
            System.out.println("Mala suerte, " + userName + ". Tu nombre no está registrado.");
        }

        scanner.close();
    }
}
