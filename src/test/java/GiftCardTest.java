import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {

    private GiftCard giftCard;

    @Before
    public void before(){
        giftCard = new GiftCard();
    }

    @Test
    public void hasBalance(){
        giftCard.setBalance(100);
        assertEquals(100, giftCard.getBalance(),0.001);
    }

    @Test
    public void canCharge(){
        giftCard.setBalance(100);
        giftCard.charge(20.0);
        assertEquals(80,giftCard.getBalance(), 0.001);
    }



}
