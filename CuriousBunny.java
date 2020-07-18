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
          
          System.out.println(" Which point do you want to move to?(the x coordinate)");
          Random random1 = new Random();
          System.out.println(" Which point do you want to move to?(the y coordinate)");
          Random random2 = new Random();
          
          coordx = random1.nextInt();
          coordy = random2.nextInt();
          
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
