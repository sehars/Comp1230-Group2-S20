//********************************************************************
// HappyPig.java - class 
// Author: Sehar Talat (T00223475)
// Group Project 1
//********************************************************************

public class HappyPig extends Animal
{   
     public HappyPig(String name, String color)
     {
          super(name, color);
     }
     
     public void sleep()
     {
          displayAction(" is sleeping "); 
     }
     
     public void roll()
     {  
          displayAction(" is rolling");    
     }
}