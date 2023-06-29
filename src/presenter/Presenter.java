package presenter;

import model.Service;

public class Presenter {
    private Service service;

    public Presenter(Service service) {
        this.service = service;
    }

    public void addToy(int value, String name){
        this.service.addToy(value, name);
    }

    public String getToy(){
        return this.service.getToy();
    }

    public void save(){
        service.save();
    }

    public String load(){
        return service.load();
    }
}
