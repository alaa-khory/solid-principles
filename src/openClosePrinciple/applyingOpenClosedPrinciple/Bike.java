package openClosePrinciple.applyingOpenClosedPrinciple;

public class Bike extends Vehicle{

    private double number;

    public Bike() {
    }

    public Bike(double number) {
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
