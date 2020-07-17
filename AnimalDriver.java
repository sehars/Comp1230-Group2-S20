//********************************************************************
// AnimalDriver.java - program 
// Author: Sehar Talat (T00223475)
// Assignment 4
//********************************************************************


import java.util.*;  
import java.io.*;

public class AnimalDriver
{ 
     
     // Instantiates a derived class and invokes its inherited and local methods.
     public static void main(String[] args)
     {
          CuriousBunny bunny1 = new CuriousBunny("Balrog", "White");  
          HappyPig pig1 = new HappyPig("Palantir", "Pink");  
          AngryDuck duck1 = new AngryDuck("Denethor", "Yellow");            
          LoudGoose goose1 = new LoudGoose("Grima", "Beige");    
          
          System.out.printf("Total number of animals is: %d \n\n" , Animal.getCount());
          
          System.out.printf("The coordinates of %s are: %s \n", duck1.getName(), duck1.getPosition());
          System.out.printf("TELEPORT %s - Coordinates after teleporting are: %s \n", duck1.getName(), duck1.teleport()); 
          System.out.printf("TELEPORT %s - Coordinates after teleporting are: %s \n", duck1.getName(), duck1.teleport()); 
          System.out.printf("TELEPORT %s - Coordinates after teleporting are: %s \n", duck1.getName(), duck1.teleport()); 
          
          System.out.println();
          
          System.out.printf("Total number of animals alive: %d \n\n" , Animal.getCount());
          
     }
     
}