import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Vehicle> vehiclesArray = new ArrayList<Vehicle>();
        ArrayList<IRideable> rideableArray = new ArrayList<IRideable>();
    Car car = new Car("Infiniti",.15);
    Truck truck = new Truck("Ram", .15);
    Bike bike = new Bike("DiamondBack", .15);
    RollerCoaster rollerCoaster = new RollerCoaster("KingDaKa",.20);
    Horse horse = new Horse("SeaBiscuit", .15);
       vehiclesArray.add(car);
       vehiclesArray.add(truck);
       vehiclesArray.add(horse);

       rideableArray.add(bike);
       rideableArray.add(rollerCoaster);
       rideableArray.add(car);
       rideableArray.add(truck);
       rideableArray.add(horse);


    }
}
