package edu.maximo_aguilar_gonzalez.actividades.actividadesLeetCode;

public class Problema1 {
    public static void main(String[] args) {
        String mensaje = "Hola mundo";
        System.out.println(mensaje);
        String mensajeInvertido = "";
        for(int i = mensaje.length() - 1; i >= 0; i--) {
            mensajeInvertido += mensaje.charAt(i);
        }

        System.out.println("Hola mundo invertido: " + mensajeInvertido);
    }
}
    
