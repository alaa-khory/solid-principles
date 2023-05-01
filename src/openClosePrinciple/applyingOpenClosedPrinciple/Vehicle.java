package openClosePrinciple.applyingOpenClosedPrinciple;

/**
 * In this Implementation we write the method {@link #vehicleNumber()}  vehicleNumber }
 * And make all subclasses override this method instead of check the vehicle type
 * to implement the logic regarding the object type
 * and in this case no need for adding a new if statement to the Vehicle class
 * each time we want to add new type of vehicle to our application
 * instead we just need to add new sub Class for the new type extending from base class (Vehicle)
 * without modifying the base class.
 * And the new sub Class should override the common general methods in base Class (Vehicle) with subclass's logic
 */

public class Vehicle {

    public double vehicleNumber(){
        // Abstract functionality
        return 0;
    }

}
