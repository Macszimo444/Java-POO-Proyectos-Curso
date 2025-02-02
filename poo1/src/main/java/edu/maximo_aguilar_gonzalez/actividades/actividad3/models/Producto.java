package edu.maximo_aguilar_gonzalez.actividades.actividad3.models;

//Asignar los siguiente atributos solicitados 
//(lo piden en privado pero fue convertido a publico para poderse usar en demás archivos)
public class Producto {
    public String descripcion;
    public String codigo;
    public String tipo;
    public double costo;
    public double impuesto;

    //Getters

    public String getDescripcion() { return descripcion; }
    public String getCodigo() { return codigo; }
    public String getTipo() { return tipo; }
    public double getCosto() { return costo; }
    public double getImpuesto() { return impuesto; }

    //Setters

    public void setDescripcion(String descripcion) {this.descripcion = descripcion; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setCosto(double costo) { this.costo = costo; }
    public void setImpuesto(double impuesto) { this.impuesto = impuesto; }
    
    //método de mostrarProducto
    public String mostrarProducto() {
        return "Descripción: " + descripcion + "\n" +
                "Código: " + codigo + "\n" +
                "Tipo: " + tipo + "\n" +
                "Costo " + costo + "\n" +
                "Impuesto: " + impuesto;
    }
}
