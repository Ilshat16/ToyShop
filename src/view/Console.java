package view;

import presenter.Presenter;

import java.util.Scanner;

public class Console implements View{
    private Presenter presenter;
    private Scanner scanner;
    private boolean work;
    private Menu menu;

    public Console(Presenter presenter) {
        this.presenter = presenter;
        this.scanner = new Scanner(System.in);
        this.work = true;
        this.menu = new Menu(this);
    }

    private void showMenu(){
        System.out.println(menu.showMenu());
    }

    private void execute(){
        System.out.print("Введите номер команды: ");
        int commandId = setNumber();
        try {
            menu.execute(commandId);
        } catch (NullPointerException e) {
            System.out.println("В магазине нет инрушек");
        }
    }

    private int setNumber() {
        boolean string = true;
        int number = 0;
        while (string) {
            try {
                number = Integer.parseInt(scanner.nextLine());
                string = false;
            } catch (NumberFormatException e) {
                System.out.print("Вы ввели не число. Повторите попытку ввода: ");
            }
        }
        return number;
    }

    @Override
    public void start() {
        while (work){
            showMenu();
            execute();
        }
    }

    @Override
    public void finish() {
        work = false;
    }

    @Override
    public void addToy() {
        System.out.print("Введите название игрушки: ");
        String name = scanner.nextLine();
        System.out.print("Введите вес игрушки: ");
        int value = setNumber();
        presenter.addToy(value, name);
    }

    @Override
    public void getToy() {
        System.out.println(presenter.getToy());
    }

    @Override
    public void save() {
        presenter.save();
        System.out.println("Сохранение прошло успешно");
    }


    @Override
    public void load() {
        System.out.println(presenter.load());
    }
}
