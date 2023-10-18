package com.mk.elements;

public class Instructor {

    //strategy implementation , if you read this , this is my favorite design pattern
    private final IElement selectedElement;

    public Instructor(IElement choice){
        this.selectedElement = choice;
    }

    public void instruct() {
        selectedElement.master();
    }
}
