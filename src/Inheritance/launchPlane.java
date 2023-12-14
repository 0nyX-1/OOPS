package Inheritance;
class Plane{
    public void takeOff(){
        System.out.println("Plane is taking off");
    }
    public void fly(){
        System.out.println("Plane is flying");
    }
    public void land(){
        System.out.println("plane is landing");
    }
}
class cargoPlane extends Plane{
    @Override
    public void fly() {
        System.out.println("Cargo plane is flying");
    }
    public void cargoPlane(){
        System.out.println("Cargo Plane carries good");
    }
}
class passengerPlane extends Plane{
    @Override
    public void fly() {
        System.out.println("Passemger plane is flying");
    }
    public void passengerPlane(){
        System.out.println("Passenger Plane carries good");
    }
}

public class launchPlane {
    public static void main(String[] args) {
    cargoPlane cp = new cargoPlane();
    passengerPlane pp = new passengerPlane();

    cp.takeOff(); // inherited methods
    cp.fly();     //overridden methods
    cp.cargoPlane(); //specialized method
    cp.land();


    }
}
