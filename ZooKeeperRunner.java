/*
 * Activity 4.9.2
 */
public class ZooKeeperRunner
{
  public static void main(String[] args)
  { 
    Elephant elephant = new Elephant("leaves, grasses, roots", false, 60.0);
    elephant.eat();
    elephant.isNocturnal();
    elephant.getLifeSpan();
    /* 
    Tiger tiger = new Tiger();
    tiger.swimAlone();
    tiger.huntAlone();
    tiger.isNocturnal();
    tiger.growl();
    tiger.eat();
    */
  }
}