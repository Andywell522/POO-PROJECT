
package interfaz;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class PanelAdicion extends JPanel implements ActionListener
{

    private final static String AGREGAR = "agregar";
    private final static String LIMPIAR = "limpiar";

  
    private InterfazTraductor principal;


    private JLabel etiquetaPalabra;
    private JLabel etiquetaTraduccion;
    private JLabel etiquetaIdiomaTraduccion;
    private JTextField campoPalabra;
    private JTextField campoTraduccion;
    private JButton botonLimpiar;
    private JButton botonAgregar;

  
    public PanelAdicion( InterfazTraductor ventanaPrincipal )
    {
        // Guarda referencia a la ventana principal
        principal = ventanaPrincipal;

        // Configura el layout y el borde con t�tulo
        setLayout( new GridLayout( 2, 5, 10, 10 ) );
        setBorder( BorderFactory.createTitledBorder( "Agregar palabras" ) );

        // campo para la palabra
        etiquetaPalabra = new JLabel( "Palabra en espa�ol" );
        campoPalabra = new JTextField( );

        // campo traducci�n
        etiquetaTraduccion = new JLabel( "Palabra traducida" );
        campoTraduccion = new JTextField( );

        // combo idioma traducci�n
        etiquetaIdiomaTraduccion = new JLabel( "Idioma traducci�n" );
    

        botonAgregar = new JButton( "Agregar" );
        botonAgregar.setActionCommand( AGREGAR );
        botonAgregar.addActionListener( this );
        
        
        

        botonLimpiar = new JButton( "Limpiar" );
        botonLimpiar.setActionCommand( LIMPIAR );
        botonLimpiar.addActionListener( this );

  
        add( etiquetaPalabra );
        add( etiquetaTraduccion );
        add( etiquetaIdiomaTraduccion );
        add( new JLabel( "" ) ); 
        add( new JLabel( "" ) ); 
        add( campoPalabra );
        add( campoTraduccion );
        add( botonAgregar );
        add( botonLimpiar );
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Limpia todos los campos y el combo del formulario
     */
    public void limpiar( )
    {
        campoPalabra.setText( "" );
        campoTraduccion.setText( "" );

    }

 
    public void actionPerformed( ActionEvent evento )
    {
        String comando = evento.getActionCommand( );

        if( comando.equals( AGREGAR ) )
        {
            String palabra = campoPalabra.getText( );
            String traduccion = campoTraduccion.getText( );
         
            if( palabra == null || palabra.equals( "" ) )
            {
                JOptionPane.showMessageDialog( this, "Debe ingresar la palabra en español", "Error al adicionar", JOptionPane.ERROR_MESSAGE );
                return;
            }
            else if( traduccion == null || traduccion.equals( "" ) )
            {
                JOptionPane.showMessageDialog( this, "Debe ingresar la traducción de la palabra", "Error al adicionar", JOptionPane.ERROR_MESSAGE );
                return;
            }
            
            
        }
        else if( comando.equals( LIMPIAR ) )
        {
            limpiar( );
        }
    }

}

