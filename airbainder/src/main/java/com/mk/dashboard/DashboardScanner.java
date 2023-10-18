package com.mk.dashboard;

import java.util.Scanner;

public class DashboardScanner {
    public int selectElement(){
        Scanner scanner = new Scanner(System.in);
        String elementNumber = "" ;
        do {
            System.out.println("Choose the number of you favourite element to master  ");
            elementNumber = scanner.next();
        } while (!validateInput(elementNumber));
        return Integer.parseInt(elementNumber);
    }

    private boolean validateInput(String input){
        int value ;
        try {
            value = Integer.parseInt(input);
        } catch (Exception e){
            return false;
        }
        if (!((value > 0) && (value <= 4)))
        return false;

        return true;
    };
}
