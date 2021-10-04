import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {

    private DebitCard debitCard;

    @Before
    public void before(){
        debitCard = new DebitCard();
    }

    @Test
    public void hasTransactionFee(){
        assertEquals(1,debitCard.getTransactionFee(50),0.001);
    }

    @Test
    public void hasCharges(){
        debitCard.charge(20);
        assertEquals(1,debitCard.countCharges());
    }
}
