package Project1;

public class Frog {
    private String name;
    private int age;
    private double tongueSpeed;
    public boolean isFroglet;
    private static String species = "Rare Pepe";

    public Frog(String name, int age, double tongueSpeed){
        this.name = name;
        this.age = (int)age;
        this.tongueSpeed = tongueSpeed;

        if(age >= 1 && age <= 7){
            isFroglet=true;
        } else {
            isFroglet=false;
        }
    }

    public Frog(String name, double age){
        this(name,(int)age,5);

    }

    public Frog(String name){
        this(name,5,5);
    }

    public void grow(int numMonths){
            for(int i = 1; i != numMonths; i++){
                if(age <= 12){
                    tongueSpeed+=1;
                    //System.out.println("Increased tongue");
                }

                   if(tongueSpeed >= 5 && age >= 30){
                        tongueSpeed-=1;
                    }
                }

            age += numMonths;
            if(age >= 1 && age <= 7){
                isFroglet=true;
            } else {
                isFroglet=false;
            }


    }

    public void grow(){
        this.grow(1);
    }

    public void eat(Fly fly){
        if(fly.getMass() == 0){
            return;
           // System.out.println("banana");
        }
        if(fly.getSpeed()<tongueSpeed){
            if (fly.getMass() >= age*.5){

                this.grow();

            }
            fly.setMass(0);

        } else {
            //System.out.println("banana");////////////////////////////////////////
            fly.grow(1);
        }
    }

    @Override
    public String toString() {
        if(isFroglet){
            return String.format("My name is %s and I'm a rare froglet! I'm %d months old and my tongue has a speed of %.2f.", name, age, tongueSpeed);

        } else{
            return String.format("My name is %s and I'm a rare frog. I'm %d months old and my tongue has a speed of %.2f.", name, age, tongueSpeed);
        }
    }

    public static String getSpecies() {
        return species;
    }

    public static void setSpecies(String species) {
        Frog.species = species;
    }
}
