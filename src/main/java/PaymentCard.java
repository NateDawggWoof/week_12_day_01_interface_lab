import java.util.ArrayList;

public abstract class PaymentCard {

    protected ArrayList<Double> charges;
    private  String name;

    public PaymentCard(String name) {
        this.name = name;
        this.charges = new ArrayList<>();
    }

    public ArrayList<Double> getCharges() {
        return charges;
    }

    public void setCharges(ArrayList<Double> charges) {
        this.charges = charges;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
