package ru.geekbrains.java3.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<Float> fruits = new ArrayList<Float>();
    private float boxWeight;

    public Box() {
        this.boxWeight = 0.0f;
    }

    public List<Float> getFruits() {
        return fruits;
    }

    private void clearArrayListAndWeightWhenFruitMoved(){
        fruits.clear();
        boxWeight = 0.0f;
    }

    public void addFruit(T fruit) {
        if (fruit.getMyBox() == null) {
            fruit.setMyBox(this);
            fruits.add(fruit.getFruitWeight());
            boxWeight += fruit.getFruitWeight();
        } else if (fruit.getMyBox() == this) {
            System.out.println("fruit is already in this box");
        } else {
            System.out.println("fruit is in another box");
        }
    }

    public float getBoxWeight() {
        return boxWeight;
    }

    public boolean compare(Box<? extends Fruit> another) {
        return (this.getBoxWeight() == another.getBoxWeight());
    }

    public void moveFruitFromOneBoxToAnother(Box<T> another) {
        for (Float f : another.getFruits()) {
            fruits.add(f);
            boxWeight += f;
        }
        another.clearArrayListAndWeightWhenFruitMoved();
    }
}
