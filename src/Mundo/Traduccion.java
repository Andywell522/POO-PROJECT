
package Mundo;



public class Traduccion
{

    private String palabra;
    private String traduccion;

    public Traduccion( String pal, String trad )
    {
        palabra = pal;
        traduccion = trad;
        verificarInvariante( );
    }

    public String darPalabra( )
    {
        return palabra;
    }

    public String darTraduccion( )
    {
        return traduccion;
    }

    
    private boolean palabraEsValida( )
    {
        return palabra != null && !palabra.equals( "" );
    }

    private boolean traduccionEsValida( )
    {
        return traduccion != null && !traduccion.equals( "" );
    }

    private void verificarInvariante( )
    {
        assert palabraEsValida( ) : "La palabra es invalida";
        assert traduccionEsValida( ) : "La traduccion es invalida";
    }
}
