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
          
          System.out.println(" Which point do you want to move to?(the x coordinate, between 0-499)");
          Scanner sc1 = new Scanner(System.in);
          System.out.println(" Which point do you want to move to?(the y coordinate, between 0-1000)");
          Scanner sc2 = new Scanner(System.in);
          
          coordX = sc1.nextInt();
          coordY = sc2.nextInt();
          
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
