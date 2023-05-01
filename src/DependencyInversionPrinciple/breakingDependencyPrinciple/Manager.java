package DependencyInversionPrinciple.breakingDependencyPrinciple;


/**
 * In this implementation we have 2 methods:
 * {@link #addDeveloper(Developer) addDeveloper} for adding new developer under this manager supervision
 * {@link #addTester(Tester) addTester} for adding new tester under this manager supervision
 * if we need to add new type of employees under the supervision of this manager
 * we should add new method for adding this type of employee let's say (addDesigner(Designer))
 * and new class for this Designer type of employee
 *
 * And this violates the dependency inversion cause here we depend on details instead of high level classes
 */

public class Manager {


    public void addDeveloper(Developer developer){

    }

    public void addTester(Tester tester){

    }

}
