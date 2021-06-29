package ru.geekbrains.java3.lesson1;

public abstract class Fruit {
    boolean isInTheBox;

    protected abstract void putIntoBox();

    protected abstract boolean checkIfIsInTheBox();

    public abstract Float getFruitWeight();
}
