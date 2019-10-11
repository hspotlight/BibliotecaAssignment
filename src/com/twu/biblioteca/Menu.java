package com.twu.biblioteca;

import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menuItems;

    public void setMenu(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public ArrayList<MenuItem> getMenu() {
        return this.menuItems;
    }

    public String selectMenu(String menuName) {
        for (MenuItem menuItem: this.menuItems) {
            if (menuItem.getName().equals(menuName)) {
                return menuName;
            }
        }
        return "Please select a valid option!";
    }

    public void initialMenuItems() {
        ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
        menuItems.add(new MenuItem("List of books"));
        menuItems.add(new MenuItem("Checkout"));
        menuItems.add(new MenuItem("Return"));
        menuItems.add(new MenuItem("Quit"));
        this.setMenu(menuItems);
    }
}
