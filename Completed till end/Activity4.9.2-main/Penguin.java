public class Penguin extends Bird {     //Step 30

    public Penguin() {
        System.out.println("A new penguin has arrived");
    }
    
    public Penguin(String food, boolean nocturnal, double aveLifeSpan)
    {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A new penguin has arrived");
    }
    
    public void fish()
    {
    System.out.println("The penguin fishes.");
    }
}
