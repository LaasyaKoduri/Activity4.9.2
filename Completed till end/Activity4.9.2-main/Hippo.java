/*
 * Activity 4.9.2
 */
public class Hippo extends Hooved
{
  public Hippo() { //Step 29
    System.out.println("A new hippo arives.");
  }

  //Step 22 - 4.9.5
  public void speak(){
    groan();
  }

  public void groan()
  {
    System.out.println("The hippo groans.");
  }
  public void eat() { //Step 29
    System.out.println("The hippo eats.");
  }


}