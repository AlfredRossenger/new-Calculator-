package model;

import java.util.*; 


public class pruebas
{
  public static void main(String[] args)throws Exception 
  {
      Scanner sc = new Scanner(System.in); 
      
      while(sc.hasNext()){
        
          String str = sc.next(); 
          
          
          if(Entity.validarLeer(str))System.out.println("true"); 
          else System.out.println("false"); 
      }
    
  }


}

// estoy realizando una prueba para git 
