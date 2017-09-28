import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Dealer dealer = new Dealer();
        dealer.loadData("SeptemberInventory.txt");
        dealer.serializeDealer();
        dealer.deserializeDealer();
    }
}
