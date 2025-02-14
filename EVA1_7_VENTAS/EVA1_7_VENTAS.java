/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_7_ventas;

import VENTAS.CLIENTE;
import VENTAS.PRODUCTOS;

/**
 *
 * @author diegi
 */
public class EVA1_7_VENTAS {

    public static void main(String[] args) {
        CLIENTE cliente = new CLIENTE();
        cliente.setNombre("Diego Alejandro");
        cliente.setApellido("Salas Lopez de Lara");
        cliente.setEdad(19);
        cliente.setRFC("EXT990101NI1");
        cliente.setMoral("Es moral");
        cliente.setTelefono(614363174);
        cliente.imprimirDatos();
        
        PRODUCTOS producto = new PRODUCTOS();
        producto.setmarca("Coca-Cola");
        producto.setnombre("Fresca");
        producto.setprecio(16);
        producto.setinventario(24);
        producto.setclave(341246738);
        producto.imprimirDatos();
    }
}
