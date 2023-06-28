import model.Service;
import presenter.Presenter;
import view.Console;
import view.View;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        Presenter presenter = new Presenter(service);
        View view = new Console(presenter);
        view.start();
    }
}