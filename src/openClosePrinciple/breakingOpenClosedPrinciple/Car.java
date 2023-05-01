package openClosePrinciple.breakingOpenClosedPrinciple;

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
}
