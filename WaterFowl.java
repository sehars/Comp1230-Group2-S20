//********************************************************************
// WaterFowl.java - class 
// Author: Sehar Talat (T00223475)
// Assignment 4
//********************************************************************

public abstract class WaterFowl extends Animal
{
     private boolean state;
     private int killCount;
     
     public WaterFowl(String name, String color)
     {
          super(name, color);
          state = false;
     }
     
     
     public void fly()
     {
          if (state) 
          {
               displayAction(" is already flying - Fly State: " + state); 
          }
          else
          {
               state = true;
               displayAction(" is now flying - Fly State: " + state);
          }
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
               killCount++;
          }
     }
     
     
     public int getKillCount();
     {
          return killCount;
     }
     
     public boolean getFlyState()
     {
          return state;
     }
     
     
     public String toString()
     {
          return String.format("%s, Fly State = %s", super.toString(), state);
     }
     
     
     
     public void swim()
     {
          if (state) 
          {
               state = false;
               displayAction(" is now swimming - Fly State: " + state);
               
          }
          else 
          {
               displayAction(" is already swimming - Fly State: " + state);                
          }
     }
     
     
}
