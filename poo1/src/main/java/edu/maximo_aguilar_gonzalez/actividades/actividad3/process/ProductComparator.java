package edu.maximo_aguilar_gonzalez.actividades.actividad3.process;

import edu.maximo_aguilar_gonzalez.actividades.actividad3.models.Producto;

//ProductComparator permite hacer la comparacion de dos productos para establecer cual es mayor de precio 
public class ProductComparator {

    //Este método recibe lo de dos productos (de los que se habían solicitado) y el objeto de PriceCalculator
    public String compararProductos(Producto producto1, Producto producto2, PriceCalculator calculator) {
        double precio1 = calculator.calcularPrecioVenta(producto1);
        double precio2 = calculator.calcularPrecioVenta(producto2);
        
        //Verifica los precios y se le agrega un resultado con entrada de texto de la realizada comparacion
        if (precio1 > precio2) {
            return "El producto con mayor precio es: " + producto1.getDescripcion();
        } else if (precio2 > precio1) {
            return "El producto con mayor precio es: " + producto2.getDescripcion();
        } else {
            return "Ambos productos cuentan con el mismo precio.";
        }
    }
}
