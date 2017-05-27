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

   

   
  
 

    

    public void testTraducirError( )
    {
       

        // Buscar una traduccion  que no exista
        Traduccion traduccion = traductor.traducir( "Arnoldo", Traductor.ESPANOL, Traductor.JAPONES );
        assertNull( "No se debió encontrar la traducción", traduccion );

       
    }
}