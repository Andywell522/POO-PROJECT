
package interfaz;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class PanelConsulta extends JPanel implements ActionListener
{

    private final static String TRADUCIR = "traducir";
    private final static String LIMPIAR = "limpiar";

 
    private InterfazTraductor principal;

    private JLabel etiquetaPalabra;
    private JTextField campoPalabra;
    private JLabel etiquetaIdiomaTraduccionOrigen;
    private JLabel etiquetaIdiomaTraduccionDestino;
 
    private JLabel etiquetaTraduccion;
    private JTextField campoTraduccion;
    private JButton botonTraducir;
    private JButton botonLimpiar;

  
        
        
    public PanelConsulta( InterfazTraductor ventanaPrincipal )
    {
      
        principal = ventanaPrincipal;

        
        setLayout( new GridLayout( 2, 5, 10, 10 ) );
        setBorder( BorderFactory.createTitledBorder( "Consulta de traducciones" ) );

    
        etiquetaPalabra = new JLabel( "Nombre" );
        campoPalabra = new JTextField( );

        // Campo para el resultado de la traduccion de la palabra
        etiquetaTraduccion = new JLabel( "Traducción" );
        campoTraduccion = new JTextField( );
        campoTraduccion.setEditable( false );

        // Combo para el idioma de la traduccion
        etiquetaIdiomaTraduccionOrigen = new JLabel( "Español" );
    

        // Combo para el idioma destino
        etiquetaIdiomaTraduccionDestino = new JLabel( "Japones" );
 

        // Campo para el resultado de la traduccion
        campoTraduccion = new JTextField( );
        campoTraduccion.setEditable( false );

        // Botones
        botonTraducir = new JButton( "Traducir" );
        botonTraducir.addActionListener( this );
        botonTraducir.setActionCommand( TRADUCIR );

        botonLimpiar = new JButton( "Limpiar" );
        botonLimpiar.addActionListener( this );
        botonLimpiar.setActionCommand( LIMPIAR );

        // Adiciona los elementos a la interfaz
        add( etiquetaPalabra );
        add( etiquetaIdiomaTraduccionOrigen );
        add( etiquetaIdiomaTraduccionDestino );
        add( etiquetaTraduccion );
        add( new JLabel( "" ) );
        add( new JLabel( "" ) );
        add( campoPalabra );
        add( campoTraduccion );
        add( botonTraducir );
        add( botonLimpiar );
    }


    public void mostrarTraduccion( String traduccion )
    {
        campoTraduccion.setText( traduccion );
    }

    
    public void actionPerformed( ActionEvent evento )
    {
        String comando = evento.getActionCommand( );

        if( comando.equals( TRADUCIR ) )
        {
            String palabra = campoPalabra.getText( );
            

            if( palabra == null || palabra.equals( "" ) )
            {
                JOptionPane.showMessageDialog( this, "Debe ingresar la palabra a ser traducida!", "Error en la traducci�n", JOptionPane.ERROR_MESSAGE );
                return;
            }
            
        }
        else if( comando.equals( LIMPIAR ) )
        {
            limpiar( );
        }
    }


    private void inicializarComboIdiomaTraduccion( JComboBox combo )
    {
        
        combo.addItem( InterfazTraductor.IDIOMA_JAPONES );
        combo.addItem( InterfazTraductor.IDIOMA_ESPANOL );
        combo.setSelectedIndex( -1 );
    }

    /**
     * Limpia todos los campos y el combo del formulario
     */
    public void limpiar( )
    {
        campoPalabra.setText( "" );
        campoTraduccion.setText( "" );
    
    }
}