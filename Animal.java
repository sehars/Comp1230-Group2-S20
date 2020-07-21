//********************************************************************
// Animal.java - Class 
// Author: Sehar Talat (T00223475)
// Group Project 1
//********************************************************************

public abstract class Animal
{
     private static int count = 0;
     protected String name;
     protected String color;
     protected int health = 3;
     
     
     public static int getCount()
     {   
          return count;
     }
     
     
     public Animal(String name, String color)
     {
          this.name = name;
          this.color = color;
          count++;
     }
     
     
     public void setName(String name)
     {
          this.name = name;        
     }
     
     
     public void setColor(String color)
     {
          this.color = color;
     }
     
     
     public String getName()
     {
          return name;
     }
     
     
     public String getColor()
     {
          return color;
     }
     
     
     public int getHealth()
     {
          return health;         
     }
     
     
     public void displayAction(String action)
     {
          if (health <= 0)
          {
               System.out.println(name + " is dead hence can perform no action");
          }
          else
          {
               System.out.println(name + action);
          }
     }
     
     
     public void hit()
     {
          int newHealth = health;
          
          if (health > 0)
          {
               newHealth--;
               if (newHealth == 0)
               {
                    count--;
               }
          }
          displayAction(" is getting hit - Health is " + newHealth);
          health = newHealth;    
     }
     
     public String toString()
     {
          return String.format("%s: Name = %s, Color = %s, Health = %d", this.getClass().getSimpleName(), name, color, health);    
     }
     
}
