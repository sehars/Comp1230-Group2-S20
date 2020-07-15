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
          
          
          System.out.println("Testing of various methods on Animal Game Characters.\n");
          
          System.out.printf("Total number of animals is: %d \n\n" , Animal.getCount());
          
          System.out.println("|-----------------------|");
          System.out.println("| TESTING BUNNY METHODS |");
          System.out.println("|-----------------------|");
          System.out.println(bunny1);       
          System.out.printf("HIT %s - ", bunny1.getName());
          bunny1.hit();
          System.out.printf("Make %s HOP - " , bunny1.getName());
          bunny1.hop();
          System.out.printf("HIT %s - ", bunny1.getName());
          bunny1.hit();
          System.out.printf("Make %s HOP - " , bunny1.getName());
          bunny1.hop();
          
          System.out.println();
          
          System.out.println("|---------------------|");
          System.out.println("| TESTING PIG METHODS |");
          System.out.println("|---------------------|");          
          System.out.println(pig1); 
          System.out.printf("Make %s ROLL - " , pig1.getName());
          pig1.roll();
          System.out.printf("HIT %s - ", pig1.getName());
          pig1.hit();
          System.out.printf("HIT %s - ", pig1.getName());
          pig1.hit();
          System.out.printf("Make %s SLEEP - ", pig1.getName());          
          pig1.sleep();
          System.out.printf("HIT %s - ",pig1.getName());
          pig1.hit();
          System.out.printf("Make %s ROLL - " , pig1.getName());
          pig1.roll();
          System.out.printf("HIT %s - ",pig1.getName());
          pig1.hit();
          System.out.printf("\n\n");
          
          
          System.out.println("|---------------------------|");
          System.out.println("| TESTING WATERFOWL METHODS |");
          System.out.println("|---------------------------|\n");
          
          System.out.println("| ANGRYDUCK TEST |");
          System.out.println("|----------------|");
          System.out.println(duck1);       
          System.out.printf("HIT %s - ",duck1.getName());
          duck1.hit();
          System.out.printf("HIT %s - ",duck1.getName());          
          duck1.hit();
          System.out.printf("Make %s FLY - " , duck1.getName());
          duck1.fly();
          System.out.printf("Make %s FLY - " , duck1.getName());
          duck1.fly();
          System.out.printf("HIT %s - ",duck1.getName());          
          duck1.hit();
          System.out.printf("Make %s SWIM - " , duck1.getName());
          duck1.swim();
          
          System.out.printf("\n\n");
          
          System.out.println("| LOUDGOOSE TEST |");
          System.out.println("|----------------|");
          System.out.println(goose1); 
          goose1.setName("Gollum");
          System.out.printf("Changed name to %s\n", goose1.getName());
          goose1.setColor("Grey");
          System.out.printf("Changed color to %s\n", goose1.getColor());
          System.out.println(goose1); 
          System.out.printf("HIT %s - ", goose1.getName());
          goose1.hit();
          System.out.printf("Make %s FLY - ", goose1.getName() );
          goose1.fly();
          System.out.printf("Make %s SWIM - ", goose1.getName());          
          goose1.swim();
          
          System.out.println();
          
          System.out.printf("Total number of animals alive: %d \n\n" , Animal.getCount());
          
     }
     
}