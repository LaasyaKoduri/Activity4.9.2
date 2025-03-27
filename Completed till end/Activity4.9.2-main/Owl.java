public class Owl extends Bird {
    public Owl() {
        System.out.println("A new owl has arrived");
    }
    
    public Owl(String food, boolean nocturnal, double aveLifeSpan)
    {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A new owl has arrived");
    }
    
    public void hunt()
    {
    System.out.println("The owl hunts.");
    }
}
