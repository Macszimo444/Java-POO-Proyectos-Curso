package edu.maximo_aguilar_gonzalez.actividades.actividad3.process;

import edu.maximo_aguilar_gonzalez.actividades.actividad3.models.Producto;

//PriceCalculator se encarga de calcular el precio de venta de un producto y que este se basa en el costo que tiene
public class PriceCalculator {
    //porcentaje de ganancia
    public double utilidad;

    //Constructor 
    public PriceCalculator(double utilidad) {
        this.utilidad = utilidad;
    }

    //precio total de producto
    public double calcularPrecioVenta(Producto producto) {
        //Precio antes de impuesto
        double precioAntesImpuestos = producto.getCosto() + (producto.getCosto() * utilidad);
        //Precio total que se toma junto con el de impuestos
        double precioTotal = precioAntesImpuestos + (precioAntesImpuestos * producto.getImpuesto());
        return precioTotal;  //venta final que se regrese
    }
}
