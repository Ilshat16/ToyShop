package model;

public class Service {
    private ToyShop toyShop;
    private Savable savable;
    private String fileName;
    private StringBuilder stringBuilder;

    public Service() {
        this.stringBuilder = new StringBuilder();
        this.toyShop = new ToyShop();
        this.savable = new FileHandler();
        this.fileName = "data.txt";
    }

    public void addToy(int value, String name){
        this.toyShop.addToy(new Toy(value, name));
    }

    public String getToy(){
        String toy = toyShop.getToy().toString();
        stringBuilder.append(toy);
        stringBuilder.append("\n");
        return toy;
    }

    public void save(){
        savable.save(fileName, stringBuilder.toString());
    }

    public String load(){
        return savable.upload(fileName);
    }
}