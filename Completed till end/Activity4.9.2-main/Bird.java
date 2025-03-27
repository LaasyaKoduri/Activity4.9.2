public class Bird extends Animal{   //Step 30
    public Bird () {

    }
  
    public Bird(String food, boolean nocturnal, double aveLifeSpan) { 
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A bird has arrived");
    }
}
