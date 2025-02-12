package Fichas_APA;


public class Sitio_Web {
    private String Autores;
    private String NombrePaguina;
    private String Nombresitio;
    private int Year;
    private String Mes;
    private int Dia;
    private String URL;
    
    public String getAutores(){
        return Autores;
    }
    public void setAutores(String Valor){
        Autores = Valor;
    }
    
    public String getNombrePaguina(){
             return NombrePaguina;
    }
    public void setNombrepaguina(String Valor){
        NombrePaguina = Valor;
    }
    
    public String getNombresitio(){
        return Nombresitio;
    }
    public void setNombresitio(String Valor){
        Nombresitio = Valor;
    }
    public int getYear(){
        return Year;
    }
    public void setYear(int Valor){
        Year = Valor;
    }
    public String getMes(){
        return Mes;
    }
    public void setMes (String Valor){
        Mes = Valor;
    }
    public int getDia(){
        return Dia;
    }
    public void setDia(int Valor){
        Dia = Valor;
    }
    public String getURL(){
        return URL;
    }
    public void setURL(String Valor){
        URL = Valor;
    }
    public void imprimirdatos(){
        System.out.println(Autores + "/" + NombrePaguina + "/" + Nombresitio + "("+ Dia + " de " + Mes + " del " + Year+ ")" + URL);
    }
}