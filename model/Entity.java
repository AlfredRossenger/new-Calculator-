package model;

/**
 * Write a description of class Entity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.*; 

public class Entity implements operacionesBasicas
{

    public String cadena  ;

    public Entity(){

    }
    
     /**
     * Constructor for objects of class Entity
     */

    public Entity(String cadena){
        this.cadena = cadena ; 
    }

    /**Metodo que lee un String y devuelve un vector de caracteres
     *@param String cadena
     *return char[] c , la cadena como un vector de char 
     */
    private  char[] convertirChar(String cadena){

        char c[] = this.cadena.toCharArray(); 

        return c ; 
    }
    
    /**
       *metodo que valida si la cadena caracteres es correcta
       *@param String cadena 
       *return true si la cadena es correcta , false de lo contrario 
       */
    public  boolean validarLeer()throws Exception {

        char [] c = convertirChar(this.cadena); 
        
        return false ; 
    }

    public char[] convertirPre(String cadena){
        char[] pre = convertirChar(cadena) ; 

        return pre ; 
    }

    public char[] convertirPos(String cadena){
        char[] pos = convertirChar(cadena) ; 

        return pos ; 
    }

    public int sumar( int numero , int otro ){
        return 0 ; 
    }

    public int restar( int numero , int otro ){
        return 0 ; 
    }

    public int multiplicar( int numero , int otro ){
        return 0 ; 
    }

    public int dividir( int numero , int otro ){
        return 0 ; 
    }

    public String toString(){
        String str =""; 
        return str; 
    }

}
