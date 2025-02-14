package com.mycompany.eval1_8constructores;

public class Vehiculo {
  private String marca;
    private String modelo;
    private double precio;
    private int year;
    private String color;
   //Contructores - Metodo
    //Metodos; No tinen valor de retorno
    //Modificador de acceso nombre de la clase (Lista de parametros)
    //Constructor DEFAULT: ES UN CONTRUCTOR SIN PARAMETROS
    public Vehiculo(){
        System.out.println("Creando objeto VEHICULO");
        //SE INICIALIZA LOS ATRIBUTOS
        marca = "Sin marca";
        modelo = "Sin modelo";
        color = "Sin color";
        year = 0;
    }
    public Vehiculo(String mar, String mod, int y, double pre, String col){
         marca = mar;
         modelo = mod;
        color = col;
        year = y;
        precio = pre;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String valor){
        marca = valor;
    }
    
    public String getmodelo(){
    return modelo;
}
    public void setmodelo(String valor){
        modelo = valor;
    }
            
    public double getprecio(){
        return precio;
    }
    public void setprecio(double valor){
        precio = valor;
    }
    
    public int getyear(){
        return year;
    }
    public void setyear(int valor){
        year = valor;
    }
    
    public String getcolor(){
        return color;
    }
    public void setcolor(String valor){
        color = valor;
    }
    public void imprimirDatos(){
        System.out.println("Datos del Vehiculo");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + year);
        System.out.println("Color: " + color);
        System.out.println("Precio" + precio);
    }
    
}