package interfaceSegregationPrinciple.breakingInterfaceSegregation;

/**
 * In this example, the Animal interface includes methods for both flying and swimming,
 * even though not all animals can do both.
 * The Bird class implements the Animal interface, but since birds cannot swim,
 * the swim() method is not implemented. The Fish class also implements the Animal interface,
 * but since fish cannot fly, the fly() method is not implemented.
 *
 * This violates the interface segregation principle because the Animal interface includes methods
 * that not all animals can do, which leads to unnecessary implementation of methods
 * that are not relevant to certain classes.
 *
 * To improve this, we can create separate interfaces for flying and swimming animals
 * as the example in applyingInterfaceSegregation package
 */
public interface Animal {
    void eat();
    void sleep();
    void fly();
    void swim();
}

class Bird implements Animal {
    public void eat() {
        System.out.println("The bird is eating.");
    }
    public void sleep() {
        System.out.println("The bird is sleeping.");
    }
    public void fly() {
        System.out.println("The bird is flying.");
    }
    public void swim() {
        // Birds cannot swim, so we don't implement this method.
    }
}

class Fish implements Animal {
    public void eat() {
        System.out.println("The fish is eating.");
    }
    public void sleep() {
        System.out.println("The fish is sleeping.");
    }
    public void fly() {
        // Fish cannot fly, so we don't implement this method.
    }
    public void swim() {
        System.out.println("The fish is swimming.");
    }
}
