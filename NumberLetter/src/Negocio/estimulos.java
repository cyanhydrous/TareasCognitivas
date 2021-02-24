/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Joshua
 */
public class estimulos {
    
    
    public String Cadena(){
        String let[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        int num[]={1,2,3,4,5,6,7,8,9};
        int numRandom=(int)Math.floor(Math.random()*8);
        int LetRandom=(int )Math.floor(Math.random()*26);
        String cadena= let[LetRandom]+ num[numRandom];
        return cadena;
                
    }
    public String cuadranteSiguiente(){
        String num[]={"primero","segundo","tercero","cuarto"};
        String regresar="";
        
        
        
        return regresar;
    }
 
}
