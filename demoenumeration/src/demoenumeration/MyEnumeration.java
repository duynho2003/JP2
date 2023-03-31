/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoenumeration;

import java.util.Arrays;
import java.util.Enumeration;

/**
 *
 * @author Admin
 */
public class MyEnumeration implements Enumeration<Integer>{
    Integer[] data;
    int travelsal;
    
    public MyEnumeration(Integer[] data, int size){
        this.data = new Integer[size];
        this.data = Arrays.copyOfRange(data, 0, size);
        travelsal = 0;
    }
   
    @Override
    public boolean hasMoreElements() {
        return travelsal < data.length;
    }

    @Override
    public Integer nextElement() {
        return data[travelsal++];
    }
    
}
