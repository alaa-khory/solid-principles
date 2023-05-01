package liskovSubstitutionPrinciple.applyingLiskovSubstitutionPrinciple;

public class RewardsCard extends IPaymentInstrument{
    @Override
    public void validate() {

    }

    @Override
    public PaymentResponse collectPayment() {
        return null;
    }
}
