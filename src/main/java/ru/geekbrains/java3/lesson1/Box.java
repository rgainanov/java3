package ru.geekbrains.java3.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<Fruit> fruits = new ArrayList<>();
    private float boxWeight;

    public Box() {
        this.boxWeight = 0.0f;
    }

    public List<Fruit> getFruits() {
        return fruits;
    }

    private void clearArrayListAndWeightWhenFruitMoved(){
        fruits.clear();
        boxWeight = 0.0f;
    }

    public void addFruit(T fruit) {
        if (!fruit.checkIfIsInTheBox()) {
            fruits.add(fruit);
            boxWeight += fruit.getFruitWeight();
            fruit.putIntoBox();
        } else {
            System.out.println("can't put fruit into the box");
        }
    }

    public float getBoxWeight() {
        return boxWeight;
    }

    public boolean compare(Box<? extends Fruit> another) {
        return Math.abs(this.getBoxWeight() - another.getBoxWeight()) > 0.000001;
    }

    public void moveFruitFromOneBoxToAnother(Box<T> another) {
        for (Fruit f : another.getFruits()) {
            fruits.add(f);
            boxWeight += f.getFruitWeight();
        }
        another.clearArrayListAndWeightWhenFruitMoved();
    }
}
