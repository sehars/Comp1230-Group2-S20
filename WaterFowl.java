//********************************************************************
// WaterFowl.java - class 
// Author: Gideon Oaikhena (T00611917)
// Assignment 4
//********************************************************************

public abstract class WaterFowl extends Animal implements Attacker
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
     
    public void attack(Animal prey)
     {
          if(prey.getClass().getSimpleName() != this.getClass().getSimpleName())
          {
               if(prey.health == 0)
               {
                    System.out.printf("%s already dead \n", prey.name);
               }
               else if (prey.health == 1)
               {
                    System.out.printf("%s Attacking %s \n", this.name, prey.name);
                    prey.hit();
                    this.killCount++;
               }
               else
               {
                    System.out.printf("%s Attacking %s \n", this.name, prey.name);
                    prey.hit();
               }
          }
          else
               System.out.println("Cannot perform action");
          
     }
     
     
     public int getKillCount()
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
