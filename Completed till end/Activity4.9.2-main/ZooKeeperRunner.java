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
    
    Tiger tiger = new Tiger("meat", true, 17.0); //Step 22, replace call to Tiger's constructor
    //Tiger tiger1 = new Tiger();

    Gorilla gorilla = new Gorilla();  //Step 26

    Giraffe giraffe = new Giraffe("leaves", false,25.0); //Step 27
    giraffe.eat();  //Step 27

    Hippo hippo = new Hippo(); //Step 28
    hippo.eat(); //Step 28

    //Step 30
    Penguin penguin = new Penguin();
    penguin.fish();
    Owl owl = new Owl();
    owl.hunt();
    Owl owl2 = new Owl("mice,insects", true, 4.0);
    owl2.eat();

    //Step 1-4: 4.9.6
    Animal a = new Elephant("leaves, grasses, roots", false, 60.0);
    a.isNocturnal();
    /*This call will not work because the trumpet method is not defined for the Animal class. 
    When considering the is-a relationship, an Animal is not always an elephant.
    */
    //a.trumpet();

    //Step 6-7: 4.9.6
    /* Object a2 = new Animal();
    a2.sleep();*/

    Animal a1 = new Animal();
    a1.sleep();

   

     
    tiger.swimAlone();
    tiger.huntAlone();
    tiger.isNocturnal();
    tiger.growl();
    tiger.eat();

    
  }
}