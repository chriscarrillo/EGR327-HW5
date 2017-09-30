import org.junit.Test;
import java.io.IOException;

public class DealerTest {
    private Dealer dealer = new Dealer();

    @Test
    public void loadDataTest() throws IOException {
        dealer.loadData("https://raw.githubusercontent.com/kyungsooim/TestData/master/data/SeptemberInventory.txt");
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
