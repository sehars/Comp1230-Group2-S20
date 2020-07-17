//********************************************************************
// LoudGoose.java - class 
// Author: Sehar Talat (T00223475)
// Assignment 4
//********************************************************************

public class LoudGoose extends WaterFowl implements Attacker
{
     public LoudGoose(String name, String color)
     {
          super(name, color);
          int count
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
     /*{
          return count;
     }*/
}
