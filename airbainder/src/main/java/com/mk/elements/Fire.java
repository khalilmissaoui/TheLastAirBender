package com.mk.elements;

public class Fire implements IElement{
    private final String MESSAGE = "Congratualtions now you master the fire element";
    @Override
    public void master() {
        System.out.println(MESSAGE);
    }

}
