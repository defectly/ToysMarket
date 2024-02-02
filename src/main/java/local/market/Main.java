package local.market;

import java.io.FileWriter;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        market.put(1, 2, "Car");
        market.put(2, 2, "Lego");
        market.put(3, 4, "Dog");
        market.put(4, 5, "House");
        market.put(5, 7, "Plushie");
        market.put(6, 8, "Train");
        market.put(7, 1, "Bunny");
        market.put(8, 3, "Puppy");
        market.put(9, 4, "Human");
        market.put(10, 9, "Plane");

        try(var file = new FileWriter("C:\\Users\\rikar\\Desktop\\result.txt")) {
            for (int i = 0; i < 10; i++) {
                file.write(market.get().toString() + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}