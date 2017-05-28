/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Dataa.*; 
import java.util.ArrayList;

public class businesss {
    
    String url;
    Nombres pivote = new Nombres();
    
    public String ruta (String texto, ArrayList listas){
                  
         switch (texto){
             case "alexei":
                 pivote = (Nombres) listas.get(0);
                 url = pivote.getUrlImagen();                 
                 break;
             case "carolina":
                 pivote = (Nombres) listas.get(1);
                 url = pivote.getUrlImagen();
                 break;
             case "daniela":
                 pivote = (Nombres) listas.get(2);
                 url = pivote.getUrlImagen();
                 break;
             case "claudia":                 
                 pivote = (Nombres) listas.get(3);
                 url = pivote.getUrlImagen();
                 break; 
         } 
         
         return url;
     }
    
    
}
