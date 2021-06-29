package ru.geekbrains.java3.lesson1;

public class Orange extends Fruit{

    public Orange() {
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
        return 1.5f;
    }
}
