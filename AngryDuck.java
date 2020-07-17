//********************************************************************
// AngryDuck.java - class 
// Author: Sehar Talat (T00223475)
// Assignment 4
//********************************************************************


import java.util.*;  

public class AngryDuck extends WaterFowl implements Teleporter, Attacker
{
     protected int coordX = 500;
     protected int coordY = 0;
     protected int count;
     
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
     
     public void attack(Animal prey);
     {
          if(prey.health > 0)
          {
               System.out.println("Attacking");
               prey.hit();
          }
          if(prey.health == 0)
          {
               count++;
          }
     }
     
     public int getKillCount();
     {
          return count;
     }
     
     public String getPosition()
     {
          return ("(" + coordX +","+ coordY + ")");
     }
     
}
