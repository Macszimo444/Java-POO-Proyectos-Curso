package edu.maximo_aguilar_gonzalez.actividades.actividad1.process;

import java.util.ArrayList;
import java.util.List;

import edu.maximo_aguilar_gonzalez.actividades.actividad1.models.Car;


public class StockManager {

    ArrayList<Car> stock;

    public StockManager() { this.stock = new ArrayList<>(); }

    /**
     * Este metodo se encarga de añadir un coche
     * al catalogo de la aplicacion
     * @param modelo el año del auto
     * @param marca empresa
     * @param numPuertas
     * @param color del que se ingrese
     */

    public void addCar(String modelo, String marca, int numPuertas, String color){
        Car car = new Car(modelo,marca,numPuertas,color);
        stock.add(car);

    }

    /**
     * @return que devuelve una lista con todo el catalogo en memoria
     */

    public List<Car> getStock(){
        return this.stock;
    }
}

