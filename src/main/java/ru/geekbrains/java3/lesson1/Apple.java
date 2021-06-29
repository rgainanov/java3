package ru.geekbrains.java3.lesson1;

public class Apple extends Fruit{
    public Apple() {
        this.isInTheBox = false;
    }

    @Override
    public void putIntoBox() {
        this.isInTheBox = true;
    }

    @Override
    public boolean checkIfIsInTheBox() {
        return this.isInTheBox;
    }

    @Override
    public Float getFruitWeight() {
        return 1.0f;
    }
}
