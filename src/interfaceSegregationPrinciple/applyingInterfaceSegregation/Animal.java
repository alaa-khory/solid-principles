package interfaceSegregationPrinciple.applyingInterfaceSegregation;

/**
 * In this improved example, the Animal interface includes only methods that all animals have,
 * such as eat() and sleep().
 * The Flyable and Swimmable interfaces include methods that only flying and swimming animals have, respectively.
 * The Bird class implements the Animal and Flyable interfaces,
 * while the Fish class implements the Animal and Swimmable interfaces.
 *
 * This approach separates interfaces based on functionality, which makes it easier to implement and maintain.
 * It also makes it clear which methods are relevant to each class,
 * which improves the readability and maintainability of the code.
 *
 */

public interface Animal {
    void eat();
    void sleep();
}

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Bird implements Animal, Flyable {
    public void eat() {
        System.out.println("The bird is eating.");
    }
    public void sleep() {
        System.out.println("The bird is sleeping.");
    }
    public void fly() {
        System.out.println("The bird is flying.");
    }
}

class Fish implements Animal, Swimmable {
    public void eat() {
        System.out.println("The fish is eating.");
    }
    public void sleep() {
        System.out.println("The fish is sleeping.");
    }
    public void swim() {
        System.out.println("The fish is swimming.");
    }
}
