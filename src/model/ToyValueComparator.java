package model;

import java.util.Comparator;

public class ToyValueComparator implements Comparator<Toy> {
    @Override
    public int compare(Toy o1, Toy o2) {
        return o2.getToyValue() - o1.getToyValue();
    }
}
