import javazoom.jl.player.Player;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Clase para reproducir musica, solamente reproduce
 * de la direccion del archivo escrita por el programador
 * 
 */
public class JLAYERPRUEBAS {
    public static void main(String[] args){
        
        try{
            
            FileInputStream fis = new FileInputStream("C:\\01 Dark Chest Of Wonders (1).mp3");
            Player playMp3 = new Player (fis);
            
            playMp3.play();
        }
        catch(FileNotFoundException e)
        {
           System.out.println(e);
        }
}
}