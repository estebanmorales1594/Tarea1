package reproductormusica;

import com.mpatric.mp3agic.ID3v1;
import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
Aqui empieza el codigo
 */
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Objeto que se encarga de guardar los objetos canciones en una lista enlazada
public class metodoGuardarObj {
    
    static ArrayList<guardarInformacion> listaCanciones = new ArrayList();
    static ArrayList<String> listaBusqueda= new ArrayList();
    static ArrayList<String> listaOrdenar= new ArrayList();
    
    static guardarInformacion cancion; 
    static int x;
    static int y;
    static String camino;
    
    String Autor;
    String Album;
    String Cancion;
    String Genero;
  
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //metodo que ingresa las canciones en un array

    /**
     *
     * @param camino
     * @return
     * @throws IOException
     * @throws UnsupportedTagException
     * @throws InvalidDataException
     */
        public void agregarCancion(String camino) throws IOException, UnsupportedTagException, InvalidDataException{
        Mp3File mp3file = new Mp3File(camino);   
        ID3v1 id3v1Tag = mp3file.getId3v1Tag();
        this.Autor = id3v1Tag.getArtist()+"";
        this.Album = id3v1Tag.getAlbum()+"";
        this.Cancion = id3v1Tag.getTitle()+"";
        this.Genero = id3v1Tag.getGenreDescription()+"";
        long Duracion = mp3file.getLengthInSeconds();
        String Arte = "";
        
        System.out.println(Autor);
        System.out.println(Cancion);
        System.out.println(Album);
        System.out.println(Genero);
        
        cancion = new guardarInformacion( Autor , Album ,Cancion,Genero,Duracion+"",Arte);
        listaCanciones.add(cancion);   
       
    }
    
    public String getCancion(){
        return Cancion;
    }
    
    public String getArtista(){
        return Autor;
    }
    
    public String getAlbum(){
        return Album;
    }
    
    public String getGenero(){
        return Genero;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //muestra la informacion deseada  
    public  static void mostrarCancion(String nombreCancion){      
        for(int i = 0; i< listaCanciones.size(); i++){
            if (listaCanciones.get(i).getCancion().equals(nombreCancion)){
               
                System.out.println(listaCanciones.get(i).getAlbum()); 
                System.out.println(listaCanciones.get(i).getArtista()); 
                System.out.println(listaCanciones.get(i).getTiempo()+"Min"); 
                System.out.println(listaCanciones.get(i).getGenero()); 
            }
            
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Metodo de busqueda secuencial usando un indice
    public static Object buscarArtista(String elemento){ 
        
        for (int i=0; i< listaCanciones.size();i++){
            
            if (listaCanciones.get(x).getArtista().equals(elemento)){
               
               listaBusqueda.add(listaCanciones.get(x).getCancion());
            }
            x++;       
        } 
        System.out.println(listaBusqueda);
        return (listaBusqueda); 
        
    }
    
    public static Object buscarAlbum(String elemento){
        
        for (int i=0; i< listaCanciones.size();i++){
            int y = listaCanciones.size()-1;
            if (listaCanciones.get(x).getAlbum().equals(elemento) || listaCanciones.get(y).getAlbum().equals(elemento) ){
               
               listaBusqueda.add(listaCanciones.get(x).getCancion());
            }
            x++;    
            y--;
        } 
        System.out.println(listaBusqueda);
        return (listaBusqueda); 
        
    }
    
     public static Object buscarGenero(String elemento){
        
        for (int i=0; i< listaCanciones.size();i++){

            if (listaCanciones.get(x).getGenero().equals(elemento)){
               
               listaBusqueda.add(listaCanciones.get(x).getCancion());
            }
            x++;       
        } 
        System.out.println(listaBusqueda);
        return (listaBusqueda); 
        
    }
     
      public static Object buscarCancion(String elemento){
        
        
        for (int i=0; i< listaCanciones.size();i++){
       
            if (listaCanciones.get(i).getCancion().equals(elemento)){
               System.out.println("True");
               listaBusqueda.add(listaCanciones.get(i).getCancion());
            }
            x++;       
        } 
        System.out.println(listaBusqueda);
        return (listaBusqueda); 

    }
    ///////////////////////////////////////////////////////////////////////////
      //Modifica la cancion
    public void modificarCancion(String cancion,String Artista, String Album, String Genero){
        for (int i = 0; i < listaCanciones.size();i++){
            if(cancion.equals(listaCanciones.get(i).getCancion())){
                listaCanciones.get(i).setAlbum(Album);
                listaCanciones.get(i).setArtista(Artista);
                listaCanciones.get(i).setGenero(Genero);
                
            }
        }
    } 
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void eliminarCancion(){
        
    }
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  //Prueba de los metodos.
    // Aqui comienza el main.///////////////////////////////////////////////////////////////////////////////////////
    //No es parte del codig.//
     
    }

    
    
    
