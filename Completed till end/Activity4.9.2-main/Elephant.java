/*
 * Activity 4.9.2
 */
public class Elephant extends Animal
{
    public Elephant() { //Step 24
      System.out.println("A new elephant has arrived");
    }

    public Elephant(String food, boolean nocturnal, double aveLifeSpan)
    {
      super(food, nocturnal, aveLifeSpan);
      System.out.println("A new elephant has arrived");
    }

    public void trumpet()
    {
      System.out.println("Elephants make trumpet noises.");
    }
    public void forage()
    {
      System.out.println("Elephants forage for food.");
    }
}