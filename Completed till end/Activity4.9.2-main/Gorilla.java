/*
 * Activity 4.9.2
 */
public class Gorilla extends Primate
{
  public Gorilla() {  //Step 25
    System.out.println("A gorilla arrives.");
  }

  //Step 22 - 4.9.5
  public void speak(){
    grunt();
  }

  public void grunt()
  {
    System.out.println("The gorilla grunts.");
  }
}