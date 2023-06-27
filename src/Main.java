import model.Toy;
import model.ToyShop;

public class Main {
    public static void main(String[] args) {
        Toy toy1 = new Toy(22, "car");
        Toy toy2 = new Toy(33, "constructor");
        Toy toy3 = new Toy(5, "console");
        ToyShop toyShop = new ToyShop();
        toyShop.addToy(toy1);
        toyShop.addToy(toy2);
        toyShop.addToy(toy3);
        System.out.println(toyShop.getToy());
        System.out.println(toyShop.getToy());
        System.out.println(toyShop.getToy());
    }
}