package session01_ExceptionAssertion;

import java.util.Scanner;

public class ExceptionOnNumber {
    Scanner sc = new Scanner(System.in);
    
    void doSimple(){
        try{
            System.out.println("Enter a 1st number: ");
            int n = Integer.parseInt(sc.nextLine());
            System.out.println("Enter a 2nd number: ");
            int m = Integer.parseInt(sc.nextLine());
            
            System.out.printf("%d / %d = %d\n", n, m, n / m);
        
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic " + e);
        }
        catch (NumberFormatException e){
            System.out.println("Wrong Number Format Exception " + e);
        }
    }
    void doPipe(){
        try{
            System.out.println("Enter a 1st number: ");
            int n = Integer.parseInt(sc.nextLine());
            System.out.println("Enter a 2nd number: ");
            int m = Integer.parseInt(sc.nextLine());
            
            System.out.printf("%d / %d = %d\n", n, m, n / m);
        
        }
        catch (ArithmeticException | NumberFormatException e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new ExceptionOnNumber().doSimple();
    }
}
