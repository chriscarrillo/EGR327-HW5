import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

public class DealerTest {
    Dealer dealer = new Dealer();

    @Test
    public void loadDataTest() throws FileNotFoundException {
        dealer.loadData("SeptemberInventory.txt");
    }

    @Test
    public void serializeDealerTest() {
        dealer.serializeDealer();
    }

    @Test
    public void deserializeDealerTest() {
        dealer.deserializeDealer();
    }
}
