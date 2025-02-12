package com.mycompany.eva1_6_apa;

import Fichas_APA.Sitio_Web;
import Fichas_APA.fichas_APA;

public class EVA1_6_APA {

    public static void main(String[] args) {
        fichas_APA fichas = new fichas_APA();
        fichas.setAutor("Diego Salas");
        fichas.setCiudad("CDMX");
        fichas.setpag(20);
        fichas.setEditorial("LibrosAmigos");
        fichas.setYear(2025);
        fichas.setTitulo("Los tres mosqueteros");
        fichas.imprimirDatos();
      
        Sitio_Web web = new Sitio_Web();
        web.setNombrepaguina("Facebook");
        web.setAutores("Zuckerberg M.");
        web.setNombresitio("Facebook");
        web.setDia(04);
        web.setMes("Febrero");
        web.setYear(2004);
        web.setURL("https://www.facebook.com");
        web.imprimirdatos();
}

}