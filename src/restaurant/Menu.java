package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    public static ArrayList<Object> menuItems = new ArrayList<>();

    public Menu(ArrayList<Object> menuItems) {
        this.menuItems = menuItems;
    }

    public ArrayList<Object> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<Object> menuItems) {
        this.menuItems = menuItems;
    }

    public static void main(String[] args){
        MenuItem burger = new MenuItem(15.99, "A cheesy, sleezy bunch of meat", "entree", new Date());
        System.out.println(burger.getPrice());
        menuItems.add(burger);
        System.out.println(burger.getCategory());

    }
}
