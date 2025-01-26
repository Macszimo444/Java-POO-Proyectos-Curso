package edu.maximo_aguilar_gonzalez.actividades.actividad2;

import edu.maximo_aguilar_gonzalez.actividades.actividad2.process.NumberGenerator;
import edu.maximo_aguilar_gonzalez.actividades.actividad2.ui.CLI;


public class Starter {
    public static void main(String[] args) { 
        CLI.runApp();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        
        NumberGenerator.generateAndPrintEvenNumbers();
    }
}
