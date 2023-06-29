package model;

import java.io.Serializable;
import java.util.PriorityQueue;

public class ToyShop{
    private PriorityQueue<Toy> toyCollection;

    public ToyShop() {
        this.toyCollection = new PriorityQueue<>(new ToyValueComparator());
    }

    public void addToy(Toy toy) {
        this.toyCollection.add(toy);
    }

    public Toy getToy() {
        return this.toyCollection.poll();
    }
}
