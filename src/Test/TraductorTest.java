/**
 
 * Universidad Nacional de Colombia (Bogota - Colombia)

 * Autores : LIZARAZO, GUTIERREZ Y DELGADO 
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package Test;

import junit.framework.TestCase;
import Translate.Traduccion;
import Translate.Traductor;


public class TraductorTest extends TestCase
{
 
    private Traductor traductor;

   

   
  
    public void testTraducir1( )
    {
      

      
        Traduccion traduccion = traductor.traducir( "casa", Traductor.ESPANOL, Traductor.JAPONES );
        assertEquals( "La palabra original est� mal", "casa", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "house", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "anillo", Traductor.ESPANOL, Traductor.JAPONES );
        assertEquals( "La palabra original est� mal", "anillo", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "ring", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "le�n", Traductor.ESPANOL, Traductor.JAPONES );
        assertEquals( "La palabra original est� mal", "le�n", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "lion", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "sky", Traductor.ESPANOL, Traductor.JAPONES );
        assertEquals( "La palabra original est� mal", "cielo", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "sky", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "love", Traductor.ESPANOL, Traductor.JAPONES );
        assertEquals( "La palabra original est� mal", "amor", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "love", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "garbage", Traductor.ESPANOL, Traductor.JAPONES );
        assertEquals( "La palabra original est� mal", "basura", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "garbage", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "bolso", Traductor.ESPANOL, Traductor.JAPONES );
        assertEquals( "La palabra original est� mal", "bolso", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "sac", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "rojo", Traductor.ESPANOL, Traductor.JAPONES );
        assertEquals( "La palabra original est� mal", "rojo", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "rouge", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "lasa�a", Traductor.ESPANOL, Traductor.JAPONES );
        assertEquals( "La palabra original est� mal", "lasa�a", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "lasagne", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "nourriture", Traductor.ESPANOL, Traductor.JAPONES );
        assertEquals( "La palabra original est� mal", "comida", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "nourriture", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "profond", Traductor.ESPANOL, Traductor.JAPONES );
        assertEquals( "La palabra original est� mal", "profundo", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "profond", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "homme", Traductor.ESPANOL, Traductor.JAPONES );
        assertEquals( "La palabra original est� mal", "hombre", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "homme", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "cable", Traductor.ESPANOL, Traductor.JAPONES );
        assertEquals( "La palabra original est� mal", "cable", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "filo elettrico", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "rat�n", Traductor.ESPANOL, Traductor.JAPONES );
        assertEquals( "La palabra original est� mal", "rat�n", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "topo", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "cine", Traductor.ESPANOL, Traductor.JAPONES );
        assertEquals( "La palabra original est� mal", "cine", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "cinema", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "coperchio", Traductor.ESPANOL, Traductor.JAPONES );
        assertEquals( "La palabra original est� mal", "tapa", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "coperchio", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "zio", Traductor.ESPANOL, Traductor.JAPONES );
        assertEquals( "La palabra original est� mal", "t�o", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "zio", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "bigletto", Traductor.ESPANOL, Traductor.JAPONES );
        assertEquals( "La palabra original est� mal", "billete", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "bigletto", traduccion.darTraduccion( ) );
    }

    

    public void testTraducirError( )
    {
       

        // Buscar una traduccion  que no exista
        Traduccion traduccion = traductor.traducir( "Arnoldo", Traductor.ESPANOL, Traductor.JAPONES );
        assertNull( "No se debi� encontrar la traducci�n", traduccion );

       
    }
}