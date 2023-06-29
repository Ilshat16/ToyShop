package view.commands;

import view.View;

public class Save implements Command{
    private View view;

    public Save(View view) {
        this.view = view;
    }

    @Override
    public String description() {
        return "Сохранить историю получения игрушек";
    }

    @Override
    public void execute() {
        view.save();
    }
}
