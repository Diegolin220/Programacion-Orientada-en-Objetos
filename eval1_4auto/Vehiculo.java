package com.mycompany.eval1_4auto;

public class Vehiculo {
    
    //Atrivutos - Privado
    private String marca;
    private String modelo;
    private double precio;
    private int year;
    private String color;
    //Constructores - metofo
    //metodo y comportamiento
    //get y set
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
