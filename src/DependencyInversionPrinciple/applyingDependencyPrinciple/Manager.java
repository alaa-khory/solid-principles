package DependencyInversionPrinciple.applyingDependencyPrinciple;

public class Manager {


    /**
     * @param employee can be any object of subclasses objects (Developer, Tester, designer, etc...)
     * here we apply the dependency inversion because we depend on high level class (Employee) not on details
     * Employee class is a parent for all types of employee (Developer, Tester, Designer, etc...)
     */
    public void addEmployee(Employee employee){

    }

}
