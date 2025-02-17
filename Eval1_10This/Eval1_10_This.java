/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval1_10_this;

/**
 *
 * @author diegi
 */
public class Eval1_10_This {

    public static void main(String[] args) {
   Persona perso = new Persona("Alexis", "Aldaba", 18);
        Laptop lap = new Laptop("core i5", 64, 500, 17, "Asus", "Asus vivobook");
        
      perso.setNombre("Diego");
      perso.setApellido("Salas");
      perso.setEdad(20);
      
        System.out.println("Nombre: " + perso.getNombre());
        System.out.println("Apellido: " + perso.getApellido());
        System.out.println("Edad: " + perso.getEdad());
        
     lap.setProcesador("Macbook");
     lap.setRam(34);
     lap.setSolidisk(78);
     lap.setPanrtalla(24);
     lap.setModelo("Aphel");
     lap.setModelo("Mac 23");
     
         System.out.println("Procesador: " + lap.getProcesador());
         System.out.println("Ram: " + lap.getRam());
         System.out.println("Disco Solido: " + lap.getSolidisk());
         System.out.println("Pantalla: " + lap.getPantalla());
         System.out.println("Marca: " + lap.getMarca());
         System.out.println("Modelo: " + lap.getModelo());
     
    }
}