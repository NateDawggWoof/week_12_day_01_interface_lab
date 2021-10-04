import java.util.ArrayList;

public class CreditCard extends PaymentCard implements IChargeable {

    private double riskMultiplier;
    private double creditLimit;

    public CreditCard( String name ) {
        super( name);
        this.riskMultiplier = 0;
        this.creditLimit = 0;

    }

    public double getRiskMultiplier() {
        return riskMultiplier;
    }

    public void setRiskMultiplier(double riskMultiplier) {
        this.riskMultiplier = riskMultiplier;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getTransactionFee(double purchaseAmount) {
        return purchaseAmount*(2*riskMultiplier);
    }


    public void charge(double purchaseAmount) {
        this.creditLimit-=purchaseAmount;
        this.charges.add(purchaseAmount);

    }

    public int countCharges() {
        return this.charges.size();
    }
}
