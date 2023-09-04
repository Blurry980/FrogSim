package Project1;

public class Fly {
    private double mass;
    private double speed;

    public Fly(double mass, double speed){
        this.mass = mass;
        this.speed = speed;
    }

    public Fly(double mass){
        this(mass,10.0);
    }

    public Fly(){
        this(5, 10.0);
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
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
         return String.format("I'm dead, but I used to fly with a speed of %.2f.", speed);

        }
       return String.format("I'm a speedy fly with %.2f speed and %.2f mass.",speed,mass);

    }


    public void grow(int addMass) {
        int i = 0;
        while (i != addMass) {
            mass++;
            if (mass <= 20) {
                speed++;
            } else {
                speed = speed - 0.5;
            }
            i++;
        }
    }

    public boolean isDead() {
        if (mass==0) {
            return true;
        } else {
            return false;
        }
    }
}
