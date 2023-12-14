package Abstraction;
abstract class Plane{

    abstract public void takeOff();
    public void fly(){
        System.out.println("Plane is flying");
    }
    public void land(){
        System.out.println("plane is landing");
    }
    final void engine(){
        System.out.println("It has two engines");
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

    @Override
    public void takeOff() {
        System.out.println("Cargo plane is taking off");
    }

}
class passengerPlane extends Plane{
    @Override
    public void fly() {
        System.out.println("Passenger plane is flying");
    }
    public void passengerPlane(){
        System.out.println("Passenger Plane carries good");
    }
    @Override
    public void takeOff() {
        System.out.println("Passenger plane is taking off");
    }
}
class Airport{
    public void finale(Plane plane){
        plane.takeOff();
        plane.fly();

    }
    public void landing(Plane plane){
        plane.land();
    }
}


public class launchPlane1 {
    public static void main(String[] args) {
        cargoPlane cp = new cargoPlane();
        passengerPlane pp = new passengerPlane();
        Airport aa =new Airport();

        cp.takeOff(); // inherited methods
        cp.fly();     //overridden methods
        cp.cargoPlane(); //specialized method
        cp.land();
        System.out.println();

        Plane p = new cargoPlane();
        aa.finale(cp);
        cp.cargoPlane();
        aa.landing(cp);
        aa.finale(pp);
        pp.passengerPlane();
        aa.landing(pp);



    }
}
