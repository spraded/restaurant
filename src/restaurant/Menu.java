package restaurant;

import java.util.ArrayList;

public class Menu {

    private ArrayList<Object> menuItems;

    public Menu(ArrayList<Object> menuItems) {
        this.menuItems = menuItems;
    }

    public ArrayList<Object> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<Object> menuItems) {
        this.menuItems = menuItems;
    }
}
