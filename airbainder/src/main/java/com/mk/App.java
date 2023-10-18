package com.mk;

import com.mk.dashboard.DashboardScanner;
import com.mk.dashboard.Menu;
import com.mk.elements.*;


public class App {
    public static void main(String[] args) {

        Menu.getMenu();

        DashboardScanner dashboardScanner = new DashboardScanner();

        int selectedelement = dashboardScanner.selectElement();

        IElement choosedElement = retrieveSelectedElement(selectedelement);

        System.out.println("Get ready for the Journey , Patience and persistence my man and you will reach the top ");

        try {
            int SLEEP_PERIOD = 6000;
            Thread.sleep(SLEEP_PERIOD);
            Instructor instructor = new Instructor(choosedElement);
            instructor.instruct();
        } catch (InterruptedException e){
            System.out.println("unfortunate you did not make it to the other side");
        }


        //make a loop of scanner for 3 times , every value choose and element and put it inside a stack which we will iterate through it later

    }
    //factory
    public static IElement retrieveSelectedElement(int selectedNumber){
        IElement masterElement;
        switch (selectedNumber) {
            case 1:
                masterElement = new Air();
                break;
            case 2:
                masterElement = new Earth();
                break;
            case 3:
                masterElement = new Fire();
                break;
            case 4:
                masterElement = new Water();
                break;
            default:
                return null;
        }
        return masterElement;
    };
}

