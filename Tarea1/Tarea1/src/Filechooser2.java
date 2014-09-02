import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Funcionalidad para la manipulacion de archivos
 * Se abre una ventana con los archivos de la computadora, 
 * lo cual permite al usuario escoger el archivo que desea manipular
 * 
 */

public class Filechooser2 {

    public static void main(String[] args) {
        
        JFileChooser fileChooser = new JFileChooser();
        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo MP3", "mp3");
        fileChooser.setFileFilter(filtro);
        
        int status = fileChooser.showOpenDialog (null);
        if (status == JFileChooser.APPROVE_OPTION){
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println (selectedFile.getParent());
        }
        else{ 
            if (status == JFileChooser.CANCEL_OPTION){
                System.out.println("CANCELAR");
            }
            
        }
        
        

    }
    
}
