package com.mycompany.eval1_5television;

public class Eval1_5Television {

    public static void main(String[] args) {
    Television tv = new Television();
    tv.imprimirDatos();
    tv.encenderApagar(); //Boton de encendido del control
    tv.imprimirDatos();
    tv.bajarVolumen();
    tv.imprimirDatos();
    //tv.subirCanal();
    //tv.imprimirDatos();
    tv.setCanal(2);
    tv.imprimirDatos();
    }
}
