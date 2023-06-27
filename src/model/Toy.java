package model;

public class Toy {

    private static int count = 0;
    private int id;
    private String toyName;
    private int toyValue;

    public Toy(int toyValue, String toyName) {
        count++;
        this.id = count;
        this.toyName = toyName;
        this.toyValue = toyValue;
    }

    public int getToyValue() {
        return this.toyValue;
    }


    @Override
    public String toString() {
        return this.id + ": " + this.toyName;
    }
}
