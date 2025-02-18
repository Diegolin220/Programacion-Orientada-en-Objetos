/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval1_11_metodos_estaticos;

/**
 *
 * @author diegi
 */
public class Eval1_11_METODOS_ESTATICOS {

    public static void main(String[] args) {
        //Math es una clase que se proporciona funciones matematicas
   double valorAleatorio = Math.random();
   int valor = (int)(Math.random() * 100);
        System.out.println(valor);
        System.out.println(valorAleatorio);
        
       // Math math= new Math();
        Persona perso = new Persona();
        perso.mostrarMensaje();
        //USAR FORMULAS DE TEMPERATURA
       // Temperaturas tempe = new Temperaturas();
        //System.out.println(tempe.convertirFaC(100));
        System.out.println(Temperaturas.convertirFaC(100));
        System.out.println(Temperaturas.convertirCaF(100));
        System.out.println(Temperaturas.convertirFaK(100) );
        System.out.println(Temperaturas.convertirKaf(100));
    }
}

class Persona{
    int valor; 
    public void mostrarMensaje(){
        System.out.println("Hola mundo!");
    }
}
