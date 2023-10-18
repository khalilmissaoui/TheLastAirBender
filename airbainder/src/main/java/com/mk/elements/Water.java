package com.mk.elements;

public class Water implements IElement{

    private final String MESSAGE = "Congratualtions now you master the water element";
    @Override
    public void master() {
        System.out.println(MESSAGE);
    }
}
