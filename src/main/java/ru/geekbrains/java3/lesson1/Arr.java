package ru.geekbrains.java3.lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arr<T> {
    private T[] arr;

    public Arr(T... arr) {
        this.arr = arr;
    }

    public void swapArrayElements(int elementOne, int elementTwo) {
        T tmp = arr[elementOne];
        arr[elementOne] = arr[elementTwo];
        arr[elementTwo] = tmp;
    }

    public void printArray() {
        System.out.println(Arrays.toString(arr));
    }

    public List<T> convertArrayToArrayList() {
        List<T> arrayList = new ArrayList<T>();
        for (T arrElement: arr) {
            arrayList.add(arrElement);
        }

        return arrayList;
    }

}
