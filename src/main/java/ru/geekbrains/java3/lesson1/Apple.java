package ru.geekbrains.java3.lesson1;

public class Apple extends Fruit{
    public Apple() {
        this.isInTheBox = false;
    }

    @Override
    protected void putIntoBox() {
        this.isInTheBox = true;
    }

    @Override
    protected boolean checkIfIsInTheBox() {
        return this.isInTheBox;
    }

    @Override
    public Float getFruitWeight() {
        return 1.0f;
    }
}
