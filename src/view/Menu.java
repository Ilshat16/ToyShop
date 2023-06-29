package view;

import view.commands.*;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Command> menuList;

    public Menu(View view) {
        menuList = new ArrayList<>();
        menuList.add(new AddToy(view));
        menuList.add(new GetToy(view));
        menuList.add(new Save(view));
        menuList.add(new Load(view));
        menuList.add(new Finish(view));
    }

    public String showMenu(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Меню выбора команд:");
        stringBuilder.append("\n");
        for (int i = 0; i < menuList.size(); i++) {
            stringBuilder.append(i + 1);
            stringBuilder.append(". ");
            stringBuilder.append(menuList.get(i).description());
            stringBuilder.append("\n");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }

    public void execute(int commandId){
        menuList.get(commandId - 1).execute();
    }
}
