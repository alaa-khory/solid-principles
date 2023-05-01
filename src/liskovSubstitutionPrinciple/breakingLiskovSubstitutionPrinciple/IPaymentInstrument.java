package liskovSubstitutionPrinciple.breakingLiskovSubstitutionPrinciple;

/**
 * In this implementation we have 3 methods:
 * {@link #validate() validateCard} for validating the card
 * {@link #runFraudCheck() checkFraud} for checking the fraud for a particular transaction
 * {@link #collectPayment() paymentCollection} for collecting the payments from the customer
 * Any subclass will be forced to implement all the methods even if there is no need for this particular method
 * Let's say we want to add new card payment (Rewards Card) and no need for running the fraud check for this card
 * in that case if we add rewards card class we have to implement all methods even the methods we don't want
 * we should have them with empty body
 */

public abstract class IPaymentInstrument {

    public abstract void validate();

    public abstract void runFraudCheck();

    public abstract PaymentResponse collectPayment();

    public class PaymentResponse {
        public int identifier;
    }
}
