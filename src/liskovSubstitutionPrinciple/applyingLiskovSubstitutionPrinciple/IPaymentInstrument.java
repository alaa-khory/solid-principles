package liskovSubstitutionPrinciple.applyingLiskovSubstitutionPrinciple;

/**
 * The object of a super class should be easily replaceable with the object of its subclass
 *
 * In this implementation we tried to have just the very common methods, we have 2 methods:
 * {@link #validate() validateCard} for validating the card
 * {@link #collectPayment() paymentCollection} for collecting the payments from the customer
 * Be noted here we removed the fraudCheck method because it is not common method
 * But instead we move it to another class called (BaseCard) which will inherit from this class
 * So BaseCard class will have those 2 functionalities from inheritance and fraudCheck functionality inside it
 * Here we have 2 cases:
 * 1st case: card implements all functionalities, so the Card class will inherit from BaseCard class
 * 2nd case: card implements the common functionalities, so the Card class will inherit from IPaymentInstrument class
 *
 * Applying this hierarchy will provide the Liskov Substitution Principle
 */

public abstract class IPaymentInstrument {

    public abstract void validate();


    public abstract PaymentResponse collectPayment();

     public class PaymentResponse{
        public int identifier;
    }
}
