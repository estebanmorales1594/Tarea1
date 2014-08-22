/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jimmy
 */
public class Test {
    public  static void main (String[] args){
        guardarInformacion c = new guardarInformacion("Beat","HOala","dsda","ddfdsf","dfsd");
        guardarInformacion d = new guardarInformacion("Beat","HOala","dsda","ddfdsf","dfsd");
        
        metodoGuardarObj test1= new metodoGuardarObj();
        test1.agregarObjeto(c);
        test1.agregarObjeto(d);
        test1.mostrarObjetos();
        
    }
    
}
