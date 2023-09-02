package Project1;

public class Frog {
    protected String name;
    protected int age;
    protected double tongueSpeed;
    public boolean isFroglet;
    protected static String species = "Rare Pepe";

    public Frog(String name, int age, double tongueSpeed){
        this.name = name;
        this.age = age;
        this.tongueSpeed = tongueSpeed;
    }

    public Frog(String name, double age){
        this(name,(int)age,5);

    }

    public Frog(String name){
        this(name,5,5);
    }

    public void grow(int numMonths){
            for(int i = 0; i != numMonths; i++){
                if(age <=12){
                    tongueSpeed+=1;
                    //System.out.println("Increased tongue");
                }

                   if(tongueSpeed >= 5 && age >= 30){
                        tongueSpeed-=1;
                    }
                }

            age += numMonths;
        System.out.println(age);
        System.out.println(tongueSpeed);
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
        }
        if(fly.getSpeed()<tongueSpeed){
            fly.setMass(0);
            if (fly.getMass() >= age*.5){
                this.grow();

            }
        } else {
            fly.grow(1);
        }
    }

    @Override
    public String toString() {
        if(isFroglet){
            return String.format("My name is %s and I'm a rare froglet! I'm age %d months old and my tongue has a speed of %f.", name, age, tongueSpeed);

        } else{
            return String.format("My name is %s and I'm a rare frog. I'm age %d months old and my tongue has a speed of %f.", name, age, tongueSpeed);
        }
    }

    public static String getSpecies() {
        return species;
    }

    public static void setSpecies(String species) {
        Frog.species = species;
    }
}
