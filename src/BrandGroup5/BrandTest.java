package BrandGroup5;

import java.util.Scanner;

public class BrandTest {
    
    public void menu() throws Exception{
        int option;
        String s;
        //1. Khoi tao Scanner
        Scanner sc = new Scanner(System.in);
        BrandApp ex = new BrandApp();
        
        //2. In ra giao dien menu
        System.out.println("*************************");
        System.out.println("\t+1. Add Brand");
        System.out.println("\t+2. Display Brand");
        System.out.println("\t+3. Exit");
        System.out.println("*************************");

        //3. Cho nguoi dung nhap chon lua
        do {
            System.out.println("Enter your choice [1-4]: ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1:
//                    System.out.println("Add");
                    ex.addNewBrand();
                    break;
                case 2:
//                    System.out.println("Display");
                    ex.displayBrand();
                case 3:
                    System.out.println("Program Exit...");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Your choice is incorrect!");
                    System.exit(0);
            }
            //4. Continue?
            System.out.println("Continue (Y/N)?");
            s = sc.nextLine();
            if (!s.equalsIgnoreCase("y")) {
                break;
            }
        } while (option != 3);
    }

    public static void main(String[] args) throws Exception {
        new BrandTest().menu();
    }
}

