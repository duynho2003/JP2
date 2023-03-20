package vn.aptech;

import java.util.StringTokenizer;

/**
 *
 * @author Admin
 */

public class DemoString {
    int a = 10;
    final int n = 10;
    
    public static void main(String[] args) {
        // immutable object
        String s1 = "hello";
        String s2 = "world";
        String result = s1 + s2;
        System.out.println(result);
        
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append("world");
        System.out.println(sb.toString());
        
        String s = "I want to go to learn programming";
        StringTokenizer tok = new StringTokenizer(s);
        while (tok.hasMoreElements()){
            System.out.println(tok.nextElement());
        }
    }
}
