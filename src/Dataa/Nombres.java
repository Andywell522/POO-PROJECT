/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dataa;

/**
 *
 * @author DAVID
 */
public class Nombres {
    private String español;
    private String japones;
    private String urlImagen;
  
    public Nombres(){
        
    }
    
    public Nombres(String español, String japones, String urlImagen){
        this.español = español;
        this.japones = japones;
        this.urlImagen = urlImagen;
    }    

    public String getEspañol() {
        return español;
    }

    public String getJapones() {
        return japones;
    }

    public String getUrlImagen() {
        return urlImagen;
    }
    
    
    
}
