/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package filechooser.pkg2;//

import java.io.File;
import javax.swing.JFileChooser;

public class Filechooser2 {

    public static void main(String[] args) {
        
        JFileChooser fileChooser = new JFileChooser(".");
        int status = fileChooser.showOpenDialog (null);
        if (status == JFileChooser.APPROVE_OPTION){
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println (selectedFile.getAbsolutePath());
        }
        else{ 
            if (status == JFileChooser.CANCEL_OPTION){
                System.out.println("CANCELAR");
            }
            
        }
        
        

    }
    
}
