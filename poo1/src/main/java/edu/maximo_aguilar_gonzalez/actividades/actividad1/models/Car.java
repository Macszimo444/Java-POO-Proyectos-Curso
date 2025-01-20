package edu.maximo_aguilar_gonzalez.actividades.actividad1.models;

public class Car {
    private String modelo;
    private String marca;
    private int numPuertas;
    private String color;

    /**
     * Hace los atributos de una manera legible
     */

    @Override
    public String toString() {
        return "Car{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", numPuertas=" + numPuertas +
                ", color='" + color + '\'' +
                '}';
    }

    /**
     * Permite el uso y arranque de objeto Car con los valores que se recibirán
     * @param modelo, modelo del coche que ingrese el usuario
     * @param marca, marca del coche que ingrese el usuario
     * @param numPuertas, numPuertas que ingrese el usuario
     * @param color, color que ingrese el usuario
     */

    public Car(String modelo, String marca, int numPuertas, String color) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        setNumPuertas(numPuertas);
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    /**
     * Setter
     * @param numPuertas solo se aceptan valores de 2 a 5 del coche, si no es válido lanza una excepción
     * @throws IllegalArgumentException esta es la que se cuenta como la excepción
     */

    public void setNumPuertas(int numPuertas) {
        if (numPuertas < 2 || numPuertas > 5) {
            throw new IllegalArgumentException("Numero de puertas valido esta entre 2 y 5");
        }

        this.numPuertas = numPuertas;
    }

    /**
     * Getter
     * @return modelo del coche
     */

    public String getModelo() {
        return modelo;
    }

    /**
     * Setter de string de modelo del coche
     * @param modelo del coche
     */

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Getter
     * @return marca del coche
     */

    public String getMarca() {
        return marca;
    }

    /**
     * Setter de string de marca del coche
     * @param marca del coche
     */

    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Getter
     * @return el color del coche
     */

    public String getColor() {
        return color;
    }

    /**
     * Setter de string del coche
     * @param color del coche
     */

    public void setColor(String color) {
        this.color = color;
    }
}


