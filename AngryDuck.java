//********************************************************************
// AngryDuck.java - class 
// Author: Sehar Talat (T00223475)
// Assignment 4
//********************************************************************


import java.util.*;  

public class AngryDuck extends WaterFowl implements Teleporter
{
     protected int coordX = 500;
     protected int coordY = 0;
     
     public AngryDuck(String name, String color)
     {
          super(name, color);
     }  
     
     public String teleport()
     {
          int lowerBoundX = 500;
          int upperBoundX = 1000;         
          int lowerBoundY = 0;
          int upperBoundY = 1000;
                   
          Random random = new Random();
          
          coordX = random.nextInt(upperBoundX - lowerBoundX + 1) + lowerBoundX;
          coordY = random.nextInt(upperBoundY + 1) ; 
          return getPosition();
     }
     
     public String getPosition()
     {
          return ("(" + coordX +","+ coordY + ")");
     }
     
}
