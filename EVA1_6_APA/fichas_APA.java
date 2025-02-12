package Fichas_APA;



public class fichas_APA {
    private String Autor;
    private String Titulo;                                                                                                  
    private int Year;
    private int pag;
    private String Ciudad;
    private String Editorial;
    
    public int getpag(){
        return pag;
    }
    public void setpag(int Valor){
        pag = Valor;
    }
    public String getAutor(){
        return Autor;
    }
    public void setAutor(String Valor){
        Autor=Valor;
    }
    
    public String getTitulo(){
        return Titulo;
    }
    public void setTitulo(String Valor){
        Titulo=Valor;
    }
    
    public int getYear(){
        return Year;
    }
    
    public void setYear (int Valor){
        Year=Valor;
    }
    public String getCiudad(){
        return Ciudad;
    }
    
    public void setCiudad (String Valor){
        Ciudad = Valor;
    }
    
    public String getEditorial(){
        return Editorial;
    }
    public void setEditorial(String Valor){
        Editorial = Valor;
    }
     public void imprimirDatos(){
        System.out.println( Autor + " (" + Year + "). " + Titulo + ". " + Autor + ", " + Titulo +". " + pag + " Pag. " + Ciudad + ", " + Editorial + ". ");
       
    }
}
    