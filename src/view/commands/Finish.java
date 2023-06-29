package view.commands;

import view.View;

public class Finish implements Command{
    private View view;

    public Finish(View view) {
        this.view = view;
    }

    @Override
    public String description() {
        return "Закрыть программу";
    }

    @Override
    public void execute() {
        this.view.finish();
    }
}
