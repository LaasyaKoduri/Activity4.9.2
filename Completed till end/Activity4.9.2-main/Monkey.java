/*
 * Activity 4.9.2
 */
public class Monkey extends Primate
{
  public void climb()
  {
    System.out.println("The monkey climbs.");
  }

  //Step 22
  public void speak(){
    hoot();
    howl();
  }
  
  public void hoot()
  {
    System.out.println("The monkey hoots.");
  }
  
  public void howl()
  {
    System.out.println("The monkey howls.");
  }
}