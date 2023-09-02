package Project1;

public class Pond {
// fix tongueSpeed of frog to two decimals
    // fix speed of fly to two decimals
    //fix fly's grow method
    public static void main(String[] args) {
        Frog peepo = new Frog("Peepo");
        Frog pepe = new Frog("Pepe", 10, 15);
        Frog peepaw = new Frog("Peepaw, 4.6, 5");
        Frog kermit = new Frog("Kermit");
        Fly fly1 = new Fly(1,3);
        Fly fly2 = new Fly(6);
        Fly invincAfly = new Fly(4,100);

        Frog.setSpecies("1331 Frogs");
        System.out.println(peepo);
        peepo.eat(fly2);
        System.out.println(fly2);


    }



}
