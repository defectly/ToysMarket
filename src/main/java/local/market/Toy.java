package local.market;

public class Toy implements Comparable<Toy> {
    int id;
    String name;
    int chance;

    public Toy(int id, String name, int chance) {
        this.id = id;
        this.name = name;
        this.chance = chance;
    }

    @Override
    public int compareTo(Toy o) {
        return o.chance > this.chance ? 1 : -1;
    }

    @Override
    public String toString() {
        return "id: " + id + " name: " + name + " chance: " + chance;
    }
}
