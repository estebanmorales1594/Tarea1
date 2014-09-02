
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
        setCamino(dCamino);
    }
    // Guardan la informacion del nombre del artista 
    public void setArtista(String nArtista){
        this.nombreArtista = nArtista;
     }
    // Guarda la informacion del nombre del album
    public void setAlbum(String nAlbum){
        this.nombreAlbum = nAlbum;
    }
    // Guarda la informacion del nombre de la cancion        
    public void setCancion(String nCancion){
        this.nombreCancion =nCancion;
        
    }
    public String getCancion(){
        return this.nombreCancion;
    }
    public String getArtista(){
        return this.nombreArtista;
    }
    public String getAlbum(){
        return this.nombreAlbum;
    }
   //Guarda la informacion del tiempo 
    public void setTiempo(String tiempo){
        this.Duracion =tiempo;
    }
    public String getTiempo(){
        return this.Duracion;
    }
    public void setGenero(String genero){
        this.Genero =genero;
    }
    public String getGenero(){
        return this.Genero;
    }
    public void setArt(String arteAlbum){
        this.Arte = arteAlbum;
    }
    public String getArte(){
        return this.Arte;
    }
    public void setCamino(String dCamino){
        this.Camino = dCamino;
    }
    public String getCamino(){
        return this.Camino;
    }

}

