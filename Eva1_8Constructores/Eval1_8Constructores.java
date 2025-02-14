/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eval1_8constructores;

/**
 *
 * @author diegi
 */
public class Eval1_8Constructores {
    public static void main(String[] args) {
        //Clase objeto = new Constructor (parametros);
        Vehiculo carro = new Vehiculo("Ford", "Munstang", 1970, 100000, "Rojo");
        carro.imprimirDatos();
        
        Vehiculo otroCarro = new Vehiculo();
                otroCarro.imprimirDatos();
    }
}
