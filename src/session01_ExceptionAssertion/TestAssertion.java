package session01_ExceptionAssertion;

public class TestAssertion {
    public static void main(String[] args) {
        int num = 0;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.println("Enter a positive number: ");
        num = Integer.parseInt(sc.nextLine().trim());
        
        assert num>=0 : num + " is not Positive number!";
        
        System.out.println(num + " is Positive number.");
    }
}
