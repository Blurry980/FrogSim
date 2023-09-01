package Project1;

public class Frog {
    protected String name;
    protected int age;
    protected double tongueSpeed;
    protected boolean isFroglet;
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
                    System.out.println("Increased tongue");
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

}
