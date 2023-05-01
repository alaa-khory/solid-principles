import openClosePrinciple.applyingOpenClosedPrinciple.Truck;
import openClosePrinciple.applyingOpenClosedPrinciple.Bike;
import openClosePrinciple.applyingOpenClosedPrinciple.Car;
import openClosePrinciple.applyingOpenClosedPrinciple.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Vehicle car = new Car(6);
        Vehicle bike = new Bike(2);
        Vehicle truck = new Truck(8);

        car = new Bike(10);

        System.out.println(car.vehicleNumber());
        System.out.println(bike.vehicleNumber());
        System.out.println(truck.vehicleNumber());

    }
}