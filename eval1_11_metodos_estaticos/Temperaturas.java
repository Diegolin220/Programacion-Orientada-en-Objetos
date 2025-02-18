/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eval1_11_metodos_estaticos;

/**
 *
 * @author diegi
 */
public class Temperaturas {
    
   public static double convertirFaC(double fa){
       double resu;
       resu = (fa - 32) * (5.0/9.0);
       return resu;
   }
   public static double convertirCaF(double ce){
       double resu;
       resu = (ce * (9.0/5.0))+32;
               return resu;
   }
   public static double convertirFaK(double fa){
       double resu;
       resu=((5.0/9.0)* (fa -32)+273.14);
       return resu;
   }
   public static double convertirKaf(double ka){
    double resu;
    resu =  1.8 *( ka - 273.15) + 32;
    return resu;
} 
   }

