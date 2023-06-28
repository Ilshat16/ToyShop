package model;

public class Service {
    private ToyShop toyShop;

    public Service() {
        this.toyShop = new ToyShop();
    }

    public void addToy(int value, String name){
        this.toyShop.addToy(new Toy(value, name));
    }

    public String getToy(){
        return this.toyShop.getToy().toString();
    }
}
