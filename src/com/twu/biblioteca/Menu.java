package com.twu.biblioteca;

public class Menu {
    private MenuItem[] menuItems;

    public void setMenu(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public MenuItem[] getMenu() {
        return this.menuItems;
    }

    public String selectMenu(String menuName) {
        for (MenuItem menuItem: this.menuItems) {
            if (menuItem.getName().equals(menuName)) {
                return menuName;
            }
        }
        return "Please select a valid option";
    }
}
