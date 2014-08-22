
import java.util.ArrayList;

/*
 Arreglos
 */
public class metodoGuardarObj {
    
    ArrayList<Object> listaCanciones = new ArrayList();
    public metodoGuardarObj(){
        
    }
    
    public void agregarObjeto(Object x){
        listaCanciones.add(x);
    }
    public void mostrarObjetos(){
        for (int i=0;i<listaCanciones.size();i++){
            System.out.println("La posicion del elemento"+i+"es"+listaCanciones.get(i));
        }
    }
    public int maxSize(){
        int maxSize;
         maxSize = listaCanciones.size();
         return (maxSize);
         
    }
   
 
    }
          
}
