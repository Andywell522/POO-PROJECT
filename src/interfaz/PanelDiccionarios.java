
package interfaz;

import java.awt.*;

import javax.swing.*;


public class PanelDiccionarios extends JPanel
{

    private JTextField totalJapones;
   
    private JLabel etiquetaJapones;


   
    public PanelDiccionarios( )
    {
        // Configura layout y borde con t�tulo
        setLayout( new GridLayout( 1, 6, 10, 10 ) );
        setBorder( BorderFactory.createTitledBorder( "Cantidad de Traducciones" ) );

        // Inicializa los elementos de interfaz
        etiquetaJapones = new JLabel( "Japones:" );
        
        totalJapones = new JTextField( );
        
        totalJapones.setEditable( false );
        

        // Adiciona los elementos
        add( etiquetaJapones );
        add( totalJapones );
      
    }

  
   
    public void asignarTotalJapones( int total )
    {
        totalJapones.setText( "" + total );
    }

   
}
