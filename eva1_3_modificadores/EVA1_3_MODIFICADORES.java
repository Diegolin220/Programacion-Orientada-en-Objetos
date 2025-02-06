package com.mycompany.eva1_3_modificadores;
public class EVA1_3_MODIFICADORES {

    public static void main(String[] args) {
     //instanciar un ejemplo
     //clase identificador = new contructor (parametros)
      Persona perso = new Persona();
       perso.setNombre("Diego Alejandro");
        System.out.println("Nombre: " + perso.getNombre());
        
        perso.setApellidos("Salas Lopez de Lara");
        System.out.println("Apellido: " + perso.getApellidos());
        
        perso.setEdad(18);
        System.out.println("Edad: " + perso.getEdad());
        
        perso.setGenero("Hombre");
        System.out.println("Genero: " + perso.getGenero());
        
        perso.setCurp("LPGA5");
        System.out.println("Curp: " + perso.getCurp());
    }
}
