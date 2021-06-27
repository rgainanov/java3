package ru.geekbrains.java3.lesson1;

public abstract class Fruit {
    private Box<?> myBox;

    public Box<?> getMyBox() {
        return myBox;
    }

    public void setMyBox(Box<?> myBox) {
        this.myBox = myBox;
    }

    public abstract Float getFruitWeight();
}
