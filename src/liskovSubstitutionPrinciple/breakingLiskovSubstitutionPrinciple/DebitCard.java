package liskovSubstitutionPrinciple.breakingLiskovSubstitutionPrinciple;

public class DebitCard extends IPaymentInstrument{

    @Override
    public void validate() {
//        Implementation of functionality
    }

    @Override
    public void runFraudCheck() {
//        Implementation of functionality
    }

    @Override
    public PaymentResponse collectPayment() {
//        Implementation of functionality
        return null;
    }
}
