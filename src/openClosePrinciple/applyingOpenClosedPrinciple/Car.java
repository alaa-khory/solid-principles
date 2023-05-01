package openClosePrinciple.applyingOpenClosedPrinciple;

public class Car extends Vehicle {

    private double number;

    public Car() {
    }

    public Car(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    @Override
    public double vehicleNumber() {
        return this.getNumber();
    }
}
