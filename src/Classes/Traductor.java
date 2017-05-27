

package Classes;

import java.util.ArrayList;


public class Traductor
{

    public final static int ESPANOL = 0;
    public final static int JAPONES = 3;

  
    private ArrayList espanolJapones;



    public Traductor( )
    {
        espanolJapones = new ArrayList( );
     
        verificarInvariante( );
    }

   
    
    public boolean agregarTraduccion( String pal, String trad, int idDestino )
    {
        boolean agregada = false;
        // Busca la palabra en el diccionario del idioma
        Traduccion laTraduccion = traducirDeEspanol( pal, idDestino );
        // Verifica que la palabra ni la traducción existan
        if( laTraduccion == null && !existeTraduccion( idDestino, trad ) )
        {
            // Obtiene el arreglo de las traducciones correspondientes al idioma
            ArrayList traducciones = obtenerListaNombres( JAPONES );
            // Agrega la palabra con su traducción al diccionario
            traducciones.add( new Traduccion( pal, trad ) );
            agregada = true;
            // Verifica el invariante
            verificarInvariante( );
        }
        // Indica si la palabra fue agregada
        return agregada;
    }
  

    private Traduccion traducirDeEspanol( String palabra, int JAPONES )
    {
        // Obtiene el arreglo de traducciones correspondiente al idioma de traducci�n
        ArrayList traducciones = obtenerListaNombres( JAPONES );
        Traduccion traduccion = null;
        // Busca la palabra como palabra base en las traducciones
        for( int i = 0; i < traducciones.size( ) && traduccion == null; i++ )
        {
            Traduccion aux = ( Traduccion )traducciones.get( i );
            if( aux.darPalabra( ).equalsIgnoreCase( palabra ) )
                traduccion = aux;
        }
        return traduccion;
    }

  
    private ArrayList obtenerListaNombres( int idiomaTraduccion )
    {
        switch( idiomaTraduccion )
        {
            case JAPONES:
                return espanolJapones;
            
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
            Traduccion t = ( Traduccion )traducciones.get( i );
            String palabraTraducida = t.darTraduccion( );
            if( palabraTraducida.equalsIgnoreCase( traduccion ) )
                existe = true;
        }
        return existe;
    }
   
    public Traduccion traducir( String pal, int ESPANOL, int JAPONES )
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
                Traduccion aux = traducirAJapones( pal, ESPANOL );
                if( aux != null )
                    return traducirDeEspanol( aux.darPalabra( ), JAPONES );
            }
        }
        return null;
    }

    private Traduccion traducirAJapones( String palabra, int ESPANOL )
    {
       
        ArrayList traducciones = obtenerListaNombres( ESPANOL );
        Traduccion traduccion = null;
   
        for( int i = 0; i < traducciones.size( ) && traduccion == null; i++ )
        {
            Traduccion aux = ( Traduccion )traducciones.get( i );
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
        Traduccion traduccion;
        Traduccion otraTraduccion;
        String nombre;
        ArrayList traducciones = obtenerListaNombres( JAPONES );

        // Recorre las traducciones buscando si hay palabras repetidas
        for( int i = 0; i < traducciones.size( ) - 1; i++ )
        {
            traduccion = ( Traduccion )traducciones.get( i );
            nombre = traduccion.darPalabra( );
            for( int j = i + 1; j < traducciones.size( ); j++ )
            {
                otraTraduccion = ( Traduccion )traducciones.get( j );
                if( nombre.equalsIgnoreCase( otraTraduccion.darPalabra( ) ) )
                    return true;
            }
        }
        return false;
    }

    
    private boolean hayTraduccionesRepetidas( int JAPONES )
    {
        Traduccion traduccion;
        Traduccion otraTraduccion;
        String palabraTraducida;
        ArrayList traducciones = obtenerListaNombres( JAPONES );

        // Recorre las traducciones buscando si hay palabras con la misma traduccion
        for( int i = 0; i < traducciones.size( ) - 1; i++ )
        {
            traduccion = ( Traduccion )traducciones.get( i );
            palabraTraducida = traduccion.darTraduccion( );
            for( int j = i + 1; j < traducciones.size( ); j++ )
            {
                otraTraduccion = ( Traduccion )traducciones.get( j );
                if( palabraTraducida.equalsIgnoreCase( otraTraduccion.darTraduccion( ) ) )
                    return true;
            }
        }
        return false;
    }


    private void verificarInvariante( )
    {
        assert espanolJapones != null : "Diccionario español-japones sin inicializar";

        assert !hayNombresRepetidos( ESPANOL ) : "Nombres Repetidos en Japones";
    
        assert !hayTraduccionesRepetidas( JAPONES ) : "Nombres Repetidos en Japones";
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