package liskovSubstitutionPrinciple.breakingLiskovSubstitutionPrinciple;

public class RewardsCard extends IPaymentInstrument{
    @Override
    public void validate() {
//        Implementation of functionality
    }

    @Override
    public void runFraudCheck() {
//        No need for this method even though we implemented it with an empty body
    }

    @Override
    public PaymentResponse collectPayment() {
//        Implementation of functionality
        return null;
    }
}
