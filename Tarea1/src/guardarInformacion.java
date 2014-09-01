
/*
Guardar Informacion de la cancion
 */
public class guardarInformacion {
    public String nombreArtista;
    public String nombreAlbum;
    public String nombreCancion;
    public String Genero;
    public String Duracion;
    public String Arte;
    public String Camino;
   
    public guardarInformacion ( String nArtista, String nAlbum, String nCancion,String genero,String tiempo,String arteAlbum,String dCamino){
        setArtista(nArtista);
        setCancion(nCancion);
        setAlbum(nAlbum);
        setTiempo(tiempo);
        setGenero(genero);
        setCancion(nCancion);
    }
    // Guardan la informacion del nombre del artista 
    public void setArtista(String nArtista){
        nombreArtista = nArtista;
     }
    // Guarda la informacion del nombre del album
    public void setAlbum(String nAlbum){
        nombreAlbum = nAlbum;
    }
    // Guarda la informacion del nombre de la cancion        
    public void setCancion(String nCancion){
        nombreCancion =nCancion;
        
    }
    public String getCancion(){
        return nombreCancion;
    }
    public String getArtista(){
        return nombreArtista;
    }
    public String getAlbum(){
        return nombreAlbum;
    }
   //Guarda la informacion del tiempo 
    public void setTiempo(String tiempo){
        Duracion =tiempo;
    }
    public String getTiempo(){
        return Duracion;
    }
    public void setGenero(String genero){
        Genero =genero;
    }
    public String getGenero(){
        return Genero;
    }
    public void setArt(String arteAlbum){
        Arte = arteAlbum;
    }
    public String getArte(){
        return Arte;
    }
    public void setCamino(String dCamino){
        Camino = dCamino;
    }
    public String getCamino(){
        return Camino;
    }

}

