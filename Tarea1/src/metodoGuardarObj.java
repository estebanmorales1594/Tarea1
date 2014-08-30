
import com.mpatric.mp3agic.ID3v1;
import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;
import java.io.IOException;
import java.util.ArrayList;
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
    static String camino;
  
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //metodo que ingresa las canciones en un array
    public static void agregarCancion(String camino) throws IOException, UnsupportedTagException, InvalidDataException{
        Mp3File mp3file = new Mp3File(camino);   
        ID3v1 id3v1Tag = mp3file.getId3v1Tag();
        String Autor = id3v1Tag.getArtist();
        String Album = id3v1Tag.getAlbum();
        String Cancion = id3v1Tag.getTitle();
        String Genero = id3v1Tag.getGenreDescription();
        long Duracion = mp3file.getLengthInSeconds();
        
        cancion = new guardarInformacion( Autor , Album ,Cancion,Genero,Duracion+"");
        listaCanciones.add(cancion);
       
       
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //muestra la informacion deseada  
    public  static void mostrarCancion(String nombreCancion){      
        for(int i = 0; i< listaCanciones.size(); i++){
            if (listaCanciones.get(i).getCancion()== nombreCancion){
               
                System.out.println(listaCanciones.get(i).getAlbum()); 
                System.out.println(listaCanciones.get(i).getArtista()); 
                System.out.println(listaCanciones.get(i).getTiempo()+"Min"); 
                System.out.println(listaCanciones.get(i).getGenero()); 
            }
            
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Metodo de busqueda secuencial usando un indice
    public static Object mostrarBusqueda(String elemento){
        
        
        for (int i=0; i< listaCanciones.size();i++){
            

            if (listaCanciones.get(x).getArtista() == elemento){
               
               listaBusqueda.add(listaCanciones.get(x).getCancion());
            }
            x++;       
        } 
        System.out.println(listaBusqueda);
        return (listaBusqueda); 
        
    }
    public void modificarCancion(String cancion,String Artista, String Album, String Genero){
        for (int i = 0; i < listaCanciones.size();i++){
            if(cancion == listaCanciones.get(i).getCancion()){
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
    public static void main (String[] args) throws IOException, UnsupportedTagException, InvalidDataException{
        agregarCancion("C:\\Users\\Jimmy\\Downloads\\ow9nwithywithme\\01. With You-With Me.mp3");
        System.out.println(listaCanciones.get(0).getCancion());
        
  
     
    }
}

    
    
    

