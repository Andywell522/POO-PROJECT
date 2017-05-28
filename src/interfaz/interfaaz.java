
package interfaz;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import Dataa.Nombres;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class interfaaz extends javax.swing.JFrame {

    String pivote;
    String text;   
    businesss op = new businesss(); 
    
    public Clip clip;
    public String ruta="/Sonidos/";   
    
    
    public interfaaz() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    
    public class Imagen extends javax.swing.JPanel {
    public Imagen() {
    this.setSize(144,222); //se selecciona el tamaño del panel
    }
    //Se crea un método cuyo parámetro debe ser un objeto Graphics
    @Override
    public void paint(Graphics grafico) {
    Dimension height = getSize(); 
    //Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
    ImageIcon Img = new ImageIcon(getClass().getResource(pivote)); 
    //se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
    grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
    setOpaque(false);
    super.paintComponent(grafico);
    }
}
    
    public void Sonidos (String archivo)
    {
     
        try {
            
            clip= AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(ruta+archivo+".mp3")));
            clip.start();
            
        }catch (IOException | LineUnavailableException | UnsupportedAudioFileException e){
        }
    }
    
    
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource ("Imagenes/iconoo.jpg" ));
        return retValue;
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Traducir = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        Miku = new javax.swing.JLabel();
        Titulo = new javax.swing.JTextField();
        OP = new javax.swing.JLabel();
        Nge = new javax.swing.JLabel();
        jLabelDBZ = new javax.swing.JLabel();
        jLabelAGK = new javax.swing.JLabel();
        jLabelKNN = new javax.swing.JLabel();
        jLabelDN = new javax.swing.JLabel();
        jLabelIngresaNombre = new javax.swing.JLabel();
        Katakana = new javax.swing.JLabel();
        NombreUsuario = new javax.swing.JTextField();
        Sound = new javax.swing.JButton();
        SuLiteralEs = new javax.swing.JLabel();
        Literal = new javax.swing.JTextField();
        KANA = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Traducir.setBackground(new java.awt.Color(102, 153, 255));
        Traducir.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        Traducir.setForeground(new java.awt.Color(0, 102, 0));
        Traducir.setText("TRADUCIR LITERAL");
        Traducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TraducirActionPerformed(evt);
            }
        });
        getContentPane().add(Traducir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 380, 60));

        Salir.setBackground(new java.awt.Color(153, 102, 255));
        Salir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Salir.setText("SALIR");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, 190, 50));

        Limpiar.setBackground(new java.awt.Color(102, 102, 255));
        Limpiar.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        Limpiar.setText("LIMPIAR");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 460, 400, 70));

        Miku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/miku.jpeg"))); // NOI18N
        getContentPane().add(Miku, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        Titulo.setBackground(new java.awt.Color(51, 102, 255));
        Titulo.setFont(new java.awt.Font("Bell MT", 1, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Traduce tu nombre a Japonés con JAPONIZEITOR D.A.D");
        Titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TituloActionPerformed(evt);
            }
        });
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 1270, 70));

        OP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/OP.png"))); // NOI18N
        getContentPane().add(OP, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, -1, -1));

        Nge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/NGE.jpg"))); // NOI18N
        Nge.setText("jLabel1");
        getContentPane().add(Nge, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 300, -1));

        jLabelDBZ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DBZ.jpg"))); // NOI18N
        getContentPane().add(jLabelDBZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 640, -1, -1));

        jLabelAGK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AGK.jpg"))); // NOI18N
        getContentPane().add(jLabelAGK, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));

        jLabelKNN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/KNN.png"))); // NOI18N
        getContentPane().add(jLabelKNN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 410, -1, -1));

        jLabelDN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DN.jpg"))); // NOI18N
        getContentPane().add(jLabelDN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 170, -1, -1));

        jLabelIngresaNombre.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jLabelIngresaNombre.setForeground(new java.awt.Color(255, 255, 51));
        jLabelIngresaNombre.setText("Ingresa Tu Nombre:");
        getContentPane().add(jLabelIngresaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 320, 70));
        getContentPane().add(Katakana, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 690, 730, 150));

        NombreUsuario.setBackground(new java.awt.Color(153, 255, 255));
        NombreUsuario.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        NombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(NombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 360, 500, 60));

        Sound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sonido.jpg"))); // NOI18N
        Sound.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SoundMouseClicked(evt);
            }
        });
        Sound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoundActionPerformed(evt);
            }
        });
        getContentPane().add(Sound, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 640, 100, 90));

        SuLiteralEs.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SuLiteralEs.setForeground(new java.awt.Color(255, 255, 255));
        SuLiteralEs.setText("Traducción en Fonética española");
        getContentPane().add(SuLiteralEs, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 580, 350, 40));

        Literal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Literal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LiteralActionPerformed(evt);
            }
        });
        getContentPane().add(Literal, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 580, 430, 40));

        KANA.setBackground(new java.awt.Color(153, 204, 255));
        KANA.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        KANA.setForeground(new java.awt.Color(0, 153, 51));
        KANA.setText("TRADUCIR KATAKANA");
        KANA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KANAActionPerformed(evt);
            }
        });
        getContentPane().add(KANA, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 380, 70));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blue.jpg"))); // NOI18N
        Fondo.setMaximumSize(new java.awt.Dimension(1650, 900));
        Fondo.setMinimumSize(new java.awt.Dimension(1640, 900));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1600, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void TituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TituloActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LimpiarActionPerformed

    private void NombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreUsuarioActionPerformed

    
    
    private void SoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoundActionPerformed
       
      
        
        
    }//GEN-LAST:event_SoundActionPerformed

    private void LiteralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LiteralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LiteralActionPerformed

    private void TraducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TraducirActionPerformed
                
        String resulname;
        
        resulname = NombreUsuario.getText ();
                
        switch (resulname) {
        
            
           case "Alexei Ochoa":            
                Literal.setText("Arekusuei Ochoa" );
                pivote="/Imagenes/OP/";
            break;                   
              
            case "Cristian Aguilera":            
                Literal.setText("Kurisutian Agirera" );
            break;       
        
            case "Nicolás Álvarez":            
                Literal.setText("Nikorasu Arubaresu" );
            break;
            
            case "Alicia Arenaza":            
                Literal.setText("Arishia Arenasa" );
            break;
            
            case "David Bernal":            
                Literal.setText("Dabiddo Berunaru" );
            break;
            
            case "Diego Cortés":            
                Literal.setText("Diego Korutesu" );
            break;
            
            case "Diego Delgado":            
                Literal.setText("Diego Derugado" );
            break;
            
            case "Claudia Espejo":            
                Literal.setText("Kuraudia Esupeho" );
            break;
            
            case "David Fonseca":            
                Literal.setText("Dabiddo Fonseka" );
            break;
            
            case "Maicol Fontecha":            
                Literal.setText( "Maikoru Fontecha" );
            break;
            
            case "Johan Gamba":            
                Literal.setText("Hoan Gamuba" );
            break;
            
            case "Joan Gómez":            
                Literal.setText( "Hoan Gomesu" );
            break;
            
            case "David Gutiérrez":            
                Literal.setText("Dabiddo Gutieresu" );
            break;
            
            case "Jorge Hernández":            
                Literal.setText("Horuhe Erunandesu" );
            break;
            
            case "Sebastián Linares":            
                Literal.setText( "Sebasutian Rinaresu" );
            break;
            
            case "Andrés Lizarazo":            
                Literal.setText( "Andoresu Risaraso" );
            break;
            
            case "Nicolás Manosalva":            
                Literal.setText("Nikorasu Manosaruba" );
            break;
            
            case "Santiago Martín":            
                Literal.setText("Santiago Marutin" );
            break;
            
            case "Carlos Martínez":            
                Literal.setText("Karurosu Marutinesu" );
            break;
       
             case "Manuel Medina":            
                Literal.setText("Manueru Medina" );
            break;
            
             case "Daniel Mesa":            
                Literal.setText("Danieru Mesa" );
            break;
            
             case "Mauricio Meza":            
                Literal.setText("Maurishio Mesa" );
            break;
            
             case "Sebastián Moreno":            
                Literal.setText( "Sebasutian Moreno" );
            break;            
            
            case "Sergio Quintero":            
                Literal.setText( "Seruhio Kintero" );
            break;
            
            case "Daniela Quiroga":            
                Literal.setText( "Daniera Kiroga" );
            break;
            
            case "Mariana Rodríguez":            
                Literal.setText( "Mariana Rodorigesu" );
            break;
            
            case "Sebastián Sánchez":            
                Literal.setText( "Sebasutian Sanchesu" );
            break;
            
            case "María Sánchez":            
                Literal.setText( "Maria Sanchesu" );
            break;
            
            case "Oscar Segura":            
                Literal.setText( "Osukaru Segura" );
            break;
            
            case "Andrés Sierra":            
                Literal.setText("Andoresu Shiera" );
            break;
            
            case "Sebastián Tovar":            
                Literal.setText("Sebasutian Tobaru" );
            break;
            
            case "Julie Triviño":            
                Literal.setText( "Furie Toribinyo" );
            break;
            
            case "Brayan Upegui":            
                Literal.setText("Burajan Upegi" );
            break;
            
            
            case "Juan Valenzuela":            
                Literal.setText( "Fuan Barensuera" );
            break;
            
            
            default:
                Literal.setText("Ingrese su nombre correctamente escrito");
            break; 
        }
        
        Imagen Imagen = new Imagen();
        Katakana.add(Imagen);
        Katakana.repaint();  
    }//GEN-LAST:event_TraducirActionPerformed

    private void SoundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SoundMouseClicked


        String resulname2;
        
        resulname2 = Literal.getText ();
    
        
        switch (resulname2) {
       
            case "Arekusuei Ochoa":            
                try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                } 
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    


            break;
       
              
            case "Kurisutian Agirera":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    
            break;
       
        
            case "Nikorasu Arubaresu":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    
            break;
            
            
            case "Arishia Arenasa":            
                try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    
            break;
            
            
            case "Dabiddo Berunaru":            
                try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    
            break;
            
            
            case "Diego Korutesu":            
                try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
            break;

            
            case "Diego Derugado":            
                try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    
            break;
            
            
            
            case "Kuraudia Esupeho":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    
            break;
            
            
            
            case "Dabiddo Fonseka":            
                try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    
            break;
            
            
            
            case "Maikoru Fontecha":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    
            break;
            
            
            
            case "Hoan Gamuba":            
                try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
            break;
            
            
            
            case "Hoan Gomesu":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
            break;
            
            
            
            case "Dabiddo Gutieresu":            
                try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    
            break;
            
            
            case "Horuhe Erunandesu":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
            break;
            
            
            case "Sebasutian Rinaresu":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
            break;
            
            
            
            case "Andoresu Risaraso":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\andres_lizarazo.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
            case "Nikorasu Manosaruba":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
            case "Santiago Marutin":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
            case "Karurosu Marutinesu":            
              try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
       
             case "Manueru Medina":            
                try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
             case "Danieru Mesa":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
             case "Maurishio Mesa":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
             case "Sebasutian Moreno":            
                try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
            
            case "Seruhio Kintero":            
                try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
            case "Daniera Kiroga":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
            case "Mariana Rodorigesu":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
            case "Sebasutian Sanchesu":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
            case "Maria Sanchesu":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
            case "Osukaru Segura":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
            case "Andoresu Shiera":            
              try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
            case "Sebasutian Tobaru":            
              try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
            case "Furie Toribinyo":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
            case "Burajan Upegi":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
            
            case "Fuan Barensuera":            
               try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Andres\\Desktop\\drive-download-20170527T230652Z-001\\alexei_ochoa.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();    
            
           
                }
                catch (JavaLayerException e){
                e.printStackTrace();
                }
                catch (FileNotFoundException e){
                e.printStackTrace();
             }
    

            break;
            
            
            default:
                Literal.setText("Ingrese su nombre correctamente escrito");
            break;
             
        
           
        }
     
    }//GEN-LAST:event_SoundMouseClicked

    private void KANAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KANAActionPerformed

       
              
        




        
        
        
    }//GEN-LAST:event_KANAActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton KANA;
    private javax.swing.JLabel Katakana;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField Literal;
    private javax.swing.JLabel Miku;
    private javax.swing.JLabel Nge;
    private javax.swing.JTextField NombreUsuario;
    private javax.swing.JLabel OP;
    private javax.swing.JButton Salir;
    private javax.swing.JButton Sound;
    private javax.swing.JLabel SuLiteralEs;
    private javax.swing.JTextField Titulo;
    private javax.swing.JButton Traducir;
    private javax.swing.JLabel jLabelAGK;
    private javax.swing.JLabel jLabelDBZ;
    private javax.swing.JLabel jLabelDN;
    private javax.swing.JLabel jLabelIngresaNombre;
    private javax.swing.JLabel jLabelKNN;
    // End of variables declaration//GEN-END:variables
}
