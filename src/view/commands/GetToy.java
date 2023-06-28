package view.commands;

import view.View;

public class GetToy implements Command{
    private View view;

    public GetToy(View view) {
        this.view = view;
    }

    @Override
    public String description() {
        return "Получить игрушку";
    }

    @Override
    public void execute() {
        this.view.getToy();
    }
}
