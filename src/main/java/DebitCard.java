import java.util.ArrayList;

public class DebitCard implements IChargeable {

    private ArrayList<Double> charges;

    public DebitCard() {
        this.charges = new ArrayList<>();
    }

    public double getTransactionFee(double purchaseAmount) {
        return purchaseAmount*0.02;
    }

    public void charge(double purchaseAmount) {
        this.charges.add(purchaseAmount);

    }

    public ArrayList<Double> getCharges() {
        return charges;
    }

    public void setCharges(ArrayList<Double> charges) {
        this.charges = charges;
    }

    public int countCharges() {
        return  this.charges.size();
    }
}
