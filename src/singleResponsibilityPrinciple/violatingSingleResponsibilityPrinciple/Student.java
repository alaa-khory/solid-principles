package singleResponsibilityPrinciple.violatingSingleResponsibilityPrinciple;

/**
 * This Class implementation violates Single Responsibility Principle
 * Because it has many responsibilities to do inside it:
 * Printing student details
 * Save student details into Database
 * Calculating the student GPA
* */

public class Student {
    public void printDetails(){
        // implementation of functionality
    }
    public void save(){
        // implementation of functionality
    }

    public void calculateGPA(){
        // implementation of functionality
    }
}
