
import java.util.ArrayList;

/*
Guardar Informacion
 */
public class guardarInformacion {
    public String nombreArtista;
    public String nombreAlbum;
    public String nombreCancion;
    public String Genero;
    public String Duracion;
    ArrayList<String> informacionCancion = new ArrayList();
    public guardarInformacion ( String nArtista, String nAlbum, String nCancion,String genero,String tiempo){
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
    public String setCancion(){
        return nombreCancion;
    }
    public String setArtista(){
        return nombreArtista;
    }
    public String setAlbum(){
        return nombreAlbum;
    }
   //Guarda la informacion del tiempo 
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
    public void almacenarDatos(){
        informacionCancion.add(nombreArtista);
        informacionCancion.add(nombreAlbum);
        informacionCancion.add(Genero);
        informacionCancion.add(Duracion);
        
              
        
    }

}
