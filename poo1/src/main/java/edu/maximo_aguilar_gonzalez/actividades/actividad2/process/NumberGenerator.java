package edu.maximo_aguilar_gonzalez.actividades.actividad2.process;

public class NumberGenerator {

    public static void generateAndPrintEvenNumbers() {
        int[] evenNumbers = new int[50];
        int index = 0;

        for (int i = 2; i <= 100; i += 2) {
            evenNumbers[index++] = i;
        }

        System.out.println("Números pares que van del 2 hacia el 100: ");
        for (int number : evenNumbers) {
            System.out.println(number);
        }
    }

}

