/*
 * Activity 4.9.2
 */
public class Feline extends Animal
{

  public Feline () {

  }

  public Feline(String food, boolean nocturnal, double aveLifeSpan) 
    { //Step 23
         super(food, nocturnal, aveLifeSpan);
         System.out.println("A feline has arrived");
    }

  public void growl()
  {
    System.out.println("The feline growls.");
  }

  public void roar()
  {
    System.out.println("The feline roars.");
  }

  public void hunt()
  {
    System.out.println("The feline hunts for food.");
  }
}
