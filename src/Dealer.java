import org.apache.commons.io.*;
import org.apache.commons.lang3.*;

import java.io.*;
import java.util.*;

public class Dealer implements Serializable {
    private static final long serialVersionUID = 2079013919829783322L;
    private Inventory inventory;

    public Dealer() {
        inventory = new Inventory();
    }

    public void loadData(String filePath) throws FileNotFoundException {
        File file = FileUtils.getFile(filePath);
        Scanner data = new Scanner(file);

        while (data.hasNextLine()) {
            String line = data.nextLine();
            String[] fields = line.split(",");
            inventory.add(new Vehicle(fields[0], Integer.parseInt(fields[1]), Integer.parseInt(fields[2]), line.endsWith(",")));
        }
    }

    public void serializeDealer() {
        File file = FileUtils.getFile("dealer.ser");
        byte[] data = SerializationUtils.serialize(inventory);
        try {
            FileUtils.writeByteArrayToFile(file, data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deserializeDealer() {
        File file = FileUtils.getFile("dealer.ser");

        byte[] dataToDeserialize = null;
        try {
            dataToDeserialize = FileUtils.readFileToByteArray(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Inventory deserializedDealer = SerializationUtils.deserialize(dataToDeserialize);
        for (Vehicle v : deserializedDealer.getInventoryList()) {
            v.printVehicleMM();
            System.out.println();
        }
    }
}
