import com.mpatric.mp3agic.ID3v1;
import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;

/**
 * Aqui se va a extraer la informacion de la cancion, como el nombre,
 * artista, genero, duracion, ubicacion en la computadora
 * Al igual permite al usuario manipular esta informacion una vez que fue 
 * guardada en la lista, por medio de guardarInfomacion.java
 * 
 */

public class metodoGuardarObj {
    
     ArrayList<guardarInformacion> listaCanciones = new ArrayList();
     ArrayList<String> listaBusqueda= new ArrayList();
     
    
     guardarInformacion cancion; 
     int x;
     int y;
     String camino;
    
    public metodoGuardarObj() throws IOException, UnsupportedTagException, InvalidDataException{
        

    }
    
  
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Metodo que va a agregar las canciones, cuando el usuario asi lo desee,
     * despues de haber recibido la direccion de la ubicacion y manipulandola
     * para encontrar su respectiva informacion, para luego guardarla en la 
     * lista
     * 
     */
    public void agregarCancion(String camino) throws IOException, UnsupportedTagException, InvalidDataException{
        Mp3File mp3file = new Mp3File(camino);   
        ID3v1 id3v1Tag = mp3file.getId3v1Tag();
        String Autor = id3v1Tag.getArtist()+"";
        String Album = id3v1Tag.getAlbum()+"";
        String Cancion = id3v1Tag.getTitle()+"";
        String Genero = id3v1Tag.getGenreDescription()+"";
        long Duracion = mp3file.getLengthInSeconds();
        String Arte = "";
        String path = camino;
        
        cancion = new guardarInformacion( Autor , Album ,Cancion,Genero,Duracion+"",Arte,path+"");
        listaCanciones.add(cancion);   
       
    }
    /**
     * Despues de guardada la informacion el usuario va a poder
     * verificar dicha informacion por medio del este metodo,
     * solo ocupa tener los indices en los que se dentro de la lista
     */  
    public String mostrarCancion(int x,int y){     
        if (y ==1){
             return listaCanciones.get(x).getCancion();
        }
        if (y==2){
            return listaCanciones.get(x).getArtista();
        }
        if (y == 3){
           return listaCanciones.get(x).getAlbum();
        }
        if (y==4){
             return listaCanciones.get(x).getGenero();
        }
        if(y==5){
            return listaCanciones.get(x).getTiempo();
        }
        return  "";
    }
    
    /**
     * Por medio de este metodo el usuario, puede buscar sobre una cancion
     * con solo ingresar el nombre del artista
     *
     */
    public  Object buscarArtista(String elemento){ 
        
        for (int i=0; i< listaCanciones.size();i++){
            
            if (listaCanciones.get(x).getArtista().equals(elemento)){
               
               listaBusqueda.add(listaCanciones.get(x).getCancion());
               listaBusqueda.add(listaCanciones.get(x).getArtista());
               listaBusqueda.add(listaCanciones.get(x).getAlbum());
               listaBusqueda.add(listaCanciones.get(x).getGenero());
               listaBusqueda.add(listaCanciones.get(x).getTiempo());
            }
            x++;       
        } 
        System.out.println(listaBusqueda);
        return (listaBusqueda); 
        
    }
    
    /**
     * Por medio de este metodo el usuario, puede buscar sobre una cancion
     * con solo ingresar el nombre del Album
     *
     */
    public  Object buscarAlbum(String elemento){
        
        for (int i=0; i< listaCanciones.size();i++){
            int y = listaCanciones.size()-1;
            if (listaCanciones.get(x).getAlbum().equals(elemento)){
               
               listaBusqueda.add(listaCanciones.get(x).getCancion());
               listaBusqueda.add(listaCanciones.get(x).getArtista());
               listaBusqueda.add(listaCanciones.get(x).getAlbum());
               listaBusqueda.add(listaCanciones.get(x).getGenero());
               listaBusqueda.add(listaCanciones.get(x).getTiempo());
            }
            x++;    
            
        } 
        System.out.println(listaBusqueda);
        return (listaBusqueda); 
        
    }
    /**
     * Por medio de este metodo el usuario, puede buscar sobre una cancion
     * con solo ingresar el genero de una cancion
     *
     */
     public  Object buscarGenero(String elemento){
        
        for (int i=0; i< listaCanciones.size();i++){

            if (listaCanciones.get(x).getGenero().equals(elemento)){
               
               listaBusqueda.add(listaCanciones.get(x).getCancion());
               
            }
            x++;       
        } 
        System.out.println(listaBusqueda);
        return (listaBusqueda); 
        
    }
     
    /**
     * Por medio de este metodo el usuario, puede buscar sobre una cancion
     * con solo ingresar el nombre de la cancion
     *
     */
    public Object buscarCancion(String elemento){
        
        
        for (int i=0; i< listaCanciones.size();i++){
       
            if (listaCanciones.get(i).getCancion().equals(elemento)){
               
               listaBusqueda.add(listaCanciones.get(x).getCancion());
               listaBusqueda.add(listaCanciones.get(x).getArtista());
               listaBusqueda.add(listaCanciones.get(x).getAlbum());
               listaBusqueda.add(listaCanciones.get(x).getGenero());
               listaBusqueda.add(listaCanciones.get(x).getTiempo());
            }
            x++;       
        } 
        System.out.println(listaBusqueda);
        return (listaBusqueda); 

    }
    /**
     * Por medio de este metodo el usuario, puede modificar la
     * informacion de una cancion
     *
     */
    public void modificarCancion(String cancion,String Artista, String Album, String Genero){
        for (int i = 0; i < listaCanciones.size();i++){
            if(cancion.equals(listaCanciones.get(i).getCancion())){
                listaCanciones.get(i).setAlbum(Album);
                listaCanciones.get(i).setArtista(Artista);
                listaCanciones.get(i).setGenero(Genero);   
            }
        }
    } 
    
    /**
     * Por medio de este metodo se puede eliminar una cancion,
     * con solo tener el indice en el que se encuentra dentro de 
     * la lista
     *
     */
    public void eliminarCancion(int x){
                listaCanciones.remove(x);
            }
        
        
        
    
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  //Prueba de los metodos.
    // Aqui comienza el main.///////////////////////////////////////////////////////////////////////////////////////
    //No es parte del codig.//

    
    

   /* public static void main (String[] args) throws IOException, UnsupportedTagException, InvalidDataException{

        JFileChooser fileChooser = new JFileChooser(".");
        int status = fileChooser.showOpenDialog (null);
        if (status == JFileChooser.APPROVE_OPTION){
            File selectedFile = fileChooser.getSelectedFile();
            camino = selectedFile.getAbsolutePath();
        }
        else{ 
            if (status == JFileChooser.CANCEL_OPTION){
                System.out.println("CANCELAR");
            }
       
        }
        agregarCancion(camino);
        System.out.println(listaCanciones.get(0).getCancion());
        System.out.println(listaCanciones.get(0).getArtista());
        mostrarCancion("With You/With Me");
        buscarCancion("With You/With Me");
        
    }*/
}
       
        

    
    
    
