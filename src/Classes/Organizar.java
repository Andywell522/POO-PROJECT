

package Classes;

import java.util.ArrayList;


public class Organizar
{

    public final static int a = 0;
   
    private ArrayList traduccion ;



    public Organizar( )
    {
        traduccion = new ArrayList( );
      
    }

   
    
    public boolean agregarTraduccion( String pal, String trad, int idDestino )
    {
        boolean agregada = false;
        // Busca la palabra en el diccionario del idioma
        Katakana laTraduccion = traducirDeEspanol( pal, idDestino );
        // Verifica que la palabra ni la traducción existan
        if( laTraduccion == null && !existeTraduccion( idDestino, trad ) )
        {
            // Obtiene el arreglo de las traducciones correspondientes al idioma
            ArrayList traducciones = obtenerListaNombres( a );
            // Agrega la palabra con su traducción al diccionario
            traducciones.add( new Katakana( pal, trad ) );
            agregada = true;
            // Verifica el invariante
            ;
        }
        // Indica si la palabra fue agregada
        return agregada;
    }
  

    private Katakana traducirDeEspanol( String palabra, int JAPONES )
    {
        // Obtiene el arreglo de traducciones correspondiente al idioma de traducci�n
        ArrayList traducciones = obtenerListaNombres( JAPONES );
        Katakana traduccion = null;
        // Busca la palabra como palabra base en las traducciones
        for( int i = 0; i < traducciones.size( ) && traduccion == null; i++ )
        {
            Katakana aux = ( Katakana )traducciones.get( i );
            if( aux.darPalabra( ).equalsIgnoreCase( palabra ) )
                traduccion = aux;
        }
        return traduccion;
    }

  
    private ArrayList obtenerListaNombres( int a)
    {
        switch( a )
        {
            case 1 :
                return traduccion;
            
            default:
                return null;
        }
    }

    
    
    
    private boolean existeTraduccion( int idiomaTraduccion, String traduccion )
    {
        boolean existe = false;
        ArrayList traducciones = obtenerListaNombres( idiomaTraduccion );
        // Recorre el diccionario buscando si hay palabras con la misma traducción
        for( int i = 0; i < traducciones.size( ) && !existe; i++ )
        {
            Katakana t = ( Katakana )traducciones.get( i );
            String palabraTraducida = t.darTraduccion( );
            if( palabraTraducida.equalsIgnoreCase( traduccion ) )
                existe = true;
        }
        return existe;
    }
   
    public Katakana traducir( String pal, int ESPANOL, int JAPONES )
    {
       
        if( ESPANOL != JAPONES )
        {
            if( ESPANOL == ESPANOL )
            {
                return traducirDeEspanol( pal, JAPONES );
            }
            else if( JAPONES == ESPANOL )
            {
                return traducirAJapones( pal, ESPANOL );
            }
            else
            {
                Katakana aux = traducirAJapones( pal, ESPANOL );
                if( aux != null )
                    return traducirDeEspanol( aux.darPalabra( ), JAPONES );
            }
        }
        return null;
    }

    private Katakana traducirAJapones( String palabra, int ESPANOL )
    {
       
        ArrayList traducciones = obtenerListaNombres( ESPANOL );
        Katakana traduccion = null;
   
        for( int i = 0; i < traducciones.size( ) && traduccion == null; i++ )
        {
            Katakana aux = ( Katakana )traducciones.get( i );
            if( aux.darTraduccion( ).equalsIgnoreCase( palabra ) )
                traduccion = aux;
        }
        return traduccion;
    }

   
    public int darTotalNombresTraducidos( int JAPONES )
    {
       
        ArrayList traducciones = obtenerListaNombres( JAPONES );
        if( traducciones == null )
            return 0;
        else
            return traducciones.size( );
    }

   
    private boolean hayNombresRepetidos( int JAPONES )
    {
        Katakana traduccion;
        Katakana otraTraduccion;
        String nombre;
        ArrayList traducciones = obtenerListaNombres( JAPONES );

        // Recorre las traducciones buscando si hay palabras repetidas
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

    
    private boolean hayTraduccionesRepetidas( int JAPONES )
    {
        Katakana traduccion;
        Katakana otraTraduccion;
        String palabraTraducida;
        ArrayList traducciones = obtenerListaNombres( JAPONES );

        // Recorre las traducciones buscando si hay palabras con la misma traduccion
        for( int i = 0; i < traducciones.size( ) - 1; i++ )
        {
            traduccion = ( Katakana )traducciones.get( i );
            palabraTraducida = traduccion.darTraduccion( );
            for( int j = i + 1; j < traducciones.size( ); j++ )
            {
                otraTraduccion = ( Katakana )traducciones.get( j );
                if( palabraTraducida.equalsIgnoreCase( otraTraduccion.darTraduccion( ) ) )
                    return true;
            }
        }
        return false;
    }


   

    
   
    public String metodo1( )
    {
        return "respuesta1";
    }

   
    public String metodo2( )
    {
        return "respuesta2";
    }
}