import com.mpatric.mp3agic.ID3v1;
import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javazoom.jlgui.basicplayer.BasicPlayerException;

/**
 * Ventana que va a reproducir la musica que se encuentra en
 * la libreria(NewJFrame.java)
 * En esta ventana podemos encontrar 4 botones basicos de
 * Play, Pause, Stop, Continues. Que van a servir para manipular
 * la musica.
 * En el constructor se va a recibir como entrada la direccion del
 * archivo de la cancion en la computadora y lo va a abrir.
 */
public class Interface extends javax.swing.JFrame {
Reproductormusica rep= null;
<<<<<<< HEAD

//JFileChooser fileChooser = new JFileChooser();



    /**
     * Creates new form Interface
     */
    public Interface( String file) throws BasicPlayerException {
        rep= new Reproductormusica();
        rep.control.open(new File(file+""));
=======
JFileChooser fileChooser = new JFileChooser();
private String String;

    //CONSTRUCTOR DE INTERFACE
    public Interface(File file) throws BasicPlayerException {
        rep= new Reproductormusica();
        rep.control.open(file);
>>>>>>> 7144e3540adff7b554c39603b8af16870a9c1264
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPlay = new javax.swing.JButton();
        btnPause = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        VolumenControl = new javax.swing.JSlider();
        VolControl = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        OpcionMenu = new javax.swing.JMenu();
        AgregarButton = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ReproductorMusica");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setToolTipText("");

<<<<<<< HEAD
        btnPlay.setText("Play");
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
=======
        PlayButton.setIcon(new javax.swing.ImageIcon("/home/estebanmorales/Documents/Java/GitHub/Tarea1/Play.png")); // NOI18N
        PlayButton.addActionListener(new java.awt.event.ActionListener() {
>>>>>>> 7144e3540adff7b554c39603b8af16870a9c1264
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        btnPause.setText("II");
        btnPause.addActionListener(new java.awt.event.ActionListener() {
=======
        PauseButton.setIcon(new javax.swing.ImageIcon("/home/estebanmorales/Documents/Java/GitHub/Tarea1/Pause.png")); // NOI18N
        PauseButton.addActionListener(new java.awt.event.ActionListener() {
>>>>>>> 7144e3540adff7b554c39603b8af16870a9c1264
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPauseActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        btnContinuar.setText("continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
=======
        StopButton.setIcon(new javax.swing.ImageIcon("/home/estebanmorales/Documents/Java/GitHub/Tarea1/Repeat.png")); // NOI18N
        StopButton.addActionListener(new java.awt.event.ActionListener() {
>>>>>>> 7144e3540adff7b554c39603b8af16870a9c1264
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        btnStop.setText("Stop");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
=======
        ContinueButton.setIcon(new javax.swing.ImageIcon("/home/estebanmorales/Documents/Java/GitHub/Tarea1/Stop.png")); // NOI18N
        ContinueButton.addActionListener(new java.awt.event.ActionListener() {
>>>>>>> 7144e3540adff7b554c39603b8af16870a9c1264
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        VolumenControl.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                VolumenControlStateChanged(evt);
            }
        });

        VolControl.setForeground(new java.awt.Color(254, 254, 254));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPlay)
                            .addComponent(btnStop))
                        .addGap(328, 328, 328)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnContinuar)
                            .addComponent(btnPause)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(VolumenControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(VolControl, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPause))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(VolumenControl, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VolControl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStop)
                    .addComponent(btnContinuar))
                .addGap(162, 162, 162))
        );

<<<<<<< HEAD
        jPanel2.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 251, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

=======
>>>>>>> 7144e3540adff7b554c39603b8af16870a9c1264
        OpcionMenu.setText("Opciones");

        AgregarButton.setText("Agregar");
        AgregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarButtonActionPerformed(evt);
            }
        });
        OpcionMenu.add(AgregarButton);

        jMenuBar1.add(OpcionMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
<<<<<<< HEAD

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
=======
    
    //CONTROLADOR DE PLAY
    private void PlayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayButtonActionPerformed
>>>>>>> 7144e3540adff7b554c39603b8af16870a9c1264
        try {
            rep.control.play();
        } 
        catch (BasicPlayerException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        } 
<<<<<<< HEAD
        
        //try {
          //  rep.AbrirFichero("/home/estebanmorales/Downloads/ingrid rosario - como lluvia.mp3");
        // TODO add your handling code here:
    //} catch (Exception ex) {
     //   Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
    //}
    }//GEN-LAST:event_btnPlayActionPerformed

    private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseActionPerformed
=======
    }//GEN-LAST:event_PlayButtonActionPerformed

    //CONTROLADOR DE PAUSE
    private void PauseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PauseButtonActionPerformed
>>>>>>> 7144e3540adff7b554c39603b8af16870a9c1264
    try {
        rep.control.pause();
    } catch (BasicPlayerException ex) {
        Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnPauseActionPerformed

<<<<<<< HEAD
    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
=======
    //CONTROLADOR DE STOP
    private void StopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopButtonActionPerformed
>>>>>>> 7144e3540adff7b554c39603b8af16870a9c1264
    try {
        rep.control.resume();
    } catch (BasicPlayerException ex) {
        Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
    }
<<<<<<< HEAD
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
=======
    }//GEN-LAST:event_StopButtonActionPerformed
    
    //CONTROLADOR DE CONTINUES
    private void ContinueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueButtonActionPerformed
>>>>>>> 7144e3540adff7b554c39603b8af16870a9c1264
    try {
        rep.control.stop();
    } 
    catch (BasicPlayerException ex) {
        Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
    }
<<<<<<< HEAD
    }//GEN-LAST:event_btnStopActionPerformed
/*
=======
    }//GEN-LAST:event_ContinueButtonActionPerformed

    /*
>>>>>>> 7144e3540adff7b554c39603b8af16870a9c1264
    private void AgregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarButtonActionPerformed
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo MP3", "mp3");
        fileChooser.setFileFilter(filtro);

        int seleccion = fileChooser.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            file = fileChooser.getSelectedFile();
            try {
                rep.control.open(file);
                String file2;
                file2 = file.toString();
                metodoGuardarObj Informacion;
                Informacion = new metodoGuardarObj();      
                 Informacion.agregarCancion(file2);
            } 
            catch (BasicPlayerException | IOException | UnsupportedTagException | InvalidDataException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }//GEN-LAST:event_AgregarButtonActionPerformed
<<<<<<< HEAD
      */
=======
    */
    
    //CONTROLADOR DE VOLUMEN
>>>>>>> 7144e3540adff7b554c39603b8af16870a9c1264
    private void VolumenControlStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_VolumenControlStateChanged
        try {
            rep.control.setGain((double)VolumenControl.getValue()/100);
        } 
        catch (BasicPlayerException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
        VolControl.setText(VolumenControl.getValue()+"%"); 
    }//GEN-LAST:event_VolumenControlStateChanged

<<<<<<< HEAD
    /**
     * @param args the command line arguments
     */
  public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
=======
    public static void main(String args[]) {
>>>>>>> 7144e3540adff7b554c39603b8af16870a9c1264
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } 
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

<<<<<<< HEAD
        /* Create and display the form */
       java.awt.EventQueue.invokeLater(() -> {
            try {
                new Interface("C:\\Users\\Jimmy\\Downloads\\Underground_Music_-Where_Well_Go(www.mp3vip.org).mp3").setVisible(true);
            } catch (BasicPlayerException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            }
   });
   }
=======
        java.awt.EventQueue.invokeLater(() -> {
            new Interface().setVisible(true);
        });
    }
>>>>>>> 7144e3540adff7b554c39603b8af16870a9c1264

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AgregarButton;
    private javax.swing.JMenu OpcionMenu;
    private javax.swing.JLabel VolControl;
    private javax.swing.JSlider VolumenControl;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnPause;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnStop;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
