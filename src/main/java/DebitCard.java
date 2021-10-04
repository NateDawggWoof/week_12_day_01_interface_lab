import java.util.ArrayList;

public class DebitCard extends PaymentCard implements IChargeable {


    public DebitCard( String name) {
        super( name);
    }

    public double getTransactionFee(double purchaseAmount) {
        return purchaseAmount*0.02;
    }

    public void charge(double purchaseAmount) {
        this.charges.add(purchaseAmount);

    }

    public int countCharges() {
        return  this.charges.size();
    }
}
