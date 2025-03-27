/*
 * Activity 4.9.2
 */
public class Hooved extends Animal
{
  public Hooved() { //Step 29
    System.out.println("A new hooved animal arrives");
  }

  public Hooved(String food, boolean nocturnal, double aveLifeSpan) 
    { //Step 27
         super(food, nocturnal, aveLifeSpan);
         System.out.println("A hooved animal has arrived");
    }
    public void forage()
  {
    System.out.println("The hooved animal forages for food.");
  }
}