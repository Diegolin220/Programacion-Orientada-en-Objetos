/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_12_calculadora;

/**
 *
 * @author diegi
 */
public class Potencias {
    public static int Potencias (int x, int z) {

        int resu = 1;

        for (int i = 1; i <= z; i++) {

            resu = resu * x;

        }

        return resu;

    }

}
