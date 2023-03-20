/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day3;

import java.lang.reflect.Array;

/**
 *
 * @author Admin
 */
public class MyArray<T> {

    T[] list;
    int count;

    public MyArray(Class<T> clazz) {
        this(clazz, 50);
    }

    public MyArray(Class<T> clazz, int size) {
        list = (T[]) Array.newInstance(clazz, size);
        count = 0;
    }

    public void add(T elem) {
        list[count++] = elem;
    }
}

class TestArray extends MyArray<String> {
    public TestArray(){
        super(String.class, 100);
    }
}

class TestArray2<T> extends MyArray<T> {

}
