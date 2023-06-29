package view.commands;

import view.View;

public class Load implements Command{
    private View view;

    public Load(View view) {
        this.view = view;
    }

    @Override
    public String description() {
        return "Открыть историю получения игрушек";
    }

    @Override
    public void execute() {
        view.load();
    }
}
