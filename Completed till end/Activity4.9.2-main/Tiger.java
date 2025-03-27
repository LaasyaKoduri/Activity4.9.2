/*
 * Activity 4.9.2
 */
public class Tiger extends Feline
{

  public Tiger() { //Step 24
    System.out.println("A new tiger has arrived");
  }

  public Tiger(String food, boolean nocturnal, double aveLifeSpan) //Step 20
    {
      super(food, nocturnal, aveLifeSpan);
      System.out.println("A new tiger has arrived");
    }
  
  public void huntAlone()
  {
    System.out.println("Tigers hunt alone.");
  }

  public void swimAlone()
  {
    System.out.println("Tigers swim alone.");
  }
}