public class Hangar {

    public static void main(String[] args) {
        Boat boat1 = new Boat("un bateau",20);
        Car car1 = new Car("une voiture", 150);

        System.out.println(boat1.doStuff());
        System.out.println(car1.doStuff());
    }
}
