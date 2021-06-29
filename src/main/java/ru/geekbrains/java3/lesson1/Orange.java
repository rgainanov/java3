package ru.geekbrains.java3.lesson1;

public class Orange extends Fruit{
    public Orange() {
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
        return 1.5f;
    }
}
