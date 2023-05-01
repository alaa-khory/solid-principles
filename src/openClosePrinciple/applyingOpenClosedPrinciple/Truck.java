package openClosePrinciple.applyingOpenClosedPrinciple;

public class Truck extends Vehicle{


    private double number;

    public Truck() {
    }

    public Truck(double number) {
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
