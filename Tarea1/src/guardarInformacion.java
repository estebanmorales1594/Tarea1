/*
Guardar Informacion
 */
public class guardarInformacion {
    public String nombreArtista;
    public String nombreAlbum;
    public String nombreCancion;
    public String Genero;
    public String Duracion;
    
    public guardarInformacion ( String nArtista, String nAlbum, String nCancion,String genero,String tiempo){
        setArtista(nArtista);
        setCancion(nCancion);
        setAlbum(nAlbum);
        setTiempo(tiempo);
        setGenero(genero);
        setCancion(nCancion);
    }
    
    public void setArtista(String nArtista){
        nombreArtista = nArtista;
     }
    
    public void setAlbum(String nAlbum){
        nombreAlbum = nAlbum;
    }
            
    public void setCancion(String nCancion){
        nombreCancion =nCancion;
        
    }
    public String setCancion(){
        return nombreCancion;
    }
    public String setArtista(){
        return nombreArtista;
    }
    public String setAlbum(){
        return nombreAlbum;
    }
    
    public void setTiempo(String tiempo){
        Duracion =tiempo;
    }
    public String setTiempo(){
        return Duracion;
    }
    public void setGenero(String genero){
        Genero =genero;
    }
    public String setGenero(){
        return Genero;
    }

}

