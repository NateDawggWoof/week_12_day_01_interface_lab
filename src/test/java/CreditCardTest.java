import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    private  CreditCard creditCard;

    @Before
    public void before(){
        creditCard = new CreditCard("Bobby Jim");
        creditCard.setCreditLimit(100);
        creditCard.setRiskMultiplier(0.01);
    }

    @Test
    public void hasTransactionFee(){
        assertEquals(1,creditCard.getTransactionFee(50),0.001);
    }

    @Test
    public void hasCharges(){
        creditCard.charge(20);
        assertEquals(1,creditCard.countCharges());
    }

    @Test
    public void hasBalance(){
        creditCard.charge(20);
        assertEquals(80.0,creditCard.getCreditLimit(),0.01);
    }




}
