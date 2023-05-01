package liskovSubstitutionPrinciple.breakingLiskovSubstitutionPrinciple;

public class CreditCard extends IPaymentInstrument{

    @Override
    public void validate() {

    }

    @Override
    public void runFraudCheck() {

    }

    @Override
    public PaymentResponse collectPayment() {
        return null;
    }
}
