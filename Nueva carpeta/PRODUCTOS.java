package VENTAS;

public class PRODUCTOS {
 private String nombre;
 private String marca;
 private double precio;
 private int clave;
 private int inventario;

public String getnombre(){
    return nombre;
} 
public void setnombre(String Valor){
    nombre = Valor;
}
public String getmarca(){
    return marca;
}
public void setmarca(String Valor){
}
public double getprecio(){
    return precio;
}
public void setprecio(double Valor){
    precio = Valor;
}
public int getclave(){
    return clave;
}
public void setclave(int Valor){
    clave = Valor;
}
public int getinventario(){
    return inventario;
}
public void setinventario(int Valor){
    inventario = Valor;
}
public void imprimirDatos(){
    System.out.println("Marca: " + marca + "Nombre del producto: " + nombre + "Cual es el precios? " + precio + "Cuantos paquetes hay? " + inventario + "clave" + clave);
}
}
