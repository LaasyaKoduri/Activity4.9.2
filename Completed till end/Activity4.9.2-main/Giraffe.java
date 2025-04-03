/*
 * Activity 4.9.2
 */
public class Giraffe extends Hooved
{
  public Giraffe(String food, boolean isNocturnal, double aveLifeSpan) { //Step 27
    super(food, isNocturnal, aveLifeSpan);
    System.out.println("A new giraffe arives.");
  }

  //Step 22
  public void speak(){
    hum();
  }

  public void hum()
  {
    System.out.println("The giraffe hums.");
  }

  public void eat() { //Step 27
    System.out.println("The giraffe eats");
  }
}