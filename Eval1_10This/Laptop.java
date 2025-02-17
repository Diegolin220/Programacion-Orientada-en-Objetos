package com.mycompany.eval1_10_this;

/**
 *
 * @author diegi
 */
public class Laptop {
    private String procesador;
    private int ram;
    private int solid_disk;
    private int pantalla;
    private String marca;
    private String modelo;
    
    public Laptop(){
        this.procesador = "core i5";
        this.ram = 64;
        this.solid_disk = 500;
        this.pantalla = 17;
        this.marca = "Asus";
        this.modelo = "Asus vivobook";
    }
    
    public Laptop(String pro, int R, int Solid, int pant, String marc, String model){
        this.procesador = "macbook";
        this.ram = 34;
        this.solid_disk = 78;
        this.pantalla = 24;
        this.marca = "Aphel";
        this.modelo = "Mac 23";
    }
    
    public void setProcesador(String valor){
        this.procesador = valor;
    
    }
    
    public String getProcesador(){
        return this.procesador;
    }
    
    public void setRam(int valor){
        this.ram = valor;
    
    }
    
    public int getRam(){
        return this.ram;
    }
    
    public void setSolidisk(int valor){
        this.solid_disk = valor;
    
    }
    
    public int getSolidisk(){
        return this.solid_disk;
    }
    
    public void setPanrtalla(int valor){
        this.pantalla = valor;
    
    }
    
    public int getPantalla(){
        return this.pantalla;
    }
    
    public void setMarca(String valor){
        this.marca = valor;
    
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setModelo(String valor){
        this.modelo = valor;
    
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    
}