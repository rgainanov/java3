package ru.geekbrains.java3.lesson1;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        //task 1
        Arr<String> stringArr = new Arr<>("java", "home", "world", "monitor");
        stringArr.swapArrayElements(0, 3);
        stringArr.printArray();

        Arr<Integer> intArr = new Arr<>(1,2,3,4,5,6);
        intArr.swapArrayElements(2,4);
        intArr.printArray();

        // task 2
        List<String> arrList = stringArr.convertArrayToArrayList();

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();

        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Box<Orange> orangeBox1 = new Box<>();

        orangeBox1.addFruit(orange1);
        orangeBox1.addFruit(orange2);

        appleBox1.addFruit(apple1);
        appleBox1.addFruit(apple2);
        appleBox1.addFruit(apple4);
        appleBox2.addFruit(apple3);

        System.out.println("compare apple box 1 and 2 " + appleBox1.compare(appleBox2));
        System.out.println("compare apple box 1 orange box " + appleBox1.compare(orangeBox1));

        System.out.println("[before move] weight of apple box 1 " + appleBox1.getBoxWeight());
        System.out.println("[before move] weight of apple box 2 " + appleBox2.getBoxWeight());

        appleBox1.moveFruitFromOneBoxToAnother(appleBox2);

        System.out.println("[after move] weight of apple box 1 " + appleBox1.getBoxWeight());
        System.out.println("[after move] weight of apple box 2 " + appleBox2.getBoxWeight());

        System.out.println(appleBox2.getFruits());
        System.out.println(appleBox1.getFruits());
    }
}
