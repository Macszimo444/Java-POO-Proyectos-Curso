package edu.maximo_aguilar_gonzalez.actividades.actividadesLeetCode;

import java.util.HashSet;

public class Problema2 {
    public static void main(String[] args) {
        String palabra = "abecedario";

        HashSet<Character> vistos = new HashSet<>();
        char duplicado = '\0';

        for(char c: palabra.toCharArray()) {
            if(vistos.contains(c)) {
                duplicado = c;
                break;
            }
            vistos.add(c);
        }

        if(duplicado != '\0'){
            System.out.println("El primer carácter duplicado de esta palabra es: " + duplicado);
        } else {
            System.out.println("No existen duplicados.");
        }
    }
}
