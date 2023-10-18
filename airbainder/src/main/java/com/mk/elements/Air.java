package com.mk.elements;

public class Air implements IElement{
    private final String MESSAGE = "Congratualtions now you master the air element";
    @Override
    public void master() {
        System.out.println(MESSAGE);
    }
}
