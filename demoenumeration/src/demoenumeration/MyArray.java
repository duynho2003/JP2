/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoenumeration;

import java.util.Enumeration;

/**
 * The {@code MyArray} class implements a calculation algorithm to add two
 * integers.
 *
 * @author Admin
 * @since JDK8.0
 */
public class MyArray {

    Integer[] elems;
    int count;

    public MyArray(int size) {
        elems = new Integer[size];
        count = 0;
    }

    /**
     * @param n This is the element need to add to array
     */
    public void add(int n) throws ArrayIndexOutOfBoundsException {
        if (count < elems.length) {
            elems[count++] = n;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public MyEnumeration getEnumeration() {
        return new MyEnumeration(elems, count);
    }
}
