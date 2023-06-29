package view.commands;

import view.View;

public class AddToy implements Command{
    private View view;
    public AddToy(View view) {
        this.view = view;
    }

    @Override
    public String description() {
        return "Добавить игрущку";
    }

    @Override
    public void execute() {
        this.view.addToy();
    }
}
