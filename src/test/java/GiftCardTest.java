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
        assertEquals(100, giftCard.getBalance());
    }



}
