package com.mk.elements;

public class Earth implements IElement{
    private final String MESSAGE = "Congratualtions now you master the earth element";
    @Override
    public void master() {
        System.out.println(MESSAGE);
    }
}
