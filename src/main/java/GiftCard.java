public class GiftCard implements IChargeable {

    private  double balance;

    public GiftCard() {
        this.balance = 0.0;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void charge(double purchaseAmount) {
        this.balance-=purchaseAmount;
    }

    public double getTransactionFee(double purchaseAmount) {
        return 0;
    }
}
