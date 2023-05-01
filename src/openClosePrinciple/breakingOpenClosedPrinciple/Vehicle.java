package openClosePrinciple.breakingOpenClosedPrinciple;


/**
 * In this Implementation if we want to add any new Vehicle (Truck) for example
 * Truck class should be added
 * and a new if statement will be added to the Vehicle class as well
 * with the logic related to Truck class
 * like the commented in line 22
 */
public class Vehicle {
    public double vehicleNumber(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            Car c = (Car) vehicle;
            return c.getNumber();
        }
        if (vehicle instanceof Bike) {
            Bike b = (Bike) vehicle;
            return b.getNumber();
        }
/**
 *         if(vehicle instanceof Truck){
 *             Truck t = (Truck) vehicle;
 *             return t.getNumber();
 *         }
*/
        else {
            return 0;
        }
    }

}
