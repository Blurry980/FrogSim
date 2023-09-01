package Project1;

public class Fly {
    private int mass;
    private double speed;

    public Fly(int mass, double speed){
        this.mass = mass;
        this.speed = speed;
    }

    public Fly(int mass){
        this(mass,10);
    }

    public Fly(){
        this(5, 10);
    }

    public double getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        String result = "";
        if(mass == 0) {
         return String.format("I'm dead, but I used to fly with a speed of %f.\n", speed);

        }
       return String.format("I'm a speedy fly with %f speed and %d mass.\n",speed,mass);

    }

    public void grow(int addedMass) { //not sure if I understood instructions correctly
        //mass += addedMass;

        if (mass < 20) {
            for (mass = mass + addedMass; mass != 20; mass++) {
                speed += 1;
                //System.out.println("in loop");
            }
            System.out.printf("Dang I;m fast. I have a speed of %f and a weight of %d", speed, mass);
        } else if (mass >= 20) {
            for (double diff = 20 - mass; mass == 20; diff++) {
                speed -= 0.5;
            }
            System.out.printf("Dang I;m slowing down. I have a speed of %f and a weight of %d", speed, mass);
        }
    }
}
