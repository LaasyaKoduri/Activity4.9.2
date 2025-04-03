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

    //Step 22
    public void speak(){
      trumpet();
    }

    public void trumpet()
    {
      System.out.println("Elephants make trumpet noises.");
    }
    public void forage()
    {
      System.out.println("Elephants forage for food.");
    }

    //Step 8: 4.9.6
      public String toString()
      {
        return "This is an object of the Elephant class.";
      }
}