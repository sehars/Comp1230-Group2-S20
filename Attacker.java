//********************************************************************
// Attacker.java - interface 
// Author: S. Talat
// Group Assignment
//********************************************************************


public interface Attacker
{
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
     
}
