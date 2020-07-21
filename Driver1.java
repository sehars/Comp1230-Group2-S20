//********************************************************************
// Driver1.java - program 
// Author: Dongyuan Lu(T00587914)
// Group Assignment
//********************************************************************

public class Driver1 {
  
  
  public static void main(String[] args) { 
    
    CuriousBunny bunny1 = new CuriousBunny("Balrog", "White");  
    HappyPig pig1 = new HappyPig("Palantir", "Pink");  
    AngryDuck duck1 = new AngryDuck("Denethor", "Yellow");            
    LoudGoose goose1 = new LoudGoose("Grima", "Beige");    
    
    System.out.printf("Total number of animals is: %d \n\n" , Animal.getCount());
    
    System.out.println("Testing the Teleporting and the location methods");
    System.out.printf("TELEPORT %s - Coordinates after teleporting are: %s \n", duck1.getName(), duck1.teleport());
    System.out.printf("TELEPORT %s - Coordinates after teleporting are: %s \n", bunny1.getName(), bunny1.teleport());
    bunny1.getName();
    
    System.out.println(bunny1.getPosition());
    bunny1.getPosition();
    System.out.println("");

    
    duck1.getName();
    bunny1.teleport();
    System.out.println(bunny1.getPosition());
    duck1.teleport();
    duck1.getPosition();
    System.out.println(duck1.getPosition());
    System.out.println("");
        
        
    System.out.println("Testing the attack methods for the animals:");
    System.out.println("Duck attack bunny");
    duck1.attack(bunny1);
    System.out.println("Duck attack pig");
    duck1.attack(pig1);
    duck1.attack(bunny1);
    duck1.attack(bunny1);
    
    System.out.println("\nTrying to attack the same team:");
    System.out.println("Duck attack duck");
    duck1.attack(duck1);
    System.out.println("Goose attack goose");
    goose1.attack(goose1);
        
    System.out.println("");
    System.out.println("Goose attack duck");
    goose1.attack(duck1);
    goose1.attack(duck1);
    goose1.attack(duck1);


    System.out.println("\nTrying to teleport a bunny and the duck after dying:");
    System.out.println(bunny1.teleport());
    System.out.println(duck1.teleport());

    System.out.println("\nTesting the killcount methods:");
    System.out.println("The count of goose get killed");
    System.out.println(goose1.getKillCount());
    System.out.println("The count of duck get killed");
    System.out.println(duck1.getKillCount());

    System.out.printf("Total number of animals is: %d \n\n" , Animal.getCount());
    
  }
  
  
}
