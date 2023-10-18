package com.mk.dashboard;

public class Menu {

    private int selectedElement ;

    public static void getMenu() {
        System.out.println("elements you can master :");
        System.out.println("1 - AIR");
        System.out.println("2 - EARTH");
        System.out.println("3 - FIRE");
        System.out.println("4 - WATER");
    }


    public int getSelectedElement() {
        return selectedElement;
    }

    public void setSelectedElement(int selectedElement) {
        this.selectedElement = selectedElement;
    }



}
