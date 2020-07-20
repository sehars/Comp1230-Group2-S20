/**
 * Auto Generated Java Class.
 */
public class Driver1 {
  
  
  public static void main(String[] args) { 
    
    CuriousBunny bunny1 = new CuriousBunny("Balrog", "White");  
    HappyPig pig1 = new HappyPig("Palantir", "Pink");  
    AngryDuck duck1 = new AngryDuck("Denethor", "Yellow");            
    LoudGoose goose1 = new LoudGoose("Grima", "Beige");    
    
    System.out.println("Testing the Teleporting and the location methods");
    bunny1.teleBunny();
    duck1.teleDuck();
    duck1.getPosition();
    bunny1.getPosition();
    System.out.println("");

    bunny1.teleBunny();
    duck1.teleDuck();
    duck1.getPosition();
    bunny1.getPosition();
    System.out.println("");
        
        
    System.out.println("Testing the attack methods for the animals:");
    duck1.attack(bunny1);
    duck1.attack(pig1);
    duck1.attack(bunny1);
    duck1.attack(bunny1);
    duck1.attack(bunny1);

    System.out.println("\nTrying to attack the same team:");
    duck1.attack(duck1);
    goose1.attack(goose1);
        
    System.out.println("");
    goose1.attack(duck1);
    goose1.attack(duck1);
    goose1.attack(duck1);


    System.out.println("\nTrying to teleport a bunny and the duck after dying:");
    bunny1.teleBunny();
    duck1.teleDuck();

    System.out.println("\nTesting the killcount methods:");
    goose1.getKillCount();
    duck1.getKillCount();

    
  }
  
  
}
