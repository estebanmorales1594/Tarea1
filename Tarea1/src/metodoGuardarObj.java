
import java.util.ArrayList;

/*
Aqui empieza el codigo
 */
// Objeto que se encarga de guardar los objetos canciones en una lista enlazada
public class metodoGuardarObj {
    
    static ArrayList<guardarInformacion> listaCanciones = new ArrayList();
    static ArrayList<String> listaBusqueda= new ArrayList();
    static ArrayList<String> listaOrdenar= new ArrayList();
    
    static guardarInformacion cancion; 
    static int x;
  
    
   
    
    //metodo que ingresa las canciones en un array
    public static void metodoGuardarObj(String Autor,String Album,String Cancion,String Genero,String duracion){
      
           cancion = new guardarInformacion( Autor , Album ,Cancion,Genero,duracion);
           listaCanciones.add(cancion);
       
       
    }
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
    //Metodo de busqueda secuencial usando dos indices
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
    
  //Prueba de los metodos.
    public static void main (String[] args){
        metodoGuardarObj("Jim Carrey","Los D","Dos de Queso","Blues","2:30");
        metodoGuardarObj("Jim Carrey","Los D","Blues","Blues","2:30");
        mostrarCancion("Dos de Queso");
        mostrarBusqueda("Jim Carrey");
    }
}

    
    
    

