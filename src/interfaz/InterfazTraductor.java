

package interfaz;
import java.awt.*;
import javax.swing.*;
import Mundo.*;


public class InterfazTraductor extends JFrame
{

    public static final String IDIOMA_ESPANOL = "Espa�ol";
    public static final String IDIOMA_JAPONES = "Japones";

    private Traductor traductor;

    
    private PanelExtension panelExtension;
    private PanelAdicion panelAdicion;
    private PanelDiccionarios panelListaNombres;
    private PanelConsulta panelConsulta;
    private PanelImagen panelImagen;


    public InterfazTraductor( )
    {
      
        traductor = new Traductor( );

        // Construye la forma
        getContentPane( ).setLayout( new GridBagLayout( ) );
        setSize( 720, 425 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setTitle( "Traductor" );
        setResizable( false );

        // Creacion de los paneles
        GridBagConstraints gbc = new GridBagConstraints( );
        gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelImagen = new PanelImagen( );
        getContentPane( ).add( panelImagen, gbc );

        gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelConsulta = new PanelConsulta( this );
        getContentPane( ).add( panelConsulta, gbc );

        gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelAdicion = new PanelAdicion( this );
        getContentPane( ).add( panelAdicion, gbc );

        gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelListaNombres = new PanelDiccionarios( );
        getContentPane( ).add( panelListaNombres, gbc );

        gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelExtension = new PanelExtension( this );
        getContentPane( ).add( panelExtension, gbc );
    }


     public void agregarPalabra( String pal, String trad, int idioma )
    {
        // Adiciona la traducción
        if( traductor.agregarTraduccion( pal, trad, idioma ) )
        {
            panelAdicion.limpiar( );
            // Actualiza los totales
            refrescarTotalesDiccionarios( );
        }
        else
            JOptionPane.showMessageDialog( this, "La palabra ya existe o su traducción ya está asignada a otra palabra", "Error al adicionar", JOptionPane.ERROR_MESSAGE );
    }
    
    
     private void refrescarTotalesDiccionarios( )
    {
        panelListaNombres.asignarTotalJapones( traductor.darTotalNombresTraducidos( Traductor.JAPONES ) );
        
    }
    
    
    public void traducirPalabra( String pal, int origen, int destino )
    {
        Traduccion traduccion = traductor.traducir( pal, origen, destino );
        if( traduccion != null )
        {
 
            if( destino == Traductor.ESPANOL )
            {
                // Si es espa�ol el idioma destino se muestra la traducci�n
                panelConsulta.mostrarTraduccion( traduccion.darPalabra( ) );
            }
            else
            {
               
                panelConsulta.mostrarTraduccion( traduccion.darTraduccion( ) );
            }
        }
        else
        {
            panelConsulta.mostrarTraduccion( "" );
            JOptionPane.showMessageDialog( this, "No existe la traduccion de la palabra", "Traduccion", JOptionPane.ERROR_MESSAGE );
        }
    }

   
  


    public void reqFuncOpcion1( )
    {
        String resultado = traductor.metodo1( );
        JOptionPane.showMessageDialog( this, resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }

    public void reqFuncOpcion2( )
    {
        String resultado = traductor.metodo2( );
        JOptionPane.showMessageDialog( this, resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }


    public static void main( String[] args )
    {
        InterfazTraductor interfaz = new InterfazTraductor( );
        interfaz.setVisible( true );
    }
}