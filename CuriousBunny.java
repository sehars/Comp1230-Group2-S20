//********************************************************************
// CuriousBunny.java - class 
// Author: Sehar Talat (T00223475)
// Assignment 4
//********************************************************************
import java.util.*;  

public class CuriousBunny extends Animal implements Teleporter
{  
     protected int coordX = 0;
     protected int coordY = 0;
     protected int count;
   
     public String teleport()
     {
          int lowerBoundX = 0;
          int upperBoundX = 499;         
          int lowerBoundY = 0;
          int upperBoundY = 1000;
          
          Random random = new Random();
          
          coordX = random.nextInt(upperBoundX + 1) ;
          coordY = random.nextInt(upperBoundY + 1) ; 
          
          return getPosition();
     }
     
     public String getPosition()
     {
          return ("(" + coordX +","+ coordY + ")");
     }
      
     public CuriousBunny(String name, String color)
     {
          super(name, color);
     }
     
     public void hop()
     {
          displayAction(" is hopping");     
     }    
}
