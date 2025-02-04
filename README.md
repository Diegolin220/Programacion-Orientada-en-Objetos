package com.mycompany.eva1clasesdeobjetos;
public class Eva1clasesdeobjetos {
public static void main(String[] args) {
//CREAR UN OBJETO
//INSTANCIAR
//Identificador para guardar la dirección en memoria
//variable de un tipo de dato abstracto
Persona persol;//declaramos una variable de tipo per
//asignamos memoria


    // Instanciación de la clase Persona (creación de un objeto)
    persol = new Persona();//creamos un objeto de tipo r

    // Asignación de valores a los atributos del objeto
    persol.nombre = "Juan Perez";
    persol.edad = 10;
    persol.genero = "H";

    // Llamada al método imprimirDatos() del objeto
    persol.imprimirDatos();
}
}class Persona{
//DATOS - ESTADO - ATRIBUTOS
String nombre;
int edad;
String genero;
//COMPORTAMIENTO
void imprimirDatos() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);
    System.out.println("Género: " + genero);
  }
}
