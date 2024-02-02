package local.market;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

public class Market {
    public PriorityQueue<Toy> toys = new PriorityQueue<Toy>();
    public void put(int id, int chance, String name) {
        toys.add(new Toy(id, name, chance));
    }

    public Toy get() {
        return toys.poll();
    }
}
