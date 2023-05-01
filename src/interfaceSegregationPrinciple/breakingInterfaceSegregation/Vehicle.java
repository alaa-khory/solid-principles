package interfaceSegregationPrinciple.breakingInterfaceSegregation;

/**
 * The clients should not be forced to depend upon interface members they do not use
 *
 * In this implementation we have all methods listed in Vehicle interface:
 * Any subclass will be forced to implement all the methods even if there is no need for this particular method
 * Let's say we have class Sedan implements (start, stop, accelerate, brake, changeCarGear)
 * and class SportBike implements (start, stop, accelerate, brake, changeBikeGear, and wheelie)
 * in this implementation we should have all methods implemented for both classes Sedan and SportBike
 * even if we don't want them
 */

public interface Vehicle {
    void start();
    void stop();
    void accelerate();
    void brake();
    void changeCarGear();
    void changeBikeGear();
    void wheelie();
}
