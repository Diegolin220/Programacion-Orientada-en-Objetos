
package VENTAS;

public class CLIENTE {
    private String Nombre;
    private String Apellido;
    private String RFC;
    private int Edad;
    private double Telefono;
    private String Moral;
    
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String Valor){
        Nombre = Valor;
    }
    public String getApellido(){
        return Apellido;
    }
    public void setApellido(String Valor){
        Apellido = Valor;
    }
    public String getRFC(){
        return RFC;
    }
    public void setRFC(String Valor){
        RFC = Valor;
    }
    public int getEdad(){
        return Edad;
    }
    public void setEdad(int Valor){
        Edad = Valor;
    }
    public String getMoral(){
        return Moral;
    }
    public void setMoral(String Valor){
        Moral = Valor;
    }
    public double getTelefono(){
        return Telefono;
    }
    public void setTelefono(double Valor){
        Telefono=Valor;
    }
    public void imprimirDatos(){
        System.out.println(" Nombre " + Nombre + " Apellido " + Apellido + " RFC " + RFC + " Persona fisica o moral? " + Moral + " Edad y numero Telefonico " + Edad + Telefono);
    }
    
}