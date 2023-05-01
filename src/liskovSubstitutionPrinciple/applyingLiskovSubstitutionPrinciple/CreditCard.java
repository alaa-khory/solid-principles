package liskovSubstitutionPrinciple.applyingLiskovSubstitutionPrinciple;

public class CreditCard extends BaseCard {

    @Override
    public void runFraudCheck() {

    }

    @Override
    public void validate() {

    }

    @Override
    public PaymentResponse collectPayment() {
        return null;
    }
}
