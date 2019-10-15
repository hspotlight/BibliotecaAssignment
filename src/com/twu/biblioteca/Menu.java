package com.twu.biblioteca;

import java.util.ArrayList;

public class Menu {
    private ArrayList<String> menuItems;

    public Menu() {
        this.initialMenuItems();
    }

    public String selectMenu(String menuName) {
        for (String menuItem: this.menuItems) {
            if (menuItem.equals(menuName)) {
                return menuName;
            }
        }
        return "Please select a valid option!";
    }

    public ArrayList<String> getMenu() {
        return this.menuItems;
    }

    private void initialMenuItems() {
        ArrayList<String> menuItems = new ArrayList<String>();
        menuItems.add("List of books");
        menuItems.add("List of movies");
        menuItems.add("Checkout");
        menuItems.add("Return");
        menuItems.add("Quit");
        this.menuItems = menuItems;
    }
}
