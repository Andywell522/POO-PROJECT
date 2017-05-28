

package Classes;

import java.util.ArrayList;


public class Organizar
{

    public final static int a = 0;
   
    private ArrayList traducciones ;



    public Organizar( )
    {
        traducciones = new ArrayList( );
      
    }

        private Katakana traducirKatakana( String palabra, int a )
    {
       
        
        Katakana traduccion = null;
   
        for( int i = 0; i < traducciones.size( ) && traduccion == null; i++ )
        {
            Katakana aux = ( Katakana )traducciones.get( i );
            if( aux.darTraduccion( ).equalsIgnoreCase( palabra ) )
                traduccion = aux;
        }
        return traduccion;
    }

   
 

   
    private boolean hayNombresRepetidos( int a )
    {
        Katakana traduccion;
        Katakana otraTraduccion;
        String nombre;
        
        for( int i = 0; i < traducciones.size( ) - 1; i++ )
        {
            traduccion = ( Katakana )traducciones.get( i );
            nombre = traduccion.darPalabra( );
            for( int j = i + 1; j < traducciones.size( ); j++ )
            {
                otraTraduccion = ( Katakana )traducciones.get( j );
                if( nombre.equalsIgnoreCase( otraTraduccion.darPalabra( ) ) )
                    return true;
            }
        }
        return false;
    }


}